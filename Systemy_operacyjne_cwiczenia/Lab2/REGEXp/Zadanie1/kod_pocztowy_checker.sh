#!/bin/bash

sed -n '/^[[:digit:]]\{2\}-[[:digit:]]\{3\}$/ p' $1
 




