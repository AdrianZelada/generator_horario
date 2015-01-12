/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Zelada_Torrez
 */
public class HorarioGrupo extends JFrame{
    
    JLabel Year1;   
        
    JLabel Year2;      
    
    JLabel Year3;        
    
    JLabel tri_mes1;
    JLabel tri_mes2;
    JLabel tri_mes3;    
    JLabel tri_mes4;
    JLabel tri_mes5;
    JLabel tri_mes6;    
    JLabel tri_mes7;
    JLabel tri_mes8;
    JLabel tri_mes9;    
    
    JLabel turno1;
    JLabel turno2;
    JLabel turno3;
    JLabel turno4;
    JLabel turno5;
    JLabel turno6;
    
    JLabel enfermeras[];
    

    public HorarioGrupo(String nombre,int[][]total,int tam) {
        try {
            inicializacion(nombre,total,tam);
        } catch (Exception e) {
            e.printStackTrace();
        }      
    }
    
    private void inicializacion(String nombre,int[][] total, int tam) throws Exception{
        
        
        Year1 =new JLabel("2014");
        Year1.setBounds(270, 25, 120, 20);
        Year1.setForeground(Color.red);
        Year1.setFont(new java.awt.Font("Tahoma", 0, 16));                

        Year2 =new JLabel("2015");
        Year2.setBounds(530, 25, 120, 20);
        Year2.setForeground(Color.red);
        Year2.setFont(new java.awt.Font("Tahoma", 0, 16));  
        
        Year3 =new JLabel("2016");
        Year3.setBounds(790, 25, 120, 20);
        Year3.setForeground(Color.red);
        Year3.setFont(new java.awt.Font("Tahoma", 0, 16));  
        
        tri_mes1=new JLabel("Enero - Abril");
        tri_mes1.setBounds(165, 45, 120, 20);
        tri_mes2=new JLabel("Mayo - Agosto");
        tri_mes2.setBounds(250, 45, 120, 20);
        tri_mes3=new JLabel("Sept...-Dicie...");
        tri_mes3.setBounds(340, 45, 120, 20);
        
        tri_mes4=new JLabel("Enero - Abril");
        tri_mes4.setBounds(425, 45, 120, 20);
        tri_mes5=new JLabel("Mayo - Agosto");
        tri_mes5.setBounds(510, 45, 120, 20);
        tri_mes6=new JLabel("Sept...-Dicie...");
        tri_mes6.setBounds(600, 45, 120, 20);
        
        tri_mes7=new JLabel("Enero - Abril");
        tri_mes7.setBounds(690, 45, 120, 20);
        tri_mes8=new JLabel("Mayo - Agosto");
        tri_mes8.setBounds(775, 45, 120, 20);
        tri_mes9=new JLabel("Sept...-Dicie...");
        tri_mes9.setBounds(865, 45, 120, 20);
        
        Color colorLabel=new Color(27, 27, 137);
        
        turno1=new JLabel("Turno Mañana");
        turno1.setBounds(25, 95, 120, 20);
        turno1.setForeground(colorLabel);
        turno1.setFont(new java.awt.Font("Tahoma", 0, 16));       
        turno2=new JLabel("Turno Tarde");
        turno2.setBounds(25, 150, 120, 20);
        turno2.setForeground(colorLabel);
        turno2.setFont(new java.awt.Font("Tahoma", 0, 16));    
        turno3=new JLabel("Turno Noche A");
        turno3.setBounds(25, 205, 120, 20);
        turno3.setForeground(colorLabel);
        turno3.setFont(new java.awt.Font("Tahoma", 0, 16));
        turno4=new JLabel("Turno Noche B");
        turno4.setBounds(25, 260, 120, 20);
        turno4.setForeground(colorLabel);
        turno4.setFont(new java.awt.Font("Tahoma", 0, 16));
        turno5=new JLabel("Turno Noche C");
        turno5.setBounds(25, 315, 120, 20);
        turno5.setForeground(colorLabel);
        turno5.setFont(new java.awt.Font("Tahoma", 0, 16));
        turno6=new JLabel("Turno Volante");
        turno6.setBounds(25, 370, 120, 20);
        turno6.setForeground(colorLabel);
        turno6.setFont(new java.awt.Font("Tahoma", 0, 16));
        
        enfermeras = new JLabel[tam]; 
                
        
        this.setTitle("Horarios "+nombre);
        this.setVisible(true);
        //this.setResizable(false);
        this.setBounds(200, 50,1000,650);    
        this.setLayout(null);    
        
        this.add(Year1);
        this.add(Year2);
        this.add(Year3);
        this.add(turno1);
        this.add(turno2);
        this.add(turno3);
        this.add(turno4);
        this.add(turno5);
        this.add(turno6);
        
        this.add(tri_mes1);
        this.add(tri_mes2);
        this.add(tri_mes3);
                        
        this.add(tri_mes4);
        this.add(tri_mes5);
        this.add(tri_mes6);
        
        this.add(tri_mes7);
        this.add(tri_mes8);
        this.add(tri_mes9);
        
        panelContentGenerado content=new panelContentGenerado(nombre,total);
        this.add(content);
        
        PanelContentTrabajadores contTra=new PanelContentTrabajadores(nombre, tam, 440,150,150);
        
        this.add(contTra);
      
    }
        
}
