grammar Rice;

program             : statement* ;
statement           : assignmentStatement | varDeclaration | printStatement ;
assignmentStatement : ID '=' expression ';' ;
varDeclaration      : 'var' ID '=' expression ';' ;
printStatement      : 'print' expression ';' ;

expression          : term ( ( '+' | '-' ) term )* ;
term                : NUMBER | STRING | ID ;

ID                  : [a-zA-Z]+ ;
NUMBER              : [0-9]+ ;
STRING              : '"' .*? '"' ;
VAR                 : 'var' ;
PRINT               : 'print' ;
WS                  : [ \t\r\n]+ -> skip ;
