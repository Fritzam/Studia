org 100h

mov ah, 09h 
mov dx, string ; Prosba tekstowa o znak
int 21h;

loop:
mov ah, 0Ah
mov dx, buffer ; Pozyskanie znaku od uzytkownika
int 21h

mov ah, 02h
mov dl, 0ah
int 21h        ; New line i powrót karetki
mov ah, 02h
mov dl, 0dh
int 21h

cmp byte [buffer+2], 51h
JE koniec
jmp loop



koniec:
mov ah, 00h
int 21h

buffer db 02h
string db "Prosze wprowadzic znak do wyswietlenia: $"
