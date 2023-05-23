package Zadanie1042;

class Robot implements Speakable{

    String name;
    Robot(String name) {
        this.name = name;
    }

    @Override
    public void speak(String message) {
        System.out.println("Bzzz " + name + " roger roger " + message.toUpperCase());
    }
}
