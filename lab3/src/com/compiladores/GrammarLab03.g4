grammar GrammarLab03;

func: 'func' ID *'('ID?(','ID)*')'expr';';

expr: expr '+' expr         # ExprSum
    | expr '-' expr         # ExprSub
    | expr '*' expr         # ExprMult
    | expr '/' expr         # ExprDiv
    | ID(expr?(','expr)*)   # ExprFunc
    | NUM                   # ExprNum
    | ID                    # ExprId
    ;
var: 'var' ID '=' expr ';';

ID : [a-zA-Z_][a-zA-Z0-9_]*;
NUM : [0-9]+;
ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
