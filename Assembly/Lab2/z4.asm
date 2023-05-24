;/ Napisz program, który odczyta znak, a następnie go wydrukuje.

org 100h

mov ah, 02h ;/ Wczytaj wartość 02h do rejestru ah.
mov dl, ' ' ;/ Wczytaj spację do rejestru dl.
int 21h     ;/ Wyświetl znak.

mov ah, 01h ;/ Wczytaj wartość 01h do rejestru ah.
int 21h     ;/ Wczytaj znak ze standard inputu do rejestru dl.

mov ah, 02h ;/ Wczytaj wartość 02h do rejestru ah.
int 21h     ;/ Wyświetl zawartość rejestru dl (usrinput) na ekranie.

mov ah, 00h
int 21h     ;/ Przerwij działanie programu.
