/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package turno;

import org.jgap.*;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;
public class EnfermeraFuncionAptitud extends FitnessFunction{

      private double fitness; //La variable que llevara el valor de aptitud
    public EnfermeraFuncionAptitud(){
        fitness=0;
    }
    @Override
  public double evaluate(IChromosome cromosoma){
       
        
        evaluarVertical1(cromosoma);
       
       
        
        return fitness;
        
    }
    //Funciones
   
     public void evaluarVertical1(IChromosome cromosoma){
        //Casilla 1,2,...,24
        Integer v1=(Integer)cromosoma.getGene(0).getAllele();
        Integer v2=(Integer)cromosoma.getGene(1).getAllele();
        Integer v3=(Integer)cromosoma.getGene(2).getAllele();
        Integer v4=(Integer)cromosoma.getGene(3).getAllele();
        Integer v5=(Integer)cromosoma.getGene(4).getAllele();
        Integer v6=(Integer)cromosoma.getGene(5).getAllele();
        Integer v7=(Integer)cromosoma.getGene(6).getAllele();
        Integer v8=(Integer)cromosoma.getGene(7).getAllele();
        Integer v9=(Integer)cromosoma.getGene(8).getAllele();
        Integer v10=(Integer)cromosoma.getGene(9).getAllele();
        Integer v11=(Integer)cromosoma.getGene(10).getAllele();
        Integer v12=(Integer)cromosoma.getGene(11).getAllele();
        
        
        if(v1+v2+v3+v4+v5+v6+v7+v8+v9+v10+v11+v12==78)//Si la suma de la horizontal es 84, sumamos 84
            fitness=fitness+78;
    }
    
    
    
}
