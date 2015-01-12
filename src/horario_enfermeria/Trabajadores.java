/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Zelada_Torrez
 */
public class Trabajadores extends JPanel{

    JLabel nombre;
    JLabel paterno;
    JLabel materno;
    JLabel cargo;
    JLabel item;
    JLabel grupo;
    
    
    public Trabajadores(String trab,int y) {
        this.setLayout(null);    
        this.setBounds(20, y,670,35);       
        this.setBorder(BorderFactory.createLineBorder(Color.black));    
        
        Color backgr= new Color(63, 195, 128);
        
        
        this.setBackground(backgr);
        
        
        String [] datos=trab.split(" ");
        
        nombre = new JLabel(datos[0]);
        paterno = new JLabel(datos[1]);
        materno = new JLabel(datos[2]);
        cargo = new JLabel(datos[3]);
        item = new JLabel(datos[4]);
        grupo = new JLabel(datos[5]+" "+datos[6]); 
        
        if(cargo.getText().equals("enfermera")){
            backgr= new Color(63, 195, 128);
        }else{
            backgr= new Color(134, 226, 213);
        }
        
        
        nombre.setBounds(10, 10, 120, 20);
        nombre.setForeground(Color.WHITE);
        paterno.setBounds(140, 10, 120, 20);
        paterno.setForeground(Color.WHITE);
        materno.setBounds(250, 10, 120, 20);
        materno.setForeground(Color.WHITE);
        cargo.setBounds(360, 10, 120, 20);
        cargo.setForeground(Color.WHITE);
        item.setBounds(480, 10, 120, 20);
        item.setForeground(Color.WHITE);
        grupo.setBounds(580, 10, 120, 20);
        grupo.setForeground(Color.WHITE);
        
        this.add(nombre);
        this.add(paterno);
        this.add(materno);
        this.add(cargo);
        this.add(item);                     
        this.add(grupo);
    }
    
}
