package Zadanie103;

import javax.swing.*;

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(super.name + " is barking.");
    }


}
