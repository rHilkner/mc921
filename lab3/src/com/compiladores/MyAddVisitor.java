package com.compiladores;

public class MyAddVisitor extends GrammarLab03BaseVisitor<Integer> {
//    @Override
//    public Integer visitRoot(GrammarLab03Parser.RootContext ctx)
//    {
//        Integer val = visit(ctx.expr(0)) + visit(ctx.expr(1));
//        System.out.println(ctx.ADD().getText() + val);
//        return 0;
//    }
//    @Override
//    public Integer visitExprSum(GrammarLab03Parser.ExprSumContext ctx)
//    {
//        return visit(ctx.expr(0)) + visit(ctx.expr(1));
//    }
//    @Override
//    public Integer visitExprNum(GrammarLab03Parser.ExprNumContext ctx)
//    {
//        return Integer.valueOf(ctx.NUM().getText());
//    }


    @Override public Integer visitRoot(GrammarLab03Parser.RootContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitFunc(GrammarLab03Parser.FuncContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitExprNum(GrammarLab03Parser.ExprNumContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitExprMult(GrammarLab03Parser.ExprMultContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitExprFuncCall(GrammarLab03Parser.ExprFuncCallContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitExprSum(GrammarLab03Parser.ExprSumContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitExprSub(GrammarLab03Parser.ExprSubContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitExprParenthesis(GrammarLab03Parser.ExprParenthesisContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitExprId(GrammarLab03Parser.ExprIdContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitExprDiv(GrammarLab03Parser.ExprDivContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitVar(GrammarLab03Parser.VarContext ctx) { return visitChildren(ctx); }
}
