#!/bin/bash

if [ -f "./SOP_display.sh" ]
then
	echo "SOP_display.sh istnieje."

else
	if [ $# -eq 1 ]
	then
		chmod 755 $1
		./$1
	else
		echo "Wystąpił błąd. Następuje przerwanie skryptu".
	fi
fi
