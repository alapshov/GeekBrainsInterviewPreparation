package figure;

public class Square extends AbstractFigure {
    public void getFigure() {
        size = 15;
        color = "Green";
        System.out.println("Square size: " + size + ", color: " + color);
    }
}
