/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;

import enfermeria.AsignacionHorario;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author Zelada_Torrez
 */
public class Horario_enfermeria extends JFrame{

    /**
     * @param args the command line arguments
     */        
    
    PanelContent Content;      
    AsignacionHorario B;
    private Image imagen;
    public String []turno = new String [6];
    public String []horario = new String [6];    
    public Horario_enfermeria(){                          
         try {
            inicializacion();
        } catch (Exception e) {
            e.printStackTrace();
        }                   
    }
    
    private void inicializacion() throws Exception{
                
        
        turno = ConexionBD.get_turno();
        horario = ConexionBD.get_horario();
        this.setTitle("Generar Horarios");
        this.setVisible(true);
        this.setResizable(false);
        this.setBounds(400, 100,500,300);    
        this.setLayout(null);   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        Content =new PanelContent();        
        this.add(Content);
        ManejadorB m=new ManejadorB();
        Content.getGenerar().addActionListener(m);
        Content.getCancelar().addActionListener(m);        
        B=new AsignacionHorario();
        try {
            B.calcularHorario(); 
        } catch (Exception e) {
            
        }
        
        
    }
    
    private class ManejadorB implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            if(evento.getActionCommand().equals("Generar")){              
                String reto[] =new String [9];
                int x=Content.getMes();
                int y=Content.getAno();
                int cont=0;
                if(x==0&&y==0){cont=0;}
                if(x==1&&y==0){cont=1;}
                if(x==2&&y==0){cont=2;}
                if(x==0&&y==1){cont=3;}
                if(x==1&&y==1){cont=4;}
                if(x==2&&y==1){cont=5;}
                if(x==0&&y==2){cont=6;}
                if(x==1&&y==2){cont=7;}
                if(x==2&&y==2){cont=8;}                                
                reto=B.getArray(cont);                                
                HorarrioGenerado ventana_Horario=new HorarrioGenerado(turno, horario,reto,B.getTotal());
                
                setVisible(false);
            }	
            if(evento.getActionCommand().equals("Cancelar")){                    
                setVisible(false);
                dispose();
                System.exit(0);
            }	
        }
    }             
}    
