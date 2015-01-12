/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enfermeria;

import horario_enfermeria.HorarrioGenerado;
import java.io.File;
import java.util.Random;
import java.util.StringTokenizer;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.DefaultFitnessEvaluator;
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
import org.jgap.impl.SwappingMutationOperator;


public class AsignacionHorario {
  private static final int MAX_EVOLUCIONES_PERMITIDAS=3000;
  private static final int NUMERO_GENES=72;
  private static final int TAMAÑO_POBLACION=200;
  private static int [][] retornar =new int[9][6];
  public static void mostrarTurno(IChromosome turnoSolucion){

        Integer c1=(Integer)turnoSolucion.getGene(0).getAllele();
        Integer c2=(Integer)turnoSolucion.getGene(1).getAllele();
        Integer c3=(Integer)turnoSolucion.getGene(2).getAllele();
        Integer c4=(Integer)turnoSolucion.getGene(3).getAllele();
        Integer c5=(Integer)turnoSolucion.getGene(4).getAllele();
        Integer c6=(Integer)turnoSolucion.getGene(5).getAllele();
        Integer c7=(Integer)turnoSolucion.getGene(6).getAllele();
        Integer c8=(Integer) turnoSolucion.getGene(7).getAllele();
        Integer c9=(Integer) turnoSolucion.getGene(8).getAllele();
        Integer c10=(Integer) turnoSolucion.getGene(9).getAllele();
        Integer c11=(Integer) turnoSolucion.getGene(10).getAllele();
        Integer c12=(Integer) turnoSolucion.getGene(11).getAllele();
        Integer c13=(Integer) turnoSolucion.getGene(12).getAllele();
        Integer c14=(Integer) turnoSolucion.getGene(13).getAllele();
        Integer c15=(Integer) turnoSolucion.getGene(14).getAllele();
        Integer c16=(Integer) turnoSolucion.getGene(15).getAllele();
        Integer c17=(Integer) turnoSolucion.getGene(16).getAllele();
        Integer c18=(Integer) turnoSolucion.getGene(17).getAllele();
        Integer c19=(Integer) turnoSolucion.getGene(18).getAllele();
        Integer c20=(Integer) turnoSolucion.getGene(19).getAllele();
        Integer c21=(Integer) turnoSolucion.getGene(20).getAllele();
        Integer c22=(Integer) turnoSolucion.getGene(21).getAllele();
        Integer c23=(Integer) turnoSolucion.getGene(22).getAllele();
        Integer c24=(Integer) turnoSolucion.getGene(23).getAllele();
        Integer c25=(Integer) turnoSolucion.getGene(24).getAllele();
        Integer c26=(Integer) turnoSolucion.getGene(25).getAllele();
        Integer c27=(Integer) turnoSolucion.getGene(26).getAllele();
        Integer c28=(Integer) turnoSolucion.getGene(27).getAllele();
        Integer c29=(Integer) turnoSolucion.getGene(28).getAllele();
        Integer c30=(Integer) turnoSolucion.getGene(29).getAllele();
        Integer c31=(Integer) turnoSolucion.getGene(30).getAllele();
        Integer c32=(Integer) turnoSolucion.getGene(31).getAllele();
        Integer c33=(Integer) turnoSolucion.getGene(32).getAllele();
        Integer c34=(Integer) turnoSolucion.getGene(33).getAllele();
        Integer c35=(Integer) turnoSolucion.getGene(34).getAllele();
        Integer c36=(Integer) turnoSolucion.getGene(35).getAllele();
        Integer c37=(Integer) turnoSolucion.getGene(36).getAllele();
        Integer c38=(Integer) turnoSolucion.getGene(37).getAllele();
        Integer c39=(Integer) turnoSolucion.getGene(38).getAllele();
        Integer c40=(Integer) turnoSolucion.getGene(39).getAllele();
        Integer c41=(Integer) turnoSolucion.getGene(40).getAllele();
        Integer c42=(Integer) turnoSolucion.getGene(41).getAllele();
        Integer c43=(Integer) turnoSolucion.getGene(42).getAllele();
        Integer c44=(Integer) turnoSolucion.getGene(43).getAllele();
        Integer c45=(Integer) turnoSolucion.getGene(44).getAllele();
        Integer c46=(Integer) turnoSolucion.getGene(45).getAllele();
        Integer c47=(Integer) turnoSolucion.getGene(46).getAllele();
        Integer c48=(Integer) turnoSolucion.getGene(47).getAllele();
        Integer c49=(Integer) turnoSolucion.getGene(48).getAllele();
        Integer c50=(Integer) turnoSolucion.getGene(49).getAllele();
        Integer c51=(Integer) turnoSolucion.getGene(50).getAllele();
        Integer c52=(Integer) turnoSolucion.getGene(51).getAllele();
        Integer c53=(Integer) turnoSolucion.getGene(52).getAllele();
        Integer c54=(Integer) turnoSolucion.getGene(53).getAllele();
        Integer c55=(Integer) turnoSolucion.getGene(54).getAllele();
        Integer c56=(Integer) turnoSolucion.getGene(55).getAllele();
        Integer c57=(Integer) turnoSolucion.getGene(56).getAllele();
        Integer c58=(Integer) turnoSolucion.getGene(57).getAllele();
        Integer c59=(Integer) turnoSolucion.getGene(58).getAllele();
        Integer c60=(Integer) turnoSolucion.getGene(59).getAllele();
        Integer c61=(Integer) turnoSolucion.getGene(60).getAllele();
        Integer c62=(Integer) turnoSolucion.getGene(61).getAllele();
        Integer c63=(Integer) turnoSolucion.getGene(62).getAllele();
        Integer c64=(Integer) turnoSolucion.getGene(63).getAllele();
        Integer c65=(Integer) turnoSolucion.getGene(64).getAllele();
        Integer c66=(Integer) turnoSolucion.getGene(65).getAllele();
        Integer c67=(Integer) turnoSolucion.getGene(66).getAllele();
        Integer c68=(Integer) turnoSolucion.getGene(67).getAllele();
        Integer c69=(Integer) turnoSolucion.getGene(68).getAllele();
        Integer c70=(Integer) turnoSolucion.getGene(69).getAllele();
        Integer c71=(Integer) turnoSolucion.getGene(70).getAllele();
        Integer c72=(Integer) turnoSolucion.getGene(71).getAllele();
        int[]newarray=arrayRand(1,6,6);
/*
        System.out.println(newarray[0]+"      "+newarray[5]+"      "+newarray[4]+"      "+newarray[3]+"      "+newarray[2]+"      "+newarray[1]+"       "+newarray[0]+"      "+newarray[5]+"      "+newarray[4]);
        System.out.println("");
        System.out.println(newarray[1]+"      "+newarray[0]+"      "+newarray[5]+"      "+newarray[4]+"      "+newarray[3]+"      "+newarray[2]+"       "+newarray[1]+"      "+newarray[0]+"      "+newarray[5]);
        System.out.println("");
        System.out.println(newarray[2]+"      "+newarray[1]+"      "+newarray[0]+"      "+newarray[5]+"      "+newarray[4]+"      "+newarray[3]+"       "+newarray[2]+"      "+newarray[1]+"      "+newarray[0]);
        System.out.println("");
        System.out.println(newarray[3]+"      "+newarray[2]+"      "+newarray[1]+"      "+newarray[0]+"      "+newarray[5]+"      "+newarray[4]+"       "+newarray[3]+"      "+newarray[2]+"      "+newarray[1]);
        System.out.println("");
        System.out.println(newarray[4]+"      "+newarray[3]+"      "+newarray[2]+"      "+newarray[1]+"      "+newarray[0]+"      "+newarray[5]+"       "+newarray[4]+"      "+newarray[3]+"      "+newarray[2]);
        System.out.println("");
        System.out.println(newarray[5]+"      "+newarray[4]+"      "+newarray[3]+"      "+newarray[2]+"      "+newarray[1]+"      "+newarray[0]+"       "+newarray[5]+"      "+newarray[4]+"      "+newarray[3]);        
       */ 
        int cont=0;                
        int ce=0;
        for(int d=0;d<9;d++){
            
            for(int j=0;j<=5;j++){            
                retornar[d][j]=newarray[cont];                              
                if(j!=5){
                    if(cont==5){
                        cont=-1;
                    }
                    cont++;
                }
            }                                     
        }           
    }    
  public int [][] getTotal(){
      return retornar;
  }
  public String [] getArray(int x){
      
      String retor[]=new String[12];
      for(int i=0;i<=5;i++){          
          retor[i]="Grupo "+Integer.toString(retornar[x][i]);          
      }
      return retor;
  }
  

    public void calcularHorario()throws Exception{
        // Agoritmo Genetico
        try{
            //Se crea una configuracion con valores predeterminados.
            //configuracion JGAP
            //inicia con una DefaultConfiguration, que viene configurado con los
            //ajustes mas comunes
           //-------------------------------------------------------
            Configuration configuracion=new DefaultConfiguration();//Configuracion por defecto del JGAP (cruza, mutacion, seleccion, etc)
            // Se indica en la configuracion que el elemento mas apto siempre pase a
            //la proxima generacion
            configuracion.setPreservFittestIndividual(true);//Elitismo
            // Se crea la funcion de aptitud y se setea en la configuracion
            //Le indicamos a JGAP cual sera nuestra funcion de aptitud
            //creamos la funcion aptitud ó funcion fitness y la seteamos en la configuracion
            //Se cambia el evaluador de aptitud
            //----------------------------------------------------------------------
            FitnessFunction funTur=new HorarioFuncionAptitud();// clase donde definimos la fcn de aptitud
            configuracion.setFitnessFunction(funTur);
            //Ahora se debe indicar a la configuracion como seran los cromosomas: en
            // este caso tendran 72 genes con un valor entero se debe crear un
            //cromosoma de ejemplo y cargarlo en la configuracion
            //cada gen tendra un valor maximo y minimo que debe setearse.
            //Ahora se crea genes de prueba para configurar el problema
            //por lo tanto utilizamos la clase InterGene para representar cada uno de los genes
            Gene[] sampleGenes=new Gene[NUMERO_GENES];
            //Creamos una codificacion de 72 genes que nos servira para nuestro
            // individuos (fenotipo) los genes seran valores entre 1 y 6
            for(int K=0; K<NUMERO_GENES;K++){
                sampleGenes[K]=new IntegerGene(configuracion, 1,6);
            }
            //Creamos un individuo a partir de la configuracion de los genes anteriores
            IChromosome cromosomaAsignacion=new Chromosome(configuracion,sampleGenes);
            //Le indicamos a JGAP un ejemplo de como seran los individuos, a partir del
            //individuo de ejemplo que creamos
            configuracion.setSampleChromosome(cromosomaAsignacion);

            //Por ultimo se debe indicar el tamaño de la poblacion en la configuracion
            //Creamos nuestra poblacion inicial
            //Cuantos cromosomas en la poblacion
            //-------------------------------------------------------------------
            configuracion.setPopulationSize(TAMAÑO_POBLACION);
            Genotype Poblacion;
            // El framework permite obtener la poblacion inicial de archivo xml
            //pero para este caso particular resulta mejor crear una poblacion
            //aleatoria, para ello se utiliza el metodo randomInitialGenotype que
            //devuelve la poblacion ramdom creada
            //Creamos el genotipo de la poblacion
            //Recordemos que el genotipo se determina del fenotipo=la configuracion de los genes para un cromosoma particular
            //Creamos una poblacion aleatoria utilizando el metodo randomInitialtype
            Poblacion=Genotype.randomInitialGenotype(configuracion);
            //La poblacion debe evolucionr para obtener resultados mas aptos
            //-------------------------------------------------------------------
            long TiempoComienzo=System.currentTimeMillis();
            //Comienza a iterar el algoritmo
            //por ejemplo 100 iteraciones, cada iteracion sera una generacion
            for(int i=0; i<MAX_EVOLUCIONES_PERMITIDAS; i++){
            Poblacion.evolve();
            //System.out.println("Iteracion #" + i);
            //IChromosome mejor_individuo=Poblacion.getFittestChromosome();//Obtenemos el mejor individuo para este generacion
            //System.out.println("Mejor individuo de la generacion"+i+":");
            //mostrarTurno(mejor_individuo);
            // System.out.println("Valor de aptitud obtenido."+mejor_individuo.getFitnessValue());
            }
            long TiempoFin=System.currentTimeMillis();
            //System.out.println("Tiempo total de evoluciones:" + (TiempoFin-TiempoComienzo)+"ms");
            guardarPoblacion(Poblacion);
            // Al final de las iteraciones, obtenemos el mejor individuo
            //Una ves que la poblacion evoluciono es necesario obtener el cromosoma
            // mas apto para mostrarlo como solucion al problema planteado para ello
            // se utiliza el metodo getFittestChromosome();
            //Al final de las iteraciones, obtenemos el mejor individuo
            IChromosome cromosomaMasApto=Poblacion.getFittestChromosome();//mejor individuo obtenido obtenemos el mejor individuo para esta generacion
            //Mostramos el valor obtenido en la funcion de aptitud para el mejor individuo

            mostrarTurno(cromosomaMasApto);//Mostrar al individuo

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

    public static int[] arrayRand(int desde, int hasta, int tam) {
        int[] numeros = new int[tam];
        Random rnd = new Random();
        int n;
        for (int i = 0; i < numeros.length; i++) {
            do {
                n = rnd.nextInt(hasta - desde + 1) + desde;
            } while (iftake(numeros, i, n));
            numeros[i] = n;
        }
        return numeros;
    }

    public static boolean iftake(int[] numeros, int indice, int valor) {
        for (int i = 0; i < indice; i++) {
            if (numeros[i] == valor) {
                return true;
            }
        }
        return false;
    }
    
}
