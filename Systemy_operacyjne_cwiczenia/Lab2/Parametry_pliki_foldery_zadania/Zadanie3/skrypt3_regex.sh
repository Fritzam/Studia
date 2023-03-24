#!/bin/bash

name="${0##*/}"


if [[ "$name" =~ [[:alnum:]]+_[[:alnum:]]+.sh$ ]];
then
	echo "Nazwa skryptu kończy się na .sh :)"
else
	echo -e "Nazwa skryptu nie kończy się na .sh\nNastępuje poprawa nazwy."
	mv $name $name.sh	
	
fi

