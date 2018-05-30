
import java.applet.Applet;
import java.awt.*;

public class AppletFont1 extends Applet {
     Font obj = new Font("Arial",Font.BOLD,40);
     Font obj1 = new Font("Times new Roman",Font.ITALIC,60);
   
    public void paint(Graphics g) {
       g.setFont(obj);
       g.drawString("Parkhi Bhatnagar",300,500);
       g.setFont(obj1);
       g.drawString("Welcome", 300,700);
       g.drawString("Font Details : " + g.getFont(), 300,900);
       
       
       
    }

   
}
