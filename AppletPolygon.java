

import java.applet.Applet;
import java.awt.*;

public class AppletPolygon extends Applet {
    
   // int x[]={50,80,120}; 
    //int y[]={100,50,100};
     int x[]={70,90,110,96,85}; 
    int y[]={100,70,85,150,150};
    
    

    public void paint(Graphics g) {
       
        
        g.drawPolygon(x, y, 5);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
