package figure;

public class Main {
    public static void main(String[] args) {
        IFigure square = new Square();
        IFigure circle = new Сircle();
        IFigure triangle = new Triangle();

        square.getFigure();
        circle.getFigure();
        triangle.getFigure();
    }
}
