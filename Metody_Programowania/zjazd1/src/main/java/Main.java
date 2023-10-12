import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // żeby utworzyć zaawansowany obiekt z podstawowego w zmiennych zmieniamy 1 litere na dużą np. double > Double, int > Integer

//        Student tomek = new Student();
//        tomek.setName("Tomek");
//        System.out.println(tomek);
//
//        Student jan = new Student();
//        jan.setName("Jan");
//        System.out.println(jan);
        Student Jan = new Student("Jan");

        List lista = new ArrayList<>();
        lista.add("Kurde");
        lista.add(12);          //listy, bardzo przydatne
        lista.add(34);
        System.out.println(lista);  // wydrukuje w formie [1element, 2element, ..., n_element]
        for (int i = 0; i < lista.size(); i++) {   // wydrukuje w slowa po kolei pod sobą
            System.out.println(lista.get(i));
        }
//        List<Student> lista2 = new ArrayList<>();
//        lista.add(Jan);
//        lista.add(new Student("Arek"));
//
//        for (Student pojedynczystudent : lista2) {
//            try {
//                List<String> randomString = pojedynczyStudent.getRandomString();            //Łapanie błędów
//                System.out.println(randomString);
//            } catch (NoSuchElementException e) {
//                System.out.println("zlapalem");
//            } finally {
//                System.out.println("Udalo sie");
//            }
//        }

        // optional, stream, lambda


        Optional<String> optionalString = Jan.getStringByIndex(1); {  //optional strem sprawdza czy obiekt ma wartosc

//            String s = optionalString.map(String::toUpperCase)
//                    .or(() ->{
//                                System.out.println("Firtst or");
//                    }
//                    )
            if (optionalString.isPresent()) {
                String value = optionalString.get();
                System.out.println(value.toUpperCase());
            }
            if (optionalString.isEmpty()) {
                System.out.println("optional string was empty");
            }
        }
        //streamy - lista2
        List<Student> lista2 = new ArrayList<>();
        lista2.add(new Student("Marian"));
        lista2.add(new Student("Piotrek"));
        lista2.add(new Student("Marek"));

        lista2.stream()
                .map(student -> student.getName().toUpperCase())  //pierwszy element - nazwa zmiennej -> return | jeśli jest duża funkcja tworzymy z niej osobną i ze stworzonej lambde
                .forEach(studentName -> System.out.println(studentName));


        CollectionUtils.isNotEmpty(lista2);
//        System.out.println(CollectionUtils.isNot);


    }
}