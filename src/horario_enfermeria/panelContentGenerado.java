/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JPanel;

/**
 *
 * @author Zelada_Torrez
 */
public class panelContentGenerado extends JPanel{

    CeldaHorario panels0[];
    CeldaHorario panels1[];
    CeldaHorario panels2[];
    CeldaHorario panels3[]; 
    CeldaHorario panels4[];
    CeldaHorario panels5[];
    public panelContentGenerado(String nombre,int[][] total) {
        try {
            inicializacion(nombre,total);
        } catch (Exception e) {
        }
    }
    
    public void inicializacion(String nombre,int[][]total){        
        
        this.setLayout(new GridLayout(6, 9));
        this.setBounds(150, 80, 800, 350);
        
        panels0 = new CeldaHorario[9];
        panels1 = new CeldaHorario[9];
        panels2 = new CeldaHorario[9];
        panels3 = new CeldaHorario[9];
        panels4 = new CeldaHorario[9];
        panels5 = new CeldaHorario[9];
        
        if(nombre.equals("total")){
            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][0]);
                Color turno_color=new Color(233, 239, 248);  
                panels0[i] = new CeldaHorario(texto,turno_color);
                this.add(panels0[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][1]);
                Color turno_color=new Color(191, 216, 241);
                panels1[i] = new CeldaHorario(texto,turno_color);
                this.add(panels1[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][2]);
                Color turno_color=new Color(156, 202, 249);
                panels2[i] = new CeldaHorario(texto,turno_color);
                this.add(panels2[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][3]);
                Color turno_color=new Color(108, 169, 231);
                panels3[i] = new CeldaHorario(texto,turno_color);
                this.add(panels3[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][4]);
                Color turno_color=new Color(66, 140, 215);
                panels4[i] = new CeldaHorario(texto,turno_color);
                this.add(panels4[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][5]);
                Color turno_color=new Color(255, 248, 210);
                panels5[i] = new CeldaHorario(texto,turno_color);
                this.add(panels5[i]);
            }                                        
        }else{
            
            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][0]);
                Color turno_color=new Color(233, 239, 248);  
                
                if(texto.equals(nombre)){
                    panels0[i] = new CeldaHorario(texto,turno_color);
                }else{
                    panels0[i] = new CeldaHorario("",turno_color);
                }
                
                this.add(panels0[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][1]);
                Color turno_color=new Color(191, 216, 241);
                if(texto.equals(nombre)){
                    panels1[i] = new CeldaHorario(texto,turno_color);
                }else{
                    panels1[i] = new CeldaHorario("",turno_color);
                }
                
                this.add(panels1[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][2]);
                Color turno_color=new Color(156, 202, 249);
                if(texto.equals(nombre)){
                    panels2[i] = new CeldaHorario(texto,turno_color);
                }else{
                    panels2[i] = new CeldaHorario("",turno_color);
                }
                
                this.add(panels2[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][3]);
                Color turno_color=new Color(108, 169, 231);
                if(texto.equals(nombre)){
                    panels3[i] = new CeldaHorario(texto,turno_color);
                }else{
                    panels3[i] = new CeldaHorario("",turno_color);
                }
                
                this.add(panels3[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][4]);
                Color turno_color=new Color(66, 140, 215);
               if(texto.equals(nombre)){
                    panels4[i] = new CeldaHorario(texto,turno_color);
                }else{
                    panels4[i] = new CeldaHorario("",turno_color);
                }
                
                this.add(panels4[i]);
            }

            for(int i=0;i<9;i++){
                String texto="Grupo "+Integer.toString(total[i][5]);
                Color turno_color=new Color(255, 248, 210);
                if(texto.equals(nombre)){
                    panels5[i] = new CeldaHorario(texto,turno_color);
                }else{
                    panels5[i] = new CeldaHorario("",turno_color);
                }
                
                this.add(panels5[i]);
            }   
        }
    }    
}
