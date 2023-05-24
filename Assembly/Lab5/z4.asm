org 100h

mov ax, [a]
div byte [b]
add al, [c]
mov [wynik], al



mov ah, 00h
int 21h

a dw 05h
b db 02h
c db 04h
wynik db 00h ; Spodziewany wynik: 6

;(a/b)+c
