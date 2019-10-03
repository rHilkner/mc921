import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MyAddVisitor extends GrammarLab03BaseVisitor<String> {

    private Map<String, String> typeVarMap = new HashMap<>();
    private Map<String, Integer> funcArgsCount = new HashMap<>();
    private List<String> funcVars = new ArrayList<>();

    private final String VAR = "var";
    private final String FUNC = "func";

    private AtomicInteger tempVarCount = new AtomicInteger(1);

    @Override
    public String visitRoot(GrammarLab03Parser.RootContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitVar(GrammarLab03Parser.VarContext ctx) {
        String varToken = ctx.ID().getText();
        if (typeVarMap.containsKey(varToken)) {
            System.out.println("Symbol already declared: " + varToken);
            return "ERROR 84";
        }
        typeVarMap.put(varToken, VAR);

        if (ctx.expr().children.size() == 1) {
            System.out.println("@" + varToken + " = global i32 " + visit(ctx.expr()) + ";");
        } else {
            String funcName = "f" + tempVarCount.getAndIncrement();
            System.out.println("define i32 @" + funcName + "(" + ") {");
            visit(ctx.expr());
            System.out.println("ret i32 %v" + (tempVarCount.get()-1));
            System.out.println("}");
            System.out.println("@" + varToken + " = call i32 @" + funcName + "(" + ")");
        }
        return null;
    }

    @Override
    public String visitFunc(GrammarLab03Parser.FuncContext ctx) {
        String funcToken = ctx.ID(0).getText();
        if (typeVarMap.containsKey(funcToken)) {
            System.out.println("Symbol already declared: " + funcToken);
            return "ERROR 85";
        }
        typeVarMap.put(funcToken, FUNC);
        for (int i = 1; i < ctx.ID().size(); i++) {
            String idToken = ctx.ID(i).getText();
            funcVars.add(idToken);
//            if (!typeVarMap.containsKey(idToken)) {
//                System.out.println("Symbol undeclared: " + idToken);
//                return 1;
//            }
        }
        funcArgsCount.put(funcToken, ctx.ID().size() - 1);
//        System.out.println("Teste1: " + ctx);
//        System.out.println("Teste2: " + ctx.expr());

        System.out.println("define i32 @" + funcToken + "(" + this.listToParams(funcVars) + ") {");
        visit(ctx.expr());
        System.out.println("ret i32 %v" + (tempVarCount.get()-1));
        System.out.println("}");
        funcVars.clear();
        return null;
    }

    @Override
    public String visitExprId(GrammarLab03Parser.ExprIdContext ctx) {
        String idToken = ctx.ID().getText();
        if (typeVarMap.getOrDefault(idToken, VAR).equals(FUNC) && !funcVars.contains(idToken)) {
            System.out.println("Bad used symbol: " + idToken);
        }
        if (!typeVarMap.containsKey(idToken) && !funcVars.contains(idToken)) {
            System.out.println("Symbol undeclared: " + idToken);
        }
        if (typeVarMap.containsKey(idToken)) {
            return "@" + idToken;
        } else {
            return  "%" + idToken;
        }
    }

    @Override
    public String visitExprSpaceBoth(GrammarLab03Parser.ExprSpaceBothContext ctx) {
        return visit(ctx.children.get(1));
    }

    @Override
    public String visitExprSpaceRight(GrammarLab03Parser.ExprSpaceRightContext ctx) {
        return visit(ctx.children.get(0));
    }

    @Override
    public String visitExprSpaceLeft(GrammarLab03Parser.ExprSpaceLeftContext ctx) {
        return visit(ctx.children.get(1));
    }

    @Override
    public String visitExprFuncCall(GrammarLab03Parser.ExprFuncCallContext ctx) {
        String funcToken = ctx.ID(0).getText();
        if (!typeVarMap.containsKey(funcToken)) {
            System.out.println("Symbol undeclared: " + funcToken);
            return "ERROR 87";
        }

        if (typeVarMap.get(funcToken).equals(VAR)) {
            System.out.println("Bad used symbol: " + funcToken);
            return "ERROR 88";
        }

        int funcArgsCount = 0;
        if (ctx.ID() != null) {
            funcArgsCount += ctx.ID().size() - 1;
        }

        if (ctx.NUM() != null) {
            funcArgsCount += ctx.NUM().size();
        }

//        if (this.funcArgsCount.get(funcToken) != null && this.funcArgsCount.get(funcToken) != funcArgsCount) {
//            System.out.println("Bad argument count: " + funcToken);
//            return "ERROR 89";
//        }

        List<String> funcArguments = new ArrayList<>();
        List<String> funcCallChildren = ctx.children.stream().map(x -> x.getText()).filter(x -> !x.contains("(") && !x.contains(")") && !x.contains(",")).collect(Collectors.toList());
        for (int i = 1; i < funcCallChildren.size(); i++) {
            String idToken = funcCallChildren.get(i);

//            if (!typeVarMap.containsKey(idToken) && !funcVars.contains(idToken)) {
//                System.out.println("Symbol undeclared: " + idToken);
//                return "ERROR 90";
//            }
//
//            if (FUNC.equals(typeVarMap.get(idToken))) {
//                System.out.println("Bad used symbol: " + idToken);
//                return "ERROR 91";
//            }
            funcArguments.add(idToken);

        }

        String tempVar = "%v" + this.tempVarCount.getAndIncrement();
        System.out.println(tempVar + " = call i32 @" + funcToken + "(" + this.listToParams(funcArguments) + ")");
        return tempVar;
    }

    @Override
    public String visitExprNum(GrammarLab03Parser.ExprNumContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public String visitExprDiv(GrammarLab03Parser.ExprDivContext ctx) {
        if (ctx != null && ctx.expr() != null) {
            String v1 = visit(ctx.expr(0));
            String v2 = visit(ctx.expr(1));
            if (v1 != null && v2 != null) {
                int tempVar = tempVarCount.getAndIncrement();
                System.out.println("%v" + tempVar + " = div i32 " + v1 + ", " + v2);
                return "%v" + tempVar;
            } else {
                return "ERROR 93";
            }
        } else {
            return "ERROR 94";
        }
    }

    @Override
    public String visitExprMult(GrammarLab03Parser.ExprMultContext ctx) {
        if (ctx != null && ctx.expr() != null) {
            String v1 = visit(ctx.expr(0));
            String v2 = visit(ctx.expr(1));
            if (v1 != null && v2 != null) {
                int tempVar = tempVarCount.getAndIncrement();
                System.out.println("%v" + tempVar + " = mul i32 " + v1 + ", " + v2);
                return "%v" + tempVar;
            } else {
                return "ERROR 95";
            }
        } else {
            return "ERROR 96";
        }
    }

    @Override
    public String visitExprSum(GrammarLab03Parser.ExprSumContext ctx) {
        if (ctx != null && ctx.expr() != null) {
            String v1 = visit(ctx.expr(0));
            String v2 = visit(ctx.expr(1));
            if (v1 != null && v2 != null) {
                int tempVar = tempVarCount.getAndIncrement();
                System.out.println("%v" + tempVar + " = add i32 " + v1 + ", " + v2);
                return "%v" + tempVar;
            } else {
                return "ERROR 97";
            }
        } else {
            return "ERROR 98";
        }
    }

    @Override
    public String visitExprSub(GrammarLab03Parser.ExprSubContext ctx) {
        if (ctx != null && ctx.expr() != null) {
            String v1 = visit(ctx.expr(0));
            String v2 = visit(ctx.expr(1));
            if (v1 != null && v2 != null) {
                int tempVar = tempVarCount.getAndIncrement();
                System.out.println("%v" + tempVar + " = sub i32 " + v1 + ", " + v2);
                return "%v" + tempVar;
            } else {
                return "ERROR 99";
            }
        } else {
            return "ERROR 100";
        }
    }

    @Override
    public String visitExprParenthesis(GrammarLab03Parser.ExprParenthesisContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExprParenthesisSpaceLeft(GrammarLab03Parser.ExprParenthesisSpaceLeftContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExprParenthesisSpaceRight(GrammarLab03Parser.ExprParenthesisSpaceRightContext ctx) {
        return visit(ctx.children.get(1));
    }

    @Override
    public String visitExprParenthesisSpaceBoth(GrammarLab03Parser.ExprParenthesisSpaceBothContext ctx) {
        return visitChildren(ctx);
    }

    private String listToParams(List<String> l) {
        if (l == null || l.isEmpty()) {
            return "";
        }

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < l.size(); i++) {
            String token = l.get(i);
            if (!token.matches("\\d+")) {
                if (typeVarMap.containsKey(token)) {
                    token = "@" + token;
                } else {
                    token = "%" + token;
                }
            }
            strBuilder = strBuilder.append("i32 " + token);
            if (i < l.size() - 1) {
                strBuilder = strBuilder.append(", ");
            }
        }
        return strBuilder.toString();
    }
}
