import java.util.*;

public class Student {
    private String name;

    //    private List<String> randomString = new ArrayList<>();
    public Student(String name) {   // to jest konstruktor - żeby tworzyć obiekt studenta w innej klasie | można od razu dawać imie w zmiennej
        this.name = name;
    }


    //settery i gettery są potrzebne do prywatnych obiektów
    public void setName(String name) {   //setter ustawia name ze zmiennej
        this.name = name;
    }

    public String getName() {    // getter zwraca ustawionego już name
        return name;
    }

    private List<String> randomString = new ArrayList<>();


    public Optional<String> getStringByIndex(int index) {
        if (index >= randomString.size()) {
            return Optional.empty();
        } else {
            return Optional.of(randomString.get(index));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
