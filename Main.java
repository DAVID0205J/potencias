import javax.swing.JFrame;
import  javax.swing.JLabel;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        //MI VENTANA
        JFrame ventana = new JFrame();
        ventana.setSize( 400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);


        //TITULO APLICACION
        JLabel titulo=new JLabel("POTENCIAS");
        titulo.setBounds(155,5,200,50);
        titulo.setForeground(Color.BLUE);

        JLabel texto = new JLabel();
        texto.setBounds(100,50,100,50);
        ventana.add(texto);
        ventana.add(titulo);
        ventana.setVisible(true);


    }

}