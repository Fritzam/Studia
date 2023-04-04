#!/bin/bash

if [[ -f $1 ]]
then
	echo "Plik istnieje.";
else
	echo "Plik nie istnieje."
fi
