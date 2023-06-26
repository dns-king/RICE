grammar Rice;

start
:
	'hello' 'world'
;

WS
:
	[ \t\r\n]+ -> skip
;