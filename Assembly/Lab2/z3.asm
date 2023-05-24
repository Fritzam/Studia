;/ Napisz program, który ustawi kursor w lewym górnym rogu ekranu i
;/ 	napisze tam literkę ‘A’.
org 100h

mov ah, 02h ;/Wczytaj 02h do rejestru AH. 
mov dh, 00h ;/Ustaw wartość dh na 00h - wybierz wiersz 0.
mov dl, 00h ;/Ustaw wartość dl na 00h - wybierz kolumnę 0.
int 10h     ;/Przerwanie

mov ah, 02h ;/ Wydrukuj literę 'A', przerwanie.
mov dl, 'A'
int 21h

mov ah, 00h ;/Koniec programu
int 21h
