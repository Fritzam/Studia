org 100h


mov ah, 09h
mov dx, prompt ; Promptuj o znak.
int 21h

mov ah, 02h
mov dl, 0ah ; wydrukuj new line'a
int 21h

mov ah, 02h
mov dl, 0dh ; powrot karetki
int 21h

mov ah, 0Ah
mov dx, buffer ; Pobranie pojedynczego znaku od uzytkownika
int 21h

cmp byte [buffer+2], 41h
JL error
JGE check_for_great_letter

check_for_great_letter:
cmp byte [buffer+2], 5Ah
JLE is_great_letter
JG check_for_small_letter

is_great_letter:
mov ah, 09h
mov dx, is_great_letter_string
int 21h
jmp koniec

check_for_small_letter:
cmp byte [buffer+2], 61h
JL error
cmp byte [buffer+2], 7Ah
JLE is_small_letter
JG error

is_small_letter:
mov ah, 09h
mov dx, is_low_letter_string
int 21h
jmp koniec

error:
mov ah, 09h
mov dx, error_string
int 21h
jmp koniec

koniec:
mov ah, 00h
int 21h


buffer db 02h
prompt db "Prosze wprowadzic wielka lub mala litere:$"
error_string db "Podana wartosc nie jest litera.$"
is_great_letter_string db "Podany znak jest wielka litera.$"
is_low_letter_string db "Podany znak jest mala litera.$"
