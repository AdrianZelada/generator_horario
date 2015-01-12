/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enfermeria;
import turno.*;
import java.util.ArrayList;
import java.util.List;
import org.jgap.*;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;
import org.jgap.impl.IntegerGene;
public class HorarioFuncionAptitud extends FitnessFunction{
    private double fitness; //La variable que llevara el valor de aptitud
    public HorarioFuncionAptitud(){
        fitness=0;// la aptitud es 0
    }
    @Override
    protected double evaluate(IChromosome cromosoma){
        evaluarVertical1(cromosoma);
        evaluarVertical2(cromosoma);
        evaluarVertical3(cromosoma);
        evaluarVertical4(cromosoma);
        evaluarVertical5(cromosoma);
        evaluarVertical6(cromosoma);
        return fitness;
        
    }

    public void verificarRepetidos(IChromosome cromosoma){
        Integer c1=(Integer)cromosoma.getGene(0).getAllele();
        Integer c2=(Integer)cromosoma.getGene(1).getAllele();
        Integer c3=(Integer)cromosoma.getGene(2).getAllele();
        Integer c4=(Integer)cromosoma.getGene(3).getAllele();
        Integer c5=(Integer)cromosoma.getGene(4).getAllele();
        Integer c6=(Integer)cromosoma.getGene(5).getAllele();
        
        if((c1.compareTo(c2)!=0)&&(c1.compareTo(c3)!=0)&&(c1.compareTo(c4)!=0)&&(c1.compareTo(c5)!=0)&&(c1.compareTo(c6)!=0))
        {
            fitness=fitness+5;
        }
        if((c2.compareTo(c1)!=0)&&(c2.compareTo(c3)!=0)&&(c2.compareTo(c4)!=0)&&(c2.compareTo(c5)!=0)&&(c2.compareTo(c6)!=0))
        {
            fitness=fitness+5;
        }
        if((c3.compareTo(c1)!=0)&&(c3.compareTo(c2)!=0)&&(c3.compareTo(c4)!=0)&&(c3.compareTo(c5)!=0)&&(c3.compareTo(c6)!=0))
        {
            fitness=fitness+5;
        }
        if((c4.compareTo(c2)!=0)&&(c4.compareTo(c3)!=0)&&(c4.compareTo(c1)!=0)&&(c4.compareTo(c5)!=0)&&(c4.compareTo(c6)!=0))
        {
            fitness=fitness+5;
        }
        if((c5.compareTo(c2)!=0)&&(c5.compareTo(c3)!=0)&&(c5.compareTo(c4)!=0)&&(c5.compareTo(c1)!=0)&&(c5.compareTo(c6)!=0))
        {
            fitness=fitness+5;
        }
        if((c6.compareTo(c2)!=0)&&(c6.compareTo(c3)!=0)&&(c6.compareTo(c4)!=0)&&(c6.compareTo(c5)!=0)&&(c6.compareTo(c1)!=0))
        {
            fitness=fitness+5;
        }
        Integer c7=(Integer)cromosoma.getGene(6).getAllele();
        Integer c8=(Integer)cromosoma.getGene(7).getAllele();
        Integer c9=(Integer)cromosoma.getGene(8).getAllele();
        Integer c10=(Integer)cromosoma.getGene(9).getAllele();
        Integer c11=(Integer)cromosoma.getGene(10).getAllele();
        Integer c12=(Integer)cromosoma.getGene(11).getAllele();
        if((c7.compareTo(c8)!=0)&&(c7.compareTo(c9)!=0)&&(c7.compareTo(c10)!=0)&&(c7.compareTo(c11)!=0)&&(c7.compareTo(c12)!=0))
        {
            fitness=fitness+5;
        }
        if((c8.compareTo(c7)!=0)&&(c8.compareTo(c9)!=0)&&(c8.compareTo(c10)!=0)&&(c8.compareTo(c11)!=0)&&(c8.compareTo(c12)!=0))
        {
            fitness=fitness+5;
        }
        if((c9.compareTo(c8)!=0)&&(c9.compareTo(c7)!=0)&&(c9.compareTo(c10)!=0)&&(c9.compareTo(c11)!=0)&&(c9.compareTo(c12)!=0))
        {
            fitness=fitness+5;
        }
        if((c10.compareTo(c8)!=0)&&(c10.compareTo(c9)!=0)&&(c10.compareTo(c7)!=0)&&(c10.compareTo(c11)!=0)&&(c10.compareTo(c12)!=0))
        {
            fitness=fitness+5;
        }
        if((c11.compareTo(c8)!=0)&&(c11.compareTo(c9)!=0)&&(c11.compareTo(c10)!=0)&&(c11.compareTo(7)!=0)&&(c11.compareTo(c12)!=0))
        {
            fitness=fitness+5;
        }
        if((c12.compareTo(c8)!=0)&&(c12.compareTo(c9)!=0)&&(c12.compareTo(c10)!=0)&&(c12.compareTo(c11)!=0)&&(c12.compareTo(c7)!=0))
        {
            fitness=fitness+5;
        }
        Integer c13=(Integer)cromosoma.getGene(12).getAllele();
        Integer c14=(Integer)cromosoma.getGene(13).getAllele();
        Integer c15=(Integer)cromosoma.getGene(14).getAllele();
        Integer c16=(Integer)cromosoma.getGene(15).getAllele();
        Integer c17=(Integer)cromosoma.getGene(16).getAllele();
        Integer c18=(Integer)cromosoma.getGene(17).getAllele();
        if((c1.compareTo(c2)!=0)&&(c1.compareTo(c3)!=0)&&(c1.compareTo(c4)!=0)&&(c1.compareTo(c5)!=0)&&(c1.compareTo(c6)!=0))
        {
            fitness=fitness+5;
        }
        if((c2.compareTo(c1)!=0)&&(c2.compareTo(c3)!=0)&&(c2.compareTo(c4)!=0)&&(c2.compareTo(c5)!=0)&&(c2.compareTo(c6)!=0))
        {
             fitness=fitness+5;
        }
        if((c3.compareTo(c1)!=0)&&(c3.compareTo(c2)!=0)&&(c3.compareTo(c4)!=0)&&(c3.compareTo(c5)!=0)&&(c3.compareTo(c6)!=0))
        {
        fitness=fitness+5;
        }
                   if((c4.compareTo(c2)!=0)&&(c4.compareTo(c3)!=0)&&(c4.compareTo(c1)!=0)&&(c4.compareTo(c5)!=0)&&(c4.compareTo(c6)!=0))
        {
         fitness=fitness+5;
    }
                      if((c5.compareTo(c2)!=0)&&(c5.compareTo(c3)!=0)&&(c5.compareTo(c4)!=0)&&(c5.compareTo(c1)!=0)&&(c5.compareTo(c6)!=0))
        {
         fitness=fitness+5;
    }
                         if((c6.compareTo(c2)!=0)&&(c6.compareTo(c3)!=0)&&(c6.compareTo(c4)!=0)&&(c6.compareTo(c5)!=0)&&(c6.compareTo(c1)!=0))
        {
         fitness=fitness+5;
    }
        
        Integer c28=(Integer)cromosoma.getGene(27).getAllele();
        Integer c29=(Integer)cromosoma.getGene(28).getAllele();
        Integer c30=(Integer)cromosoma.getGene(29).getAllele();
        Integer c31=(Integer)cromosoma.getGene(30).getAllele();
        Integer c32=(Integer)cromosoma.getGene(31).getAllele();
        Integer c33=(Integer)cromosoma.getGene(32).getAllele();
          if((c28.compareTo(c29)!=0)&&(c28.compareTo(c30)!=0)&&(c28.compareTo(c31)!=0)&&(c28.compareTo(c32)!=0)&&(c28.compareTo(c33)!=0))
        {
         fitness=fitness+5;
    }
            if((c28.compareTo(c29)!=0)&&(c28.compareTo(c30)!=0)&&(c28.compareTo(c31)!=0)&&(c28.compareTo(c32)!=0)&&(c28.compareTo(c33)!=0))
        {
         fitness=fitness+5;
    }
              if((c29.compareTo(c28)!=0)&&(c29.compareTo(c30)!=0)&&(c29.compareTo(c31)!=0)&&(c29.compareTo(c32)!=0)&&(c29.compareTo(c33)!=0))
        {
         fitness=fitness+5;
    }
                if((c30.compareTo(c29)!=0)&&(c30.compareTo(c28)!=0)&&(c30.compareTo(c31)!=0)&&(c30.compareTo(c32)!=0)&&(c30.compareTo(c33)!=0))
        {
         fitness=fitness+5;
    }
                  if((c31.compareTo(c29)!=0)&&(c31.compareTo(c30)!=0)&&(c31.compareTo(c28)!=0)&&(c31.compareTo(c32)!=0)&&(c31.compareTo(c33)!=0))
        {
         fitness=fitness+5;
    }
                    if((c32.compareTo(c29)!=0)&&(c32.compareTo(c30)!=0)&&(c32.compareTo(c31)!=0)&&(c32.compareTo(c28)!=0)&&(c32.compareTo(c33)!=0))
        {
         fitness=fitness+5;
    }
                      if((c33.compareTo(c29)!=0)&&(c33.compareTo(c30)!=0)&&(c33.compareTo(c31)!=0)&&(c33.compareTo(c32)!=0)&&(c33.compareTo(c28)!=0))
        {
         fitness=fitness+5;
    }
         
       
        Integer c34=(Integer)cromosoma.getGene(33).getAllele();
        Integer c35=(Integer)cromosoma.getGene(34).getAllele();
        Integer c36=(Integer)cromosoma.getGene(35).getAllele();
        Integer c46=(Integer)cromosoma.getGene(45).getAllele();
        Integer c47=(Integer)cromosoma.getGene(46).getAllele();
        Integer c48=(Integer)cromosoma.getGene(47).getAllele();
        
          if((c34.compareTo(c35)!=0)&&(c34.compareTo(c36)!=0)&&(c34.compareTo(c46)!=0)&&(c34.compareTo(c47)!=0)&&(c34.compareTo(c48)!=0))
        {
         fitness=fitness+5;
    }
           if((c35.compareTo(c34)!=0)&&(c35.compareTo(c36)!=0)&&(c35.compareTo(c46)!=0)&&(c35.compareTo(c47)!=0)&&(c35.compareTo(c48)!=0))
        {
         fitness=fitness+5;
    }
               if((c36.compareTo(c35)!=0)&&(c36.compareTo(c34)!=0)&&(c36.compareTo(c46)!=0)&&(c36.compareTo(c47)!=0)&&(c36.compareTo(c48)!=0))
        {
         fitness=fitness+5;
    }
                   if((c46.compareTo(c35)!=0)&&(c46.compareTo(c36)!=0)&&(c46.compareTo(c34)!=0)&&(c46.compareTo(c47)!=0)&&(c46.compareTo(c48)!=0))
        {
         fitness=fitness+5;
    }
                       if((c47.compareTo(c35)!=0)&&(c47.compareTo(c36)!=0)&&(c47.compareTo(c46)!=0)&&(c47.compareTo(c34)!=0)&&(c34.compareTo(c48)!=0))
        {
         fitness=fitness+5;
    }
                           if((c48.compareTo(c35)!=0)&&(c48.compareTo(c36)!=0)&&(c48.compareTo(c46)!=0)&&(c48.compareTo(c47)!=0)&&(c48.compareTo(c34)!=0))
        {
         fitness=fitness+5;
    }
      
         Integer c49=(Integer)cromosoma.getGene(48).getAllele();
        Integer c50=(Integer)cromosoma.getGene(49).getAllele();
        Integer c51=(Integer)cromosoma.getGene(50).getAllele();
        Integer c52=(Integer)cromosoma.getGene(51).getAllele();
        Integer c53=(Integer)cromosoma.getGene(52).getAllele();
        Integer c54=(Integer)cromosoma.getGene(53).getAllele();
          if((c49.compareTo(c50)!=0)&&(c49.compareTo(c51)!=0)&&(c49.compareTo(c52)!=0)&&(c49.compareTo(c53)!=0)&&(c49.compareTo(c54)!=0))
        {
         fitness=fitness+5;
    }
           if((c50.compareTo(c49)!=0)&&(c50.compareTo(c51)!=0)&&(c50.compareTo(c52)!=0)&&(c50.compareTo(c53)!=0)&&(c50.compareTo(c54)!=0))
        {
         fitness=fitness+5;
    }
            if((c51.compareTo(c50)!=0)&&(c51.compareTo(c49)!=0)&&(c51.compareTo(c52)!=0)&&(c51.compareTo(c53)!=0)&&(c51.compareTo(c54)!=0))
        {
         fitness=fitness+5;
    }
             if((c52.compareTo(c50)!=0)&&(c52.compareTo(c51)!=0)&&(c52.compareTo(c49)!=0)&&(c52.compareTo(c53)!=0)&&(c52.compareTo(c54)!=0))
        {
         fitness=fitness+5;
    }
              if((c53.compareTo(c50)!=0)&&(c53.compareTo(c51)!=0)&&(c53.compareTo(c52)!=0)&&(c53.compareTo(c49)!=0)&&(c53.compareTo(c54)!=0))
        {
         fitness=fitness+5;
    }
               if((c54.compareTo(c50)!=0)&&(c54.compareTo(c51)!=0)&&(c54.compareTo(c52)!=0)&&(c54.compareTo(c53)!=0)&&(c54.compareTo(c49)!=0))
        {
         fitness=fitness+5;
    }
     
             
                 
        Integer c55=(Integer)cromosoma.getGene(54).getAllele();
        Integer c56=(Integer)cromosoma.getGene(55).getAllele();
        Integer c57=(Integer)cromosoma.getGene(56).getAllele();
        Integer c58=(Integer)cromosoma.getGene(57).getAllele();
        Integer c59=(Integer)cromosoma.getGene(58).getAllele();
        Integer c60=(Integer)cromosoma.getGene(59).getAllele();
          if((c55.compareTo(c56)!=0)&&(c55.compareTo(c57)!=0)&&(c55.compareTo(c58)!=0)&&(c55.compareTo(c59)!=0)&&(c55.compareTo(c60)!=0))
        {
         fitness=fitness+5;
    }
            if((c56.compareTo(c55)!=0)&&(c56.compareTo(c57)!=0)&&(c56.compareTo(c58)!=0)&&(c56.compareTo(c59)!=0)&&(c56.compareTo(c60)!=0))
        {
         fitness=fitness+5;
    }
              if((c57.compareTo(c56)!=0)&&(c57.compareTo(c55)!=0)&&(c57.compareTo(c58)!=0)&&(c57.compareTo(c59)!=0)&&(c57.compareTo(c60)!=0))
        {
         fitness=fitness+5;
    }
                if((c58.compareTo(c56)!=0)&&(c58.compareTo(c57)!=0)&&(c58.compareTo(c55)!=0)&&(c58.compareTo(c59)!=0)&&(c58.compareTo(c60)!=0))
        {
         fitness=fitness+5;
    }
                  if((c59.compareTo(c56)!=0)&&(c59.compareTo(c57)!=0)&&(c59.compareTo(c58)!=0)&&(c59.compareTo(c55)!=0)&&(c59.compareTo(c60)!=0))
        {
         fitness=fitness+5;
    }
                    if((c60.compareTo(c56)!=0)&&(c60.compareTo(c57)!=0)&&(c60.compareTo(c58)!=0)&&(c60.compareTo(c59)!=0)&&(c60.compareTo(c55)!=0))
        {
         fitness=fitness+5;
    }
           
        Integer c61=(Integer)cromosoma.getGene(60).getAllele();
        Integer c62=(Integer)cromosoma.getGene(61).getAllele();
        Integer c63=(Integer)cromosoma.getGene(62).getAllele();
       Integer c64=(Integer)cromosoma.getGene(63).getAllele();
       Integer c65=(Integer)cromosoma.getGene(64).getAllele();
       Integer c66=(Integer)cromosoma.getGene(65).getAllele();
         if((c61.compareTo(c62)!=0)&&(c61.compareTo(c63)!=0)&&(c61.compareTo(c64)!=0)&&(c61.compareTo(c65)!=0)&&(c61.compareTo(c66)!=0))
        {
         fitness=fitness+5;
    }
        if((c62.compareTo(c61)!=0)&&(c62.compareTo(c63)!=0)&&(c62.compareTo(c64)!=0)&&(c62.compareTo(c65)!=0)&&(c62.compareTo(c66)!=0))
        {
         fitness=fitness+5;
    }
         if((c63.compareTo(c62)!=0)&&(c63.compareTo(c61)!=0)&&(c63.compareTo(c64)!=0)&&(c63.compareTo(c65)!=0)&&(c63.compareTo(c66)!=0))
        {
         fitness=fitness+5;
    }
          if((c64.compareTo(c62)!=0)&&(c64.compareTo(c63)!=0)&&(c64.compareTo(c61)!=0)&&(c64.compareTo(c65)!=0)&&(c64.compareTo(c66)!=0))
        {
         fitness=fitness+5;
    }
           if((c65.compareTo(c62)!=0)&&(c65.compareTo(c63)!=0)&&(c65.compareTo(c64)!=0)&&(c65.compareTo(c61)!=0)&&(c65.compareTo(c66)!=0))
        {
         fitness=fitness+5;
    }
            if((c66.compareTo(c62)!=0)&&(c66.compareTo(c63)!=0)&&(c61.compareTo(c64)!=0)&&(c66.compareTo(c65)!=0)&&(c66.compareTo(c61)!=0))
        {
         fitness=fitness+5;
    }
       Integer c67=(Integer)cromosoma.getGene(66).getAllele();
       Integer c68=(Integer)cromosoma.getGene(67).getAllele();
       Integer c69=(Integer)cromosoma.getGene(68).getAllele();
       Integer c70=(Integer)cromosoma.getGene(69).getAllele();
       Integer c71=(Integer)cromosoma.getGene(70).getAllele();
       Integer c72=(Integer)cromosoma.getGene(71).getAllele();
          if((c67.compareTo(c68)!=0)&&(c67.compareTo(c69)!=0)&&(c67.compareTo(c70)!=0)&&(c67.compareTo(c71)!=0)&&(c67.compareTo(c72)!=0))
        {
         fitness=fitness+5;
    }
           if((c68.compareTo(c67)!=0)&&(c68.compareTo(c69)!=0)&&(c68.compareTo(c70)!=0)&&(c68.compareTo(c71)!=0)&&(c68.compareTo(c72)!=0))
        {
         fitness=fitness+5;
    }
            if((c69.compareTo(c68)!=0)&&(c69.compareTo(c67)!=0)&&(c69.compareTo(c70)!=0)&&(c69.compareTo(c71)!=0)&&(c69.compareTo(c72)!=0))
        {
         fitness=fitness+5;
    }
             if((c70.compareTo(c68)!=0)&&(c70.compareTo(c69)!=0)&&(c70.compareTo(c67)!=0)&&(c70.compareTo(c71)!=0)&&(c70.compareTo(c72)!=0))
        {
         fitness=fitness+5;
    }
              if((c71.compareTo(c68)!=0)&&(c71.compareTo(c69)!=0)&&(c71.compareTo(c70)!=0)&&(c71.compareTo(c67)!=0)&&(c71.compareTo(c72)!=0))
        {
         fitness=fitness+5;
    }
               if((c72.compareTo(c68)!=0)&&(c72.compareTo(c69)!=0)&&(c72.compareTo(c70)!=0)&&(c72.compareTo(c71)!=0)&&(c72.compareTo(c67)!=0))
        {
         fitness=fitness+5;
    }
    }

