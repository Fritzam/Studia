org 100h

mov AH, 09h ; Wydruk stringa.
mov DX, string
int 21h

mov AH, 02h ; Wydruk entera dla uniknięcia nakładania się znaków. 
mov DL, 0Ah
int 21h
mov DL, 0Dh
int 21h

mov byte [string+3], '$' ; Podmiana trzeciego znaku stringa na $.

mov AH, 09h ; Ponowny wydruk stringa.
mov DX, string
int 21h

mov AH, 00h
int 21h

string db "Oto jest string$"
