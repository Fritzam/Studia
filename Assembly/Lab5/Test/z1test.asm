org 100h

mov al, [b]
add [a], al
mov al, [c]
add [a], al

mov ah, 00h
int 21h

a db 02h
b db 03h
c db 02h
d db 00h
