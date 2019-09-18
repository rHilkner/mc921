grammar GrammarLab03;

root: func | var;

func: 'func ' ID '(' ID? (','ID)*') ' expr ';\n';

expr: ID(expr?(','expr)*)       # ExprFunc
    | expr ' * ' expr           # ExprMult
    | expr ' / ' expr           # ExprDiv
    | expr ' + ' expr           # ExprSum
    | expr ' - ' expr           # ExprSub
    | NUM                       # ExprNum
    | ID                        # ExprId
    ;

var: 'var ' ID ' = ' expr ';\n';

ID : [a-zA-Z_][a-zA-Z0-9_]*;
NUM : [0-9]+;
ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
