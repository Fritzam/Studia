#!/bin/bash
counter=1;
echo "Nazwa skryptu to: ${0##*/}";
for parameter in $@
do
    echo "Argument $counter to: $parameter";
    counter=$((counter+1));
done
echo "Wszystkie podane argumenty to: $@";
echo "W sumie jest ich: $#";
echo "ID procesu to: $$";