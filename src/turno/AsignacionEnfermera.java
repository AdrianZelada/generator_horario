/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package turno;

import java.io.File;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.data.DataTreeBuilder;
import org.jgap.data.IDataCreators;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;
import org.jgap.xml.XMLDocumentBuilder;
import org.jgap.xml.XMLManager;
import org.w3c.dom.Document;
import org.jgap.impl.CrossoverOperator;
import org.jgap.impl.MutationOperator;
import org.jgap.InvalidConfigurationException;
public class AsignacionEnfermera {
     private static final int MAX_EVOLUCIONES_PERMITIDAS2=5;
  private static final int e=12;
    
   public static void mostrarEnfermera(IChromosome enfermeraSolucion){
      
   Integer v1=(Integer)enfermeraSolucion.getGene(0).getAllele();
    Integer v2=(Integer)enfermeraSolucion.getGene(1).getAllele();
    Integer v3=(Integer)enfermeraSolucion.getGene(2).getAllele();
     Integer v4=(Integer)enfermeraSolucion.getGene(3).getAllele();
     Integer v5=(Integer)enfermeraSolucion.getGene(4).getAllele();
    Integer v6=(Integer)enfermeraSolucion.getGene(5).getAllele();
    Integer  v7=(Integer)enfermeraSolucion.getGene(6).getAllele();
     Integer v8=(Integer) enfermeraSolucion.getGene(7).getAllele();
    Integer v9=(Integer) enfermeraSolucion.getGene(8).getAllele();
    Integer v10=(Integer) enfermeraSolucion.getGene(9).getAllele();
    Integer v11=(Integer) enfermeraSolucion.getGene(10).getAllele();
    Integer v12=(Integer) enfermeraSolucion.getGene(11).getAllele();
    

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
        System.out.println(v7);
        System.out.println(v8);
        System.out.println(v9);
        System.out.println(v10);
        System.out.println(v11);
        System.out.println(v12);
       
    }
       
     public  void calcularEnfermera()throws Exception{
        try{
            //Se crea una configuracion con valores predeterminados.
            //configuracion JGAP
            //-------------------------------------------------------
            Configuration conf=new DefaultConfiguration();
            // Se indica en la configuracion que el elemento mas apto siempre pase a
            //la proxima generacion
            conf.setPreservFittestIndividual(true);//Elitismo
            // Se crea la funcion de aptitud y se setea en la configuracion
            //Le indicamos a JGAP cual sera nuestra funcion de aptitud
            //----------------------------------------------------------------------
            FitnessFunction myFunc=new EnfermeraFuncionAptitud();
            conf.setFitnessFunction(myFunc);
            //Ahora se debe indicar a la configuracion como seran los cromosomas: en
            // este caso tendran 288 genes con un valor entero se debe crear un
            //cromosoma de ejemplo y cargarlo en la configuracion
            //cada gen tendra un valor maximo y minimo que debe setearse.
            Gene[] genEjemplo=new Gene[e];
            for(int i=0; i<e;i++){

            genEjemplo[i]=new IntegerGene(conf, 1,12);
            }
            //Creamos un individuo a partir de la configuracion de los genes anteriores
            IChromosome cromosomaEnfermera=new Chromosome(conf,genEjemplo);
            //Le indicamos a JGAP un ejemplo de como seran los individuos, a partir del
            //    //individuo de ejemplo que creamos
            conf.setSampleChromosome(cromosomaEnfermera);
            CrossoverOperator crossoverOperator=new CrossoverOperator(conf,10,true);
            MutationOperator mutationOperator=new MutationOperator(conf,50);//1/50 gene mutation rate
            conf.addGeneticOperator(crossoverOperator);
            conf.addGeneticOperator(mutationOperator);
            conf.setAlwaysCaculateFitness(true);
            conf.setMinimumPopSizePercent(90);
            //    //Por ultimo se debe indicar el tamaño de la poblacion en la configuracion
            //    //Creamos nuestra poblacion inicial
            //    //-------------------------------------------------------------------
            conf.setPopulationSize(5);
            Genotype Poblacion;
            // El framework permite obtener la poblacion inicial de archivo xml
            //    //pero para este caso particular resulta mejor crear una poblacion
            //    //aleatoria, para ello se utiliza el metodo randomInitialGenotype que
            //    //devuelve la poblacion ramdom creada
            Poblacion=Genotype.randomInitialGenotype(conf);
            //La poblacion debe evolucionr para obtener resultados mas aptos
            //    //-------------------------------------------------------------------
            long TiempoComienzo=System.currentTimeMillis();
            //generaciones
            for(int i=0; i<MAX_EVOLUCIONES_PERMITIDAS2; i++){
            Poblacion.evolve();

            //                System.out.println("Iteracion #" + i);
            //                IChromosome mejor_individuo=Poblacion.getFittestChromosome();
            //                mostrarTurno(mejor_individuo);
            }
            long TiempoFin=System.currentTimeMillis();
            System.out.println("Tiempo total de evoluciones:" + (TiempoFin-TiempoComienzo)+"ms");

            guardarPoblacion(Poblacion);


            //Una ves que la poblacion evoluciono es necesario obtener el cromosoma
            //    // mas apto para mostrarlo como solucion al problema planteado para ello
            //    // se utiliza el metodo getFittestChromosome();
            //    //Al final de las iteraciones, obtenemos el mejor individuo
            IChromosome cromosomaMasApto=Poblacion.getFittestChromosome();
            System.out.println("El cromosoma mas apto encontrado tiene un valor de aptitud de:"+cromosomaMasApto.getFitnessValue());
            System.out.println("Y esta formado por las siguiente distribucion de Enfermeras:");
            System.out.println("");
            System.out.println("");
            mostrarEnfermera(cromosomaMasApto);


        }
        catch (InvalidConfigurationException ex){
            System.out.println("No se pudo ejecutar el AG");
        }
    }
    
     //Este metodo permite guardar en un xml la ultima poblacion calculada
     //-----------------------------------------------------------------------

    public static void guardarPoblacion(Genotype Poblacion) throws Exception{
         DataTreeBuilder builder=DataTreeBuilder.getInstance();
       IDataCreators doc2=builder.representGenotypeAsDocument(Poblacion);
       //---------------------------------------------------------
       XMLDocumentBuilder docbuilder=new XMLDocumentBuilder();
       Document xmlDoc=(Document)docbuilder.buildDocument(doc2);
       XMLManager.writeFile(xmlDoc, new File("PoblacionAsignacionHorario.xml"));
    }

   
    
}
