
import java.applet.Applet;
import java.awt.*;

public class TrafficLight extends Applet {

    public void paint(Graphics g) {
        g.drawRoundRect(520, 100, 30, 300, 45, 45);
        g.drawOval(490,175,30,30);
        g.drawOval(490,285,30,30);
        for(int i =0;i<6;i++)
        {
            try{
                if(i%2==0)
                {
                    Thread.sleep(2000);
                            g.setColor(Color.red);
                             g.fillOval(490,175,30,30);
                              g.setColor(Color.white);
                               g.fillOval(490,285,30,30);
                   
                }
                else
                {
                    Thread.sleep(2000);
                    g.setColor(Color.green);
                     g.fillOval(490,285,30,30);
                     g.setColor(Color.white);
                     g.fillOval(490,175,30,30);
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
       
    }

  
}
