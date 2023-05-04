package polymorphism;

abstract class Shape implements Area {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String toString() {
        return color;
    }
}
