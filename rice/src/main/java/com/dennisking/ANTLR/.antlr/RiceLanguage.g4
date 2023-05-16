grammar RiceLanguage;

// Lexer rules
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;

// Parser rule
expression : INT '+' INT ;