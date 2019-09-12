package com.compiladores;

/**
 * Created by rodrigohilkner on Sep, 2019
 */
public class GrammarLab03Parser {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);
        // create a lexer that feeds off of input CharStream
        GrammarLab03Lexer lexer = new GrammarLab03Lexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        GrammarLab03Parser parser = new GrammarLab03Parser(tokens);
        ParseTree tree = parser.root(); // begin parsing at prog rule
        AddVisitor vis = new AddVisitor();
        vis.visit(tree);
    }
}
