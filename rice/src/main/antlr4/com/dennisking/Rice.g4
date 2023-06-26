grammar Rice;

// Lexer rules
// Add lexer rules for identifiers, literals, operators, etc.

// Parser rules
program: 'Rice' codeBlock;

codeBlock: '{' statement* '}';

statement: variableDeclaration
         | assignmentStatement
         | printStatement
         | codeSnippet
         ;

variableDeclaration: type Identifier '=' expression ';';

assignmentStatement: Identifier '=' expression ';';

printStatement: 'print' '(' expression ')' ';';

expression: additiveExpression;

additiveExpression: multiplicativeExpression ( ('+' | '-') multiplicativeExpression)*;

multiplicativeExpression: primaryExpression (('*' | '/') primaryExpression)*;

primaryExpression: Identifier
                | Number
                | String
                | '(' expression ')'
                ;

codeSnippet: 'snippet' CodeBlock;

type: 'int'
    | 'string'
    ;

// Define lexer and parser rules for identifiers, literals, operators, etc.
