sed -e '/TEST/d' $1 > aux.c

sed -e 's/\<VAR\>/var/' aux.c > corrected.c
sed -e 's/\<FUNC\>/func/' corrected.c > aux.c
sed -e 's/\<INT\>/int/' aux.c > corrected.c
sed -e 's/\<CHAR\>/char/' corrected.c > aux.c
sed -e 's/\<FLOAT\>/float/' aux.c > corrected.c
sed -e 's/\<LONG\>/long/' corrected.c > aux.c
sed -e 's/\<ENUM\>/enum/' aux.c > corrected.c
sed -e 's/\<STRUCT\>/struct/' corrected.c > aux.c
sed -e 's/\<UNION\>/union/' aux.c > corrected.c
sed -e 's/\<TYPEDEF\>/typedef/' corrected.c > aux.c

sed -e 's/\<FOR\>/for/' aux.c > corrected.c
sed -e 's/\<WHILE\>/while/' corrected.c > aux.c
sed -e 's/\<IF\>/if/' aux.c > corrected.c
sed -e 's/\<ELSE\>/else/' corrected.c > aux.c
sed -e 's/\<SWITCH\>/switch/' aux.c > corrected.c
sed -e 's/\<CASE\>/case/' corrected.c > aux.c
sed -e 's/\<BREAK\>/break/' aux.c > corrected.c
sed -e 's/\<CONTINUE\>/continue/' corrected.c > aux.c
sed -e 's/\<RETURN\>/return/' aux.c > corrected.c
sed -e 's/\<GOTO\>/goto/' corrected.c > aux.c

rm -f aux.c

set -x
flex -i -o scanner.c scanner.l
gcc -g -o scanner_full scanner_full.c scanner.c
./scanner_test < corrected.c > tokens.txt

sed -n '/\<T_ID\>|\<T_STR\>|\<T_NUM\>/p' tokens.txt > selected.txt
