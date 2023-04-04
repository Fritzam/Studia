#!/bin/bash
function selection_menu {
	echo "Jaki jest Twoj wybor?"
	select wybor in c u h quit
	do

		user_choice

	break
	done

}

function user_choice {
	case $wybor in
		"c") echo -e "Tak wygląda bieżący folder: \n$(ls)";;
		"u") echo "Nazwa użytkownika to: $(whoami)" ;;
		"h") echo -e "Tak wygląda folder domowy: \n$(ls ~)";;
		"quit") exit ;;
		*) echo "Proszę dokonać wyboru z zakresu opcji."
	esac
}