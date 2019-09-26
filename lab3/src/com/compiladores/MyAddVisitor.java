import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyAddVisitor extends GrammarLab03BaseVisitor<Integer> {

    private Map<String, String> typeVarMap = new HashMap<>();
    private Map<String, Integer> funcArgsMap = new HashMap<>();
    private List<String> funcVars = new ArrayList<>();

    private final String VAR = "var";
    private final String FUNC = "func";

    @Override
    public Integer visitRoot(GrammarLab03Parser.RootContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitVar(GrammarLab03Parser.VarContext ctx) {
        String varToken = ctx.ID().getText();
        if (typeVarMap.containsKey(varToken)) {
            System.out.println("Symbol already declared: " + varToken);
            return 1;
        }
        typeVarMap.put(varToken, VAR);
        return visit(ctx.expr());
    }

    @Override
    public Integer visitFunc(GrammarLab03Parser.FuncContext ctx) {
        String funcToken = ctx.ID(0).getText();
        if (typeVarMap.containsKey(funcToken)) {
            System.out.println("Symbol already declared: " + funcToken);
            return 1;
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
        funcArgsMap.put(funcToken, ctx.ID().size() - 1);
//        System.out.println("Teste1: " + ctx);
//        System.out.println("Teste2: " + ctx.expr());

        visit(ctx.expr());
        funcVars.clear();
        return 1;
    }

    @Override
    public Integer visitExprId(GrammarLab03Parser.ExprIdContext ctx) {
        String idToken = ctx.ID().getText();
        if (typeVarMap.getOrDefault(idToken, VAR).equals(FUNC) && !funcVars.contains(idToken)) {
            System.out.println("Bad used symbol: " + idToken);
        }
        if (!typeVarMap.containsKey(idToken) && !funcVars.contains(idToken)) {
            System.out.println("Symbol undeclared: " + idToken);
        }
        return 1;
    }

    @Override
    public Integer visitExprFuncCall(GrammarLab03Parser.ExprFuncCallContext ctx) {
        String funcToken = ctx.ID(0).getText();
        if (!typeVarMap.containsKey(funcToken)) {
            System.out.println("Symbol undeclared: " + funcToken);
            return 1;
        }

        if (typeVarMap.get(funcToken).equals(VAR)) {
            System.out.println("Bad used symbol: " + funcToken);
            return 1;
        }

        int funcArgsCount = 0;
        if (ctx.ID() != null) {
            funcArgsCount += ctx.ID().size() - 1;
        }

        if (ctx.NUM() != null) {
            funcArgsCount += ctx.NUM().size();
        }

        if (funcArgsMap.get(funcToken) != null && funcArgsMap.get(funcToken) != funcArgsCount) {
            System.out.println("Bad argument count: " + funcToken);
            return 1;
        }


        for (int i = 1; i < ctx.ID().size(); i++) {
            String idToken = ctx.ID(i).getText();

            if (!typeVarMap.containsKey(idToken) && !funcVars.contains(idToken)) {
                System.out.println("Symbol undeclared: " + idToken);
                return 1;
            }

            if (FUNC.equals(typeVarMap.get(idToken))) {
                System.out.println("Bad used symbol: " + idToken);
                return 1;
            }
        }

        return 1;
    }

    @Override
    public Integer visitExprNum(GrammarLab03Parser.ExprNumContext ctx) {
        return Integer.valueOf(ctx.NUM().getText());
    }

    @Override
    public Integer visitExprDiv(GrammarLab03Parser.ExprDivContext ctx) {
        if (ctx != null && ctx.expr() != null) {
            Integer v1 = visit(ctx.expr(0));
            Integer v2 = visit(ctx.expr(1));
            if (v1 != null && v2 != null && v2 != 0) {
                return v1 / v2;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @Override
    public Integer visitExprMult(GrammarLab03Parser.ExprMultContext ctx) {
        if (ctx != null && ctx.expr() != null) {
            Integer v1 = visit(ctx.expr(0));
            Integer v2 = visit(ctx.expr(1));
            if (v1 != null && v2 != null) {
                return v1 * v2;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @Override
    public Integer visitExprSum(GrammarLab03Parser.ExprSumContext ctx) {
        if (ctx != null && ctx.expr() != null) {
            Integer v1 = visit(ctx.expr(0));
            Integer v2 = visit(ctx.expr(1));
            if (v1 != null && v2 != null) {
                return v1 + v2;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @Override
    public Integer visitExprSub(GrammarLab03Parser.ExprSubContext ctx) {
        if (ctx != null && ctx.expr() != null) {
            Integer v1 = visit(ctx.expr(0));
            Integer v2 = visit(ctx.expr(1));
            if (v1 != null && v2 != null) {
                return v1 - v2;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @Override
    public Integer visitExprParenthesis(GrammarLab03Parser.ExprParenthesisContext ctx) {
        return visitChildren(ctx);
    }
}
