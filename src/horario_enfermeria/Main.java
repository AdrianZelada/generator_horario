/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;

import enfermeria.AsignacionHorario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Zelada_Torrez
 */
public class Main extends JFrame{
    
    //JButton aceptar;
    PanelInicioFondo panel=new PanelInicioFondo();
    public static AsignacionHorario B;
    public Main(){
        /*aceptar =new JButton("Iniciar");
        aceptar.setBounds(200, 120, 100, 30);*/
        this.setTitle("Generar Horarios");
        this.setVisible(true);
        this.setResizable(false);
        this.setBounds(400, 100,400,400);    
        this.setLayout(null);   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.add(panel);
        ManejadorB m=new ManejadorB();
        
        panel.getInicio().addActionListener(m);
                
        
    }
    
    private class ManejadorB implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            if(evento.getActionCommand().equals("Iniciar")){    
                Horario_enfermeria x=new Horario_enfermeria();                
                setVisible(false);
            }			                       
        }
    }
    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        Main ventana= new Main();
        ventana.setVisible(true);             
    } 
}
