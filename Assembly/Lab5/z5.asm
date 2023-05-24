org 100h

mov ah, [b]
add ah, [c]
mov bh, ah
mov ax, [a]
div byte bh
mov [wynik], al




mov ah, 00h
int 21h

a dw 0ch
b db 02h
c db 04h
wynik db 00h ; Spodziewany wynik: 2
;a/(b+c)
