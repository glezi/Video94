/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video94;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author gleez
 */
public class Video94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Marco_radio mimarco = new Marco_radio(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class Marco_radio extends JFrame{
    
    public Marco_radio(){
        setVisible(true);
        
        setBounds(550,300,500,300);
        
        Lamina_radio milamina = new Lamina_radio(); 
        add(milamina); 
    }
    
}

class Lamina_radio extends JPanel{
    
    public Lamina_radio (){
        setLayout(new BorderLayout()); 
        texto= new JLabel("En lugar de la mancha de cuyo nombre..."); 
        add(texto, BorderLayout.CENTER); 
        
        ButtonGroup migrupo= new ButtonGroup(); 
        
        boton1 = new JRadioButton("Pequeño", false); 
        boton2 = new JRadioButton("Mediano", true); 
        boton3 = new JRadioButton("Grande", false); 
        boton4 = new JRadioButton("Muy Grande", true);
        
        JPanel lamina_radio = new JPanel(); 
        Evento_radio mievento = new Evento_radio(); 
        boton1.addActionListener(mievento); 
        boton2.addActionListener(mievento); 
        boton3.addActionListener(mievento); 
        boton4.addActionListener(mievento); 
        
        
        migrupo.add(boton1);
        migrupo.add(boton2); 
        migrupo.add(boton3);
        migrupo.add(boton4); 
        
        lamina_radio.add(boton1);
        lamina_radio.add(boton2);
        lamina_radio.add(boton3);
        lamina_radio.add(boton4);
        
        add(lamina_radio, BorderLayout.SOUTH); 
    }
    
    private class Evento_radio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             //To change body of generated methods, choose Tools | Templates.
             
             if(e.getSource()==boton1){
                // System.out.println("Has pulsado el 1");
                
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
           
             }else if (e.getSource()==boton2){
                 texto.setFont(new Font("Serif", Font.PLAIN, 12));
             }else if(e.getSource()==boton3){
                 texto.setFont(new Font("Serif", Font.PLAIN, 18));
             }else if(e.getSource()==boton4){
                 texto.setFont(new Font("Serif", Font.PLAIN, 24));
             }
        }
        
    }
    
    private JLabel texto; 
    private JRadioButton boton1, boton2, boton3, boton4; 
}