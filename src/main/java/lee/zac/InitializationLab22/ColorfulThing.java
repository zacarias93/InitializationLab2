package lee.zac.InitializationLab22;


public class ColorfulThing {

    private Color color;

    public ColorfulThing(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public enum Color {
        RED, BLUE, GREEN
    }

    @Override
    public String toString(){
        return color.toString();
    }

}
