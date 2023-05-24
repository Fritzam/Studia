;/Napisz program, który wyświetli na terminalu literkę ‘A’ oraz ‘g’.

org 100h   

MOV AH, 02h ;/
MOV DL, 'A' ;/-Wydruk literki 'A'
INT 21h		;/(definiowana w DL)

MOV AH, 02h
MOV DL, 'g'
INT 21h

MOV AH, 00h	;/zakonczenie programu
int 21h
