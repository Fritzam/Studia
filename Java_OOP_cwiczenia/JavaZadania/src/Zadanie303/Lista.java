package Zadanie303;

public class Lista {
    public static void main(String[] args) {
        MyList<String> myList = new MyArrayList<>();

        // Test 1: Dodaj element i sprawdź rozmiar
        myList.add("Element1");
        if(myList.size() == 1) {
            System.out.println("Test 1 - PASS");
        } else {
            System.out.println("Test 1 - FAIL");
        }

        // Test 2: Dodaj kolejny element i sprawdź rozmiar
        myList.add("Element2");
        if(myList.size() == 2) {
            System.out.println("Test 2 - PASS");
        } else {
            System.out.println("Test 2 - FAIL");
        }

        // Test 3: Sprawdź, czy poprawnie zwracane są elementy
        if(myList.get(0).equals("Element1") && myList.get(1).equals("Element2")) {
            System.out.println("Test 3 - PASS");
        } else {
            System.out.println("Test 3 - FAIL");
        }

        // Test 4: Usuń element i sprawdź rozmiar
        myList.remove(0);
        if(myList.size() == 1) {
            System.out.println("Test 4 - PASS");
        } else {
            System.out.println("Test 4 - FAIL");
        }

        // Test 5: Sprawdź, czy element został poprawnie usunięty
        if(myList.get(0).equals("Element2")) {
            System.out.println("Test 5 - PASS");
        } else {
            System.out.println("Test 5 - FAIL");
        }

        // Test 6: Spróbuj uzyskać dostęp do indeksu poza rozmiarem
        try {
            myList.get(10);
            System.out.println("Test 6 - FAIL");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Test 6 - PASS");
        }

        // Test 7: Spróbuj usunąć element na indeksie poza rozmiarem
        try {
            myList.remove(10);
            System.out.println("Test 7 - FAIL");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Test 7 - PASS");
        }
        // Test 8: Usuń wszystkie elementy, a następnie dodaj nowy
        myList.remove(0);
        myList.add("New Element");
        if(myList.size() == 1 && myList.get(0).equals("New Element")) {
            System.out.println("Test 8 - PASS");
        } else {
            System.out.println("Test 8 - FAIL");
        }
        myList.remove(0);

        // Test 9: Dodaj więcej elementów niż początkowa pojemność listy
        for(int i = 0; i < 15; i++) {
            myList.add("Element" + i);
        }
        if(myList.size() == 15 && myList.get(14).equals("Element14")) {
            System.out.println("Test 9 - PASS");
        } else {
            System.out.println("Test 9 - FAIL");
        }

        // Test 10: Usuń element z środka listy
        myList.remove(8);
        if(myList.size() == 14 && !myList.get(8).equals("Element8")) {
            System.out.println("Test 10 - PASS");
        } else {
            System.out.println("Test 10 - FAIL");
        }

    }
}
