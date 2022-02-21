import processing.core.PApplet;

public class TryProcessing extends PApplet {

    int a=0,b=0,c=0,d=0;
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(640,480);

    }

    @Override
    public void setup() {
        super.setup();
        background(175,238,238);

    }

    @Override
    public void draw() {

        ellipse(a,96,15,15);
        a++;
        ellipse(b,192,15,15);
        b+=2;
        ellipse(c,288,15,15);
        c+=3;
        ellipse(d,384,15,15);
        d+=4;
        if (a==width) a=0;
        if (b==width) b=0;
        if (c==width) c=0;
        if (d==width) d=0;

    }
}
