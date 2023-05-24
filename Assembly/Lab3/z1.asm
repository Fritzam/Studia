org 100h

mov AH, 0Ah ; Wczytanie 10 znaków do buforu.
mov DX, bufor
int 21h

mov AH, 02h ; Wydruk entera dla uniknięcia nakładania się znaków. 
mov DL, 0Ah
int 21h
mov DL, 0Dh
int 21h

mov DL, [bufor+4] ; Wydrukowanie trzeciego znaku z buforu
int 21h


mov AH, 00h
int 21h

bufor db 0bh
