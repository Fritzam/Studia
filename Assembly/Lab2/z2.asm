;/ Napisz program, który wypisze na terminalu twoje imię i nazwisko.
org 100h

MOV AH, 09H
MOV DX, etykieta
INT 21h

MOV AH, 00H
INT 21h

etykieta db "Michal Fritza$"
