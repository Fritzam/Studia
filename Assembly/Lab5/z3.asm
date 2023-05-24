org 100h

mov ax, [a]
mul word [c]
mov [y], ax

mov ax, [b]
mul word [c]
add ax, [y]
mov [y], ax

mov ax, [c]
mul word [c]

sub word [y], ax
mov ax, [y]
mov [wynik], ax

mov ah, 00h
int 21h


a dw 03h
b dw 03h
c dw 2h
y dw 00h
wynik dw 00h ; Oczekiwany wynik: 8
;2a+2b-2c
