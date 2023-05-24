;/ Napisz program, który wyświetli pośrodku ekranu literę “C”.

org 100h

mov ah, 02h ;/ Ustaw wartość ah na 02h.
mov dh, 0ch ;/ Wiersze na 0ch.
mov dl, 29h ;/ Kolumny na 29h.
int 10h     ;/ Przesun kursor.

mov ah, 02h ;/ Wartość na 02h.
mov dl, 'C' ;/ Wartość dl na 'C'
int 21h     ;/ Wyświetl na stdout.

mov ah, 00h 
int 21h     ;/ Zakończ program
