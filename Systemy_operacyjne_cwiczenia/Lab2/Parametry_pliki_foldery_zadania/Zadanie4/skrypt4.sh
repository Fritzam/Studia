#!/bin/bash

counter=$(ls | wc -l)

if [ $counter -gt 5 ]
then
	echo -e "Ilość plików w folderze jest większa niż 5.\nWynosi: $counter."
else
	echo "Ilość plików w folderze jest <= 5. Wynosi: $counter"
fi
