import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 649;
    public static final int HEIGHT = 480;
    int a=0;
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        super.setup();
        background(175,238,238);

    }

    @Override
    public void draw() {

        int height = HEIGHT / 5;
        getEllipse(a, height);
        getEllipse(a*2, height*2);
        getEllipse(a*3, height*3);
        getEllipse(a*4, height*4);
        a++;
    }

    private void getEllipse(int height, int width) {
        ellipse(height, width,15,15);
    }
}
