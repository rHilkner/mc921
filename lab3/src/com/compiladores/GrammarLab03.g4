grammar GrammarLab03;

root: func | var ';\n';

func: 'func ' ID '(' ID?(', 'ID)*') ' expr;

expr: expr ' '?'*'' '? expr           # ExprMult
    | expr ' '?'/'' '? expr           # ExprDiv
    | expr ' '?'+'' '? expr           # ExprSum
    | expr ' '?'-'' '? expr           # ExprSub
    | '('expr')'                # ExprParenthesis
    | ID '(' ID ') '  # ExprFuncCall
    | NUM                       # ExprNum
    | ID                        # ExprId
    ;

var: 'var ' ID ' = ' expr;

ID : [a-zA-Z_][a-zA-Z0-9_]*;
NUM : [0-9]+;
ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
