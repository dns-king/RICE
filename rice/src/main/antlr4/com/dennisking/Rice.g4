grammar Rice;

//grammar name should always match the file name!

// Lexer rules
ID: [a-zA-Z]+;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip; // Skips whitespace

// Parser rules
program: statement*;
statement: assignment | print;
assignment: ID '=' expression ';';
print: 'print' expression ';';
expression: additiveExpression;
additiveExpression:
	multiplicativeExpression (
		('+' | '-') multiplicativeExpression
	)*;
multiplicativeExpression: atom ( ('*' | '/') atom)*;
atom: ID | NUMBER | '(' expression ')';

