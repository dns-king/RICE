grammar Language;

start
:
	'hello' 'world'
;

WS
:
	[ \t\r\n]+ -> skip
;