package polymorphism;

class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Triangle("Blue", 10, 10);
        shapes[1] = new Rectangle("Red", 10, 10);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
        }
    }
}
