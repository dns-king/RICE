grammar RiceLanguage;

// grammar name should always match the file name

// Lexer rules
NUMBER : [0-9]+;
OPERATOR : '+' | '-';
LETTERS : [a-zA-Z]+; 

// Keywords
RICE : 'rice';
COOK : 'cook';
TASTE : 'taste';

// Parser rules

// Ignore white spaces
WS : [ \t\r\n]+ -> skip ;
