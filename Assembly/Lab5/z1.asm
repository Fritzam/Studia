org 100h

mov ax, [a]
add ax, [b]
add ax, [c]

mov [y], ax

mov ah, 00h
int 21h

a dw 05h
b dw 03h
c dw 02h
y dw 00h