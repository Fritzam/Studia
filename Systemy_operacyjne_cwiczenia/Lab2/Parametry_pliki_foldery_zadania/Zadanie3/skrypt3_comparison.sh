#!/bin/bash

name="${0##*/}"
last3="${name: -3}"

if [ $last3 == ".sh" ]
then
	echo -e "Nazwa skryptu kończy się na .sh\nWszystko jest w porządku."
else
	echo -e "Nazwa skryptu nie kończy się na .sh\nNastępuje poprawa nazwy."
	mv $name $name.sh
	echo "Nowa nazwa to: $name.sh"
fi