    public double evaluarVertical1(IChromosome cromosoma){
         int acumulado=0;
         int a,b;
         for(int k=0; k<12; k+=2){
             
             a=(Integer)cromosoma.getGene(k).getAllele();
             b=(Integer)cromosoma.getGene(k+6).getAllele();
             
             acumulado=a+b;
             if((a*2)==acumulado){
                 acumulado-=1;
                
             }
         }
         if(acumulado!=42) return (double)0.1;
         else return (double)0.9;
     }

    public void evaluarVertical2(IChromosome cromosoma){
        //Casilla 25,26,..48
        Integer c2=(Integer)cromosoma.getGene(1).getAllele();
        Integer c8=(Integer)cromosoma.getGene(7).getAllele();
        Integer c14=(Integer)cromosoma.getGene(13).getAllele();
        Integer c20=(Integer)cromosoma.getGene(19).getAllele();
        Integer c26=(Integer)cromosoma.getGene(25).getAllele();
        Integer c32=(Integer)cromosoma.getGene(31).getAllele();
        Integer c38=(Integer)cromosoma.getGene(37).getAllele();
        Integer c44=(Integer)cromosoma.getGene(43).getAllele();
        Integer c50=(Integer)cromosoma.getGene(51).getAllele();
        Integer c56=(Integer)cromosoma.getGene(55).getAllele();
        Integer c62=(Integer)cromosoma.getGene(61).getAllele();
        Integer c68=(Integer)cromosoma.getGene(67).getAllele();
        if(c2+c8+c14+c20+c26+c32+c38+c44+c50+c56+c62+c68==42)//Si la suma de la horizontal es 84, sumamos 84
           fitness=fitness+42; 
    }  

