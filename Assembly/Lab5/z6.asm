org 100h

mov ax, [b]
div byte [c]
mov [dzielenie], al
mov al, [a]
mul byte [dzielenie]
mov [wynik], al


mov ah, 00h
int 21h


a db 02h
b dw 0ch
c db 04h
dzielenie db 00h
wynik db 00h; Spodziewany wynik: 6
;a*(b/c)
