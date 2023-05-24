org 100h

mov al, [b]
mul byte [a]
add ax, [c]


mov ah, 00h
int 21h

a db 04h
b db 02h
c db 04h



; a*b+c
