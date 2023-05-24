org 100h

mov al, [a]
add al, [b]
sub al, [c]
mul byte [mnoznik]



mov ah, 00h
int 21h

a db 02h
b db 04h
c db 02h
mnoznik db 02h


; 2a+2b-2c
