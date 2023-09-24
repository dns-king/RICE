grammar Rice;

// Define the structure of a Rice program
program: 'Rice' codeBlock;

// Code block
codeBlock: '{' mainMethod '}';

// Main method declaration
mainMethod: 'Cook' 'main' '(' ')' block;

// Code block
block: '{' statement* '}';

// Statements
statement: block | variableDeclaration | assignmentStatement | expressionStatement | printStatement;

// Variable declaration
variableDeclaration: dataType ID '=' expression ';';

// Assignment statement
assignmentStatement: ID '=' expression ';';

// Expression statement
expressionStatement: expression ';';

// Print statement
printStatement: 'Eat' '.' 'print' '(' expression ')' ';';

// Expression
expression: primary ( ( '*' | '/' | '+' | '-' ) primary)*;

// Primary expressions (for simplicity, we use ID and literals)
primary: ID | INT_LITERAL | STRING_LITERAL | BOOL_LITERAL;

// Literal values
INT_LITERAL: [0-9]+;
STRING_LITERAL: '"' ~[\r\n"]* '"';
BOOL_LITERAL: 'true' | 'false';

// Identifier (variable names)
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

// Data types (bowl, grain, and nice)
dataType: 'bowl' | 'grain' | 'nice';

// Whitespace and comments
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
