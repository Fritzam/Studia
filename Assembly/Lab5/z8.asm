org 100h

mov al, [c]
mul byte [a]
mov [y], al

mov ax, [b]
div byte [y]
mov [y], al

mul byte [a]
mov [z], al

mov al, [y]
mul byte [z]
mov [wynik], al


mov ah, 00h
int 21h


a db 02h
b dw 0Ch
c db 03h
y db 00h
z db 00h
wynik db 00h ; Spodziewany wynik: 8

;2a*(b/2c)
