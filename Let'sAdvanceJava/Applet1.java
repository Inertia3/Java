import java.applet.*;
import java.awt.*;

/*<applet code> = Applet1 widith = 400 height = 400>
</applet> */

public class Applet1 extends Applet{
    public void init(){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
    }

    public void paint(Graphics g){
        g.drawString("Welcome to Applets", 500, 500);
    }
}
