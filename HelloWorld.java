package helloworld;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HelloWorld extends JFrame implements ActionListener
{
    private JLabel mensaje;
    private JButton boton;
    private JTextField valor1, valor2;
    
    public HelloWorld()
    {
        super();
        configurarVentana();
        crearComponentes();
    }
    
    private void configurarVentana()
    {
        this.setTitle("SUMA DE DOS NUMEROS IZZI");//Titulo de ventana
        this.setSize(500,300);//Tamaño de ventana
        this.setLocationRelativeTo(null);//Localización de ventana
        this.setLayout(null);//Cuadricular la ventana para las posiciones
        this.setResizable(true);//Poder cambiar el tamaño de la pantalla
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//El boton de cerrar funciona 
    }
    
    private void crearComponentes()
    {
        mensaje = new JLabel();
        mensaje.setText("SUMA DE DOS NUMERO");
        mensaje.setBounds(100, 10, 180, 30);//la x,y son la posicion en la que estará y los otros dos son el tamaño que tendrá el texto
        mensaje.setForeground(Color.RED);
        this.add(mensaje);
        
        valor1 = new JTextField();
        valor1.setBounds(30, 60, 100, 30);
        this.add(valor1); 
        
        valor2 = new JTextField();
        valor2.setBounds(200, 60, 100, 30);
        this.add(valor2); 
        
        boton = new JButton();
        boton.setText("Picame para sumar, bro");
        boton.setBounds(75, 100, 180, 30);
        boton.addActionListener(this);
        this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String numero1 = valor1.getText();
        String numero2 = valor2.getText();
        
        float suma = (java.lang.Float.parseFloat(numero2)) + (java.lang.Float.parseFloat(numero1));
        JOptionPane.showMessageDialog(this, "La suma es: " + suma);
    }
    
    public static void main(String[] args)
    {
        HelloWorld ventana = new HelloWorld();
        ventana.setVisible(true);
    }
}
