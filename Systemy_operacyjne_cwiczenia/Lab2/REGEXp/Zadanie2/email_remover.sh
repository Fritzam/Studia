#!/bin/bash

sed -i '/^[[:alnum:]]\+@[[:alnum:]]\+.[[:alpha:]]\+$/ d' $1
