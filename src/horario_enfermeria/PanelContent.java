/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Zelada_Torrez
 */


public class PanelContent extends JPanel{
    JLabel title;
    JLabel Mes_Prog;
    JLabel Anos_prog;    
    JLabel Numero_turno;
    JButton Generar;
    JButton Cancelar;
    JButton Enfermeras;
    JButton Horarios;
    JComboBox Combo_mes;
    JComboBox Combo_ano;
     
    private Image imagen;
    
    public PanelContent(){   
        try {
            inicializacion();
        } catch (Exception e) {
            e.printStackTrace();
        }                
    }
    private void inicializacion(){
        imagen = new ImageIcon(getClass().getResource("fondo1.jpg")).getImage();        
        this.setLayout(null);
        this.setBounds(10, 10,475,250);
        
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "Generar Horarios");      
        this.setBorder(bordejpanel); 
        
         
        Mes_Prog=new JLabel("Meses a Programar");
        Mes_Prog.setBounds(70, 50, 150, 20);
        Mes_Prog.setFont(new java.awt.Font("Tahoma", 0, 16)); 
        Combo_mes=new JComboBox();
        Combo_mes.setBounds(240, 50, 150, 20);
        Combo_mes.setFont(new java.awt.Font("Tahoma", 0, 16)); 
        Combo_mes.addItem("Enero a Abril");
        Combo_mes.addItem("Mayo a Agosto");
        Combo_mes.addItem("Septiembre a Diciembre");
        Combo_mes.setSize(180, 30);
        
        Anos_prog=new JLabel("Años a Programar");
        Anos_prog.setBounds(70, 100, 150, 20);              
        Anos_prog.setFont(new java.awt.Font("Tahoma", 0, 16)); 
        Combo_ano=new JComboBox();
        Combo_ano.setBounds(240, 100, 150, 20);
        Combo_ano.setFont(new java.awt.Font("Tahoma", 0, 16)); 
        Combo_ano.addItem("2014");
        Combo_ano.addItem("2015");
        Combo_ano.addItem("2016");
        Combo_ano.setSize(180, 30);
        
        Generar=new JButton("Generar");
        Generar.setBounds(80, 150, 150, 30);
        
        Enfermeras=new JButton("Enfermeras");
        Enfermeras.setBounds(80,200, 150, 30);
        
        Cancelar=new JButton("Cancelar");
        Cancelar.setBounds(260, 200, 150, 30);
        
        Horarios=new JButton("Horarios");
        Horarios.setBounds(260, 150, 150, 30);
  
        this.add(Mes_Prog);
        this.add(Combo_mes);
        
        this.add(Anos_prog);
        this.add(Combo_ano);
        
        this.add(Generar);
        this.add(Enfermeras);
        this.add(Cancelar);    
        this.add(Horarios);    
    }
    
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),
                              this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }
 
        super.paint(g);
    }
    
    public JButton getGenerar (){    
        return Generar;
    }
    public JButton getCancelar (){    
        return Cancelar;
    }
    
    public int getMes (){            
        return Combo_mes.getSelectedIndex();
    }
    
    public int getAno (){            
        return Combo_ano.getSelectedIndex();
    }
}
