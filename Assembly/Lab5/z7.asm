org 100h

mov al,[a]
mul byte [a]
mov [placeholder], al
mov al, [b]
mul byte [b]
add al, [placeholder]
add al, [c]
mov [wynik], al




mov ah, 00h
int 21h

a db 02h
b db 02h
c db 06h
placeholder db 00h
wynik db 00h ; Spodziewany wynik: 14/0E

;a^2+2b+c
