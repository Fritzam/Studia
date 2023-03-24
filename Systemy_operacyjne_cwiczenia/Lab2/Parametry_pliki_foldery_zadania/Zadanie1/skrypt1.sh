#!/bin/bash


if [ $# -eq 0 ]
then
	echo "Nie podano zadnego parametru. Następuje przerwanie skryptu.";
	exit 0;
fi

if [ $# -ge 1 ]
then
	echo Ilość argumentów wynosi: $#. Pierwszy z nich to $1.
fi
