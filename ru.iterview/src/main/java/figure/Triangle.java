package figure;

public class Triangle extends AbstractFigure {

    public void getFigure() {
        size = 25;
        color = "Red";
        System.out.println("Triangle size: " + size + ", color: " + color);
    }
}
