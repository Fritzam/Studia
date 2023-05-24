org 100h

mov AH, 0Ah ; Wczytanie znaków do buforu.
mov DX, buffer
int 21h

mov AH, 02h ; Wydruk entera dla uniknięcia nakładania się znaków. 
mov DL, 0Ah
int 21h
mov AH, 02h
mov DL, 0Dh
int 21h

mov BL, [buffer+1] ; Przeniesienie do BL ilosci znakow w stringu.
add BL, 02h ; Dodanie liczby 2.
mov byte [buffer+BX], "$" ; Dodanie $ na koncu stringa.
int 21h

mov AH, 09h ; Odczyt stringa z przesunięciem o 2.
mov DX, buffer+2
int 21h

 
mov AH, 00h
int 21h

buffer db 06h
