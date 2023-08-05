grammar Rice;

// Lexer rules
BOWL : '-'? DIGIT+ ;
GRAIN : '"' ~["]* '"' ;

// Parser rules
program : 'Rice' '{' cookMainMethod '}' ;

cookMainMethod : 'Cook' 'main' '(' ')' block ;

block : '{' statement* '}' ;

statement : eatPrintStatement
          | variableDeclaration
          ;

eatPrintStatement : 'Eat' '.' 'print' '(' expression ')' ';' ;

variableDeclaration : dataType ID '=' expression ';' ;

dataType : 'bowl' | 'grain' ;

expression : BOWL
           | GRAIN
           | ID
           | expression '*' expression
           | expression '/' expression
           | expression '+' expression
           | expression '-' expression
           | '(' expression ')'
           ;


// Lexer rules
fragment DIGIT : [0-9] ;
ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
