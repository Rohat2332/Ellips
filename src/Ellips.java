
import java.awt.*;
import java.applet.*;

public class Ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50, 50, 80, 50, 1000, -1000);
    }
}