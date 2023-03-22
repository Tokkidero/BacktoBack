import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

  public class Desenhar extends JFrame
  {
 
      public Desenhar() 
      {
        setSize(1200,900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
      }
  
    public void paint(Graphics t) 
    {
        t.setColor(Color.yellow);
        t.drawLine(100, 100, 500, 500);
        t.drawRect(400, 100, 300, 300);
        t.drawOval(420, 520, 260, 260);
        t.fillRect(400, 250, 400, 400); // Quadrado amarelo
        t.setColor(Color.red);
        t.fillOval(420, 270, 360, 360); // Bola Vermelha
      
    }
  
    public static void main (String[] args) 
    {
      new Desenhar();
    }
 }