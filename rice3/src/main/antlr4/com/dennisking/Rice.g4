grammar Rice;

// Lexer rules
WS : [ \t\r\n]+ -> skip;

// Keywords
RICE : 'rice';
COOK : 'cook';
SERVE : 'serve';
EAT : 'eat';
WITH : 'with';
AND : 'and';
PRINT : 'print';

// Parser rules
program : RICE code_block EOF;

code_block : '{' statement* '}';

statement : cook_statement | serve_statement | eat_statement ;

cook_statement : COOK ';';
serve_statement : SERVE expression (WITH expression (AND expression)*)? ';';
eat_statement : EAT (expression | print_statement)? ';';
print_statement : PRINT expression ';';


expression : additive_expression;
additive_expression : multiplicative_expression ( (PLUS | MINUS) multiplicative_expression)*;
multiplicative_expression : unary_expression ( (MULT | DIV) unary_expression)*;
unary_expression : (PLUS | MINUS)? primary_expression;
primary_expression : INTEGER | STRING | IDENTIFIER;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]*;
INTEGER : [0-9]+;
STRING : '"' ~["\r\n]* '"';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
