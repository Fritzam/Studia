org 100h


mov ah, 09h
mov dx, prompt ; Prosba o wprowadzenie pojedynczego znaku
int 21h 


mov ah, 02h
mov dl, 0ah
int 21h        ; New line i powrót karetki
mov ah, 02h
mov dl, 0dh
int 21h

mov ah, 0AH
mov dx, buffer ; Pobranie pojedynczego znaku od uzytkownika
int 21h

mov BX, DX

cmp byte [BX+2], "_" ; Porownanie wartosci z dx'a(usr input) i 5Fh ("_")

JE rowne ; jezeli dx == 5Fh skocz do "rowne";
JL mniejsze ; jezeli dx < 5Fh skocz do "mniejsze"
JG wieksze ; jezeli dx > 5Fh skocz do "wieksze"

rowne: 
mov ah, 02h
mov dl, '=' ; wydrukuj '=' jesli rowne i skocz do "koniec"
int 21h
mov ah, 02h
mov dl, '='
int 21h
jmp koniec

mniejsze:
mov ah, 02h
mov dl, '<' ; wydrukuj '<' jesli mniejsze i skocz do koniec
int 21h
jmp koniec

wieksze:
mov ah, 02h
mov dl, '>' ; wydrukuj '>' jesli wieksze i skocz do koniec
int 21h
jmp koniec

koniec:
mov ah, 00h ; zakonczenie programu
int 21h


buffer db 02h ;
prompt db "Prosze wprowadzic pojedynczy znak:$"
