package com.compiladores;

public class GrammarLab03Visitor {
    public Integer visitRoot(GrammarLab03Parser.RootContext ctx)
    {
        Integer val = visit(ctx.expr(0)) + visit(ctx.expr(1));
        System.out.println(ctx.ADD().getText() + val);
        return 0;
    }
    public Integer visitExprSum(GrammarLab03Parser.ExprSumContext ctx)
    {
        return visit(ctx.expr(0)) + visit(ctx.expr(1));
    }
    public Integer visitExprNum(GrammarLab03Parser.ExprNumContext ctx)
    {
        return Integer.valueOf(ctx.NUM().getText());
    }
}
