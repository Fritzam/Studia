package Zadanie31;

public class Main {

    static String camelCaseIt(String snake_case) {
        snake_case = snake_case.toLowerCase();
        String camelCase = "";
        for (int i = 0; i < snake_case.length(); i++) {
            if (i+1 > snake_case.length()) {
                break;
            } else {
                if (snake_case.charAt(i) == '_') {
                    camelCase += Character.toUpperCase(snake_case.charAt(i + 1));
                    i++;
                } else {
                    camelCase += snake_case.charAt(i);
                }
            }
        }

        return camelCase;

    }
    public static void main(String[] args) {
        /*(string) Strasznie nie lubię węży! Dlatego nie podoba i się że ci pajtonowcy piszą wszytko Snake casem.
        Napisz mi program który przekonwertuje SnakeCase do CamelCase.
        Przekonwertuj pierwszy argument programu, napisany snakecase do CamelCase i wydrukuj.

        Przykład
        ./snakes-sucks "is_modal_open" ➞ WYDRUKUJE: "isModalOpen"
        ./snakes-sucks "follow_the_white_rabbit" ➞ WYDRUKUJE: "followTheWhiteRabbit"*/

        System.out.println(camelCaseIt(args[0]));
        System.out.println(camelCaseIt(args[1]));
        System.out.println(camelCaseIt(args[2]));



    }
}
