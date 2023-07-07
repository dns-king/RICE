grammar Rice;

// Lexer rules
BOWL : '-'? DIGIT+ ;
GRAIN : '"' ~["]* '"' ;

// Parser rules
program : 'Rice' '{' cookMainMethod '}' ;

cookMainMethod : 'Cook' 'main' '(' 'grain' '[' ']' ID ')' block ;

block : '{' statement* '}' ;

statement : ifStatement ;

ifStatement : 'if' '(' expression ')' block ;

expression : BOWL
           | GRAIN
           | ID
           | expression '*' expression
           | expression '/' expression
           | expression '+' expression
           | expression '-' expression
           | '(' expression ')'
           | eatPrint '(' expression ')' ';'
           ;

eatPrint : 'Eat' '.' 'print' ;

// Other rules and productions can be added as needed

// Lexer rules
fragment DIGIT : [0-9] ;
ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
