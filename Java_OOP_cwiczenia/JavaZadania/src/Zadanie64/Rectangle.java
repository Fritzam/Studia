package Zadanie64;

class Rectangle extends Shape{
    public Rectangle(int w, int h) {
        super(w, h);
    }
    public int getArea() {
        return (width * height);
    }
}
