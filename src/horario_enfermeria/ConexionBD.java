/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_enfermeria;
/**
 *
 * @author Zelada_Torrez
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConexionBD {
    public void ConectarDB(){
        Connection con;
        ResultSet rs;

        try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/enfermerasdb",
           "root", "");
            // Creamos un Statement para poder hacer peticiones a la bd
            Statement stat = con.createStatement();
           // Insertar 2 filas en la tabla Motor
           /*String insertar = "INSERT INTO enfermeras VALUES ('3','Valentina','Mollo','Gutierrez','86','enfermera','provisional','160','1')";
           stat.executeUpdate(insertar);     */                           

           // Seleccionar todos los datos ordenados por potencia
           String seleccionar = "SELECT * FROM enfermeras";
           rs = stat.executeQuery(seleccionar);

           // Recorrer todas las filas de la tabla Motor           
           while (rs.next()) {
                     System.out.println(rs.getString("nombres")+"\t");
                 }
        } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static String[] get_turno(){
        Connection con;
        ResultSet rs;
        String [] turno = new String[6];
        int i=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/enfermerasdb",
            "root", "");
            // Creamos un Statement para poder hacer peticiones a la bd
            Statement stat = con.createStatement();
            String seleccionar = "SELECT * FROM turnos";
            rs = stat.executeQuery(seleccionar);
            
            while (rs.next()) {                    
                     turno[i]="turno "+rs.getString("nombre");
                     i++;
                 }
        }catch(ClassNotFoundException | SQLException e) {
           System.out.println("Error: " + e.getMessage());
        }
        return turno;
        
    }
    
    public static String[] get_horario(){
        Connection con;
        ResultSet rs;
        String [] horario = new String[6];
        int i=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/enfermerasdb",
            "root", "");
            // Creamos un Statement para poder hacer peticiones a la bd
            Statement stat = con.createStatement();
            String seleccionar = "SELECT * FROM turnos";
            rs = stat.executeQuery(seleccionar);
             
            while (rs.next()) {                    
                     horario[i]=rs.getString("hora_inicio")+" : "+rs.getString("hora_fin");
                     i++;
                 }
        }catch(ClassNotFoundException | SQLException e) {
           System.out.println("Error: " + e.getMessage());
        }
        return horario;
    }
    
    public static String[] get_enfermera(String x,int tam){
        Connection con;
        ResultSet rs;
        String [] enfermeras = new String[tam];
        int i=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/enfermerasdb",
            "root", "");
            // Creamos un Statement para poder hacer peticiones a la bd
            Statement stat = con.createStatement();
            String seleccionar;
            if(tam!=2){
                seleccionar = "SELECT * FROM enfermeras";
            }else{
                seleccionar = "SELECT * FROM enfermeras WHERE grupo='"+x+"'";
            }
            
            rs = stat.executeQuery(seleccionar);
                         
            
            while (rs.next()) {   
                
                     enfermeras[i]=rs.getString("nombres")+" "+rs.getString("ap_paterno")+" "+rs.getString("ap_materno")+" "+rs.getString("tipo_enfermera")+" "+rs.getString("tipo_contrato")+" "+rs.getString("grupo");
                     i++;
                 }
        }catch(ClassNotFoundException | SQLException e) {
           System.out.println("Error: " + e.getMessage());
        }
        return enfermeras;
    }
}