    public void evaluarVertical3(IChromosome cromosoma){
        Integer c3=(Integer)cromosoma.getGene(2).getAllele();
        Integer c9=(Integer)cromosoma.getGene(8).getAllele();
        Integer c15=(Integer)cromosoma.getGene(14).getAllele();
        Integer c21=(Integer)cromosoma.getGene(20).getAllele();
        Integer c27=(Integer)cromosoma.getGene(26).getAllele();
        Integer c33=(Integer)cromosoma.getGene(32).getAllele();
        Integer c39=(Integer)cromosoma.getGene(38).getAllele();
        Integer c45=(Integer)cromosoma.getGene(44).getAllele();
        Integer c51=(Integer)cromosoma.getGene(50).getAllele();
        Integer c57=(Integer)cromosoma.getGene(56).getAllele();
        Integer c63=(Integer)cromosoma.getGene(62).getAllele();
        Integer c69=(Integer)cromosoma.getGene(68).getAllele();
        if(c3+c9+c15+c21+c27+c33+c39+c45+c51+c57+c63+c69==42)//Si la suma de la horizontal es 84, sumamos 84
           fitness=fitness+42; 
    }

    public void evaluarVertical4(IChromosome cromosoma){
        // Casilla 73,74,...96
         Integer c4=(Integer)cromosoma.getGene(3).getAllele();
        Integer c10=(Integer)cromosoma.getGene(9).getAllele();
        Integer c16=(Integer)cromosoma.getGene(15).getAllele();
        Integer c22=(Integer)cromosoma.getGene(21).getAllele();
        Integer c28=(Integer)cromosoma.getGene(27).getAllele();
        Integer c34=(Integer)cromosoma.getGene(33).getAllele();
        Integer c40=(Integer)cromosoma.getGene(39).getAllele();
        Integer c46=(Integer)cromosoma.getGene(45).getAllele();
        Integer c52=(Integer)cromosoma.getGene(51).getAllele();
        Integer c58=(Integer)cromosoma.getGene(57).getAllele();
        Integer c64=(Integer)cromosoma.getGene(63).getAllele();
        Integer c70=(Integer)cromosoma.getGene(69).getAllele();
        if(c4+c10+c16+c28+c34+c40+c46+c52+c58+c64+c70==42)//Si la suma de la horizontal es 84, sumamos 84
           fitness=fitness+42; 
    }

