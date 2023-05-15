grammar RiceLanguage;

start
:
	'hello' 'world'
;

WS
:
	[ \t\r\n]+ -> skip
;