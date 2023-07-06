grammar Rice;

program: riceBlock serveStmt;

riceBlock: 'Rice' cookBlock;

cookBlock: 'Cook' '{' statement* '}';

statement: declarationStmt | assignmentStmt | printStmt;

declarationStmt: 'Bowl' ID '=' INT declarationStmtTail?
              | 'Grain' ID '=' STRING declarationStmtTail?;

declarationStmtTail: ',' declarationStmt;

assignmentStmt: ID '=' expr;

printStmt: 'Eat.print' '(' expr ')';

expr: term addExpr*;

addExpr: addOp term;

term: factor mulExpr*;

mulExpr: mulOp factor;

factor: ID
      | INT
      | STRING
      | '(' expr ')';

addOp: '+' | '-';

mulOp: '*';

serveStmt: 'Serve';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

INT: [0-9]+;

STRING: '"' (~["])* '"';
