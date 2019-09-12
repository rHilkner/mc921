package com.compiladores;

public class GrammarLab03Visitor {
    public Integer visitRoot(SummerParser.RootContext ctx)
    {
        Integer val = visit(ctx.expr(0)) + visit(ctx.expr(1));
        System.out.println(ctx.ADD().getText() + val);
        return 0;
    }
    public Integer visitExprSum(SummerParser.ExprSumContext ctx)
    {
        return visit(ctx.expr(0)) + visit(ctx.expr(1));
    }
    public Integer visitExprNum(SummerParser.ExprNumContext ctx)
    {
        return Integer.valueOf(ctx.NUM().getText());
    }
}
