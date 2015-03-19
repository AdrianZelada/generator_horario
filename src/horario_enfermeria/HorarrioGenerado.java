/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;

import static horario_enfermeria.Main.B;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Zelada_Torrez
 */
public class HorarrioGenerado extends JFrame {        
    
    
   JButton Atraz; 
   JButton HorarioCompleto;
   JButton Enfermeras;
   private static int [][]totalH;
    public HorarrioGenerado(String[] turno,String[]horario,String []grup,int [][]total){
        totalH=total;
        try {
            inicializacion(turno,horario,grup,total);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private class ManejadorB implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            if(evento.getActionCommand().equals("Atraz")){                
                Horario_enfermeria ventana=new Horario_enfermeria();                                
                ventana.setVisible(true);
                setVisible(false);                                               
                dispose();
            }		
            
            if(evento.getActionCommand().equals("Horarios")){
                HorarioGrupo ventana1=new HorarioGrupo("total",HorarrioGenerado.totalH,12,"horarios");
                ventana1.setVisible(true);
            }
            
            if(evento.getActionCommand().equals("Enfermeras")){                
                TotalEnfermeras ventana2=new TotalEnfermeras();
                ventana2.setVisible(true);
            }
        }
    }
    
    public void inicializacion(String[] turno,String[]horario,String []grup,int [][]total)throws Exception{
        
        Atraz = new JButton("Atraz");
        Atraz.setBounds(450,350, 120, 30);
        
        HorarioCompleto=new JButton("Horarios");
        HorarioCompleto.setBounds(30,350, 120, 30);
        
     //   Enfermeras=new JButton("Enfermeras");
     //   Enfermeras.setBounds(240,350, 120, 30);
        
        this.setTitle("Generar Horarios");        
        this.setResizable(false);
        this.setBounds(400, 100,600,420);    
        this.setLayout(null);         
        this.setVisible(true);
        PanelContentHorario content =new PanelContentHorario(turno,horario,grup,total);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(content);
        this.add(Atraz);
     //   this.add(Enfermeras);
        this.add(HorarioCompleto);
        
        ManejadorB m=new ManejadorB();
        Atraz.addActionListener(m);
     //   Enfermeras.addActionListener(m);
        HorarioCompleto.addActionListener(m);
        
    }            
}
