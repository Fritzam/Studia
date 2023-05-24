org 100h

mov AH, 21h
mov AL, 21h
cmp AL, AH

JL mniejsze
JG wieksze
JE rowne

mniejsze:
mov AH, 02h
mov DL, '<'
int 21h
jmp koniec

wieksze:
mov ah, 02h
mov dl, '>'
int 21h
jmp koniec

rowne:
mov ah, 02h
mov dl, '='
int 21h
jmp koniec

koniec:
mov AH, 00h
int 21h