    public void evaluarVertical5(IChromosome cromosoma){
        Integer c5=(Integer)cromosoma.getGene(4).getAllele();
        Integer c11=(Integer)cromosoma.getGene(10).getAllele();
        Integer c17=(Integer)cromosoma.getGene(16).getAllele();
        Integer c23=(Integer)cromosoma.getGene(22).getAllele();
        Integer c29=(Integer)cromosoma.getGene(28).getAllele();
        Integer c35=(Integer)cromosoma.getGene(34).getAllele();
        Integer c41=(Integer)cromosoma.getGene(40).getAllele();
        Integer c47=(Integer)cromosoma.getGene(46).getAllele();
        Integer c53=(Integer)cromosoma.getGene(52).getAllele();
        Integer c59=(Integer)cromosoma.getGene(58).getAllele();
        Integer c65=(Integer)cromosoma.getGene(64).getAllele();
        Integer c71=(Integer)cromosoma.getGene(70).getAllele();
        if(c5+c11+c17+c23+c29+c35+c41+c47+c53+c59+c65+c71==42)//Si la suma de la horizontal es 84, sumamos 84
           fitness=fitness+42; 
    }

    public void evaluarVertical6(IChromosome cromosoma){
        Integer c6=(Integer)cromosoma.getGene(5).getAllele();
        Integer c12=(Integer)cromosoma.getGene(11).getAllele();
        Integer c18=(Integer)cromosoma.getGene(17).getAllele();
        Integer c24=(Integer)cromosoma.getGene(23).getAllele();
        Integer c30=(Integer)cromosoma.getGene(31).getAllele();
        Integer c36=(Integer)cromosoma.getGene(35).getAllele();
        Integer c42=(Integer)cromosoma.getGene(41).getAllele();
        Integer c48=(Integer)cromosoma.getGene(47).getAllele();
        Integer c54=(Integer)cromosoma.getGene(53).getAllele();
        Integer c60=(Integer)cromosoma.getGene(59).getAllele();
        Integer c66=(Integer)cromosoma.getGene(65).getAllele();
        Integer c72=(Integer)cromosoma.getGene(71).getAllele();
        if(c6+c12+c18+c24+c30+c36+c42+c48+c54+c60+c66+c72==42)//Si la suma de la horizontal es 84, sumamos 84
           fitness=fitness+42; 
    }

}
