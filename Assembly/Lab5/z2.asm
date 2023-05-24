org 100h

mov ax, [a]
mul word [b]
add ax, [c]
mov [wynik], ax

mov ah, 00h
int 21h


a dw 02h
b dw 02h
c dw 02h
y dw 00h
wynik dw 00h ; Oczekiwany wynik: 6
; a*b+c
