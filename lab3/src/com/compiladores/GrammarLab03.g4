grammar GrammarLab03;

root: ((func | var) ';\n')+;

func: 'func ' ID ('('|' (') ID?(', 'ID)*') ' expr;

var: 'var ' ID ' = ' expr;

expr: expr '*' expr                                 # ExprMult
    | expr '/' expr                                 # ExprDiv
    | expr '+' expr                                 # ExprSum
    | expr '-' expr                                 # ExprSub
    | '('expr')'                                    # ExprParenthesis
    | ' ('expr')'                                   # ExprParenthesisSpaceLeft
    | '('expr') '                                   # ExprParenthesisSpaceRight
    | ' ('expr') '                                  # ExprParenthesisSpaceBoth
    | ' 'expr' '                                    # ExprSpaceBoth
    | expr' '                                       # ExprSpaceRight
    | ' 'expr                                       # ExprSpaceLeft
    | ID ('('|' (') (ID | NUM)? ((', '|',') (ID | NUM))* (')'|') ')     # ExprFuncCall
    | NUM                                           # ExprNum
    | ID                                            # ExprId
    ;

ID : [a-zA-Z_][a-zA-Z0-9_]*;
NUM : [0-9]+;
ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
