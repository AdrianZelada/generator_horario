/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Zelada_Torrez
 */
public class PanelContentHorario extends JPanel{
    
    private Image imagen;
     /*horario test;
    horario test1;*/
    JLabel Enfermera=new JLabel();
    JLabel Turno=new JLabel();
    JLabel Horario=new JLabel();
    
    public PanelContentHorario(String[] turno,String[]horario,String[] grup,int [][]total){
        try {
            inicializacion(turno,horario,grup,total);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void inicializacion(String[] turno,String[]horario,String[] grup,int [][]total){                  
        this.setLayout(null);
        this.setBounds(10, 15,575,320);
        Enfermera.setText("Enfermera");
        Enfermera.setBounds(30, 10, 150, 20);        
        Turno.setText("Turno");
        Turno.setBounds(220, 10, 150, 20);
        Horario.setText("Horario");
        Horario.setBounds(400, 10, 150, 20);
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "Generar Horarios");      
        this.setBorder(bordejpanel);
        this.add(Enfermera);
        this.add(Turno);
        this.add(Horario);
        int y=35;
        
        for(int i=0;i<turno.length;i++){            
            horario row_add=new horario(grup[i],turno[i],horario[i],y,total);
            y=y+42;
            this.add(row_add);
        }
    }        
}
