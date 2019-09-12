#include "token.h"
#include <stdio.h>
#include <stdlib.h>

extern int yylex();

char *yytext;

int yyerror(char *s) {
    printf("ERROR yy\n");
    (void)s;
    return 0;
}

int main() {
    char format[] = "%s %s\n";
    enum token_id code;
    int line_count = 1;

    do {
        code = yylex();
        switch(code) {
            case T_ERROR:
                printf("T_ERROR line %d\n", line_count);
                exit(1);
            case T_EOF:
                printf("%s\n", token_str[code]);
                break;
            case T_LINE_BREAK:
                line_count++;
                break;
            default:
                printf("%s %s\n", token_str[code], yytext);
                break;
        }
    } while (code != T_EOF);

    printf("lines:%d\n", line_count);

    return 0;
}
