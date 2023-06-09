grammar RiceLanguage;

// Lexer rules
NUMBER : [0-9]+;
ADDITION : '+';
SUBTRACT : '-';
LETTERS : [a-zA-Z]+; 

// Keywords
RICE : 'rice';
COOK : 'cook';
TASTE : 'taste';

// Parser rules
expression : term ((ADDITION | SUBTRACT) term)* ;
term : NUMBER+ ;

// Ignore white spaces
WS : [ \t\r\n]+ -> skip ;
