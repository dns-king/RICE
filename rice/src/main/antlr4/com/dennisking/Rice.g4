grammar Rice;

// Define the start rule for the language
start : riceProgram;

// Define a Rice program
riceProgram : 'Rice' '{' cookCodeBlock '}' 'Serve;';

// Define the Cook code block
cookCodeBlock : 'Cook' '{' riceCodeBlock '}';

// Define the rice code block
riceCodeBlock : statement*;

// Define a statement
statement : assignmentStatement
          | expressionStatement
          | // Other possible statements
          ;

// Define an assignment statement
assignmentStatement : variableName '=' expression ';';

// Define an expression statement
expressionStatement : expression ';';

// Define expressions
expression : additiveExpression;

additiveExpression : multiplicativeExpression
                   | additiveExpression '+' multiplicativeExpression
                   | additiveExpression '-' multiplicativeExpression
                   ;

multiplicativeExpression : primaryExpression
                         | multiplicativeExpression '*' primaryExpression
                         | multiplicativeExpression '/' primaryExpression
                         ;

primaryExpression : literal
                  | variableName
                  | '(' expression ')'
                  ;

// Define literals
literal : STRING
        | INTEGER
        ;

// Define data types
STRING : 'grain' '"' (~["\r\n] | '""')* '"';
INTEGER : 'bowl' [0-9]+;

// Define identifiers
variableName : [a-z][a-zA-Z0-9]*;

// Define other language constructs, keywords, and operators

// Define the print statement
PRINT : 'Eat.print';

