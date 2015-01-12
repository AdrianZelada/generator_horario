
import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class factura extends JFrame {
	
	JButton clear = new JButton("Limpiar");
	JButton print = new JButton("Imprimir");
	JButton save = new JButton("Guardar");
	JButton exit = new JButton("Salir");
	
	JLabel number = new JLabel();
	JLabel date = new JLabel();
	JLabel titulo = new JLabel();
	JLabel cliente = new JLabel("Cliente");
	JLabel jLabel2 = new JLabel("NIT/C.I.");
	JLabel jLabel3 = new JLabel("Fecha");
	JLabel jLabel4 = new JLabel("Nro.");
	JLabel fecha = new JLabel("as");
	JLabel nro = new JLabel("asd");
	JLabel jLabel5 = new JLabel("Subtotal");
	JLabel jLabel6 = new JLabel("I.V.A.");
	JLabel jLabel7 = new JLabel("Total");
	
	JTextField iva = new JTextField();
	JTextField name = new JTextField();
	JTextField nit = new JTextField();
	JTextField subtotal = new JTextField();
	JTextField total = new JTextField();
	
	JTable table = new JTable();
	
	DefaultTableModel modelo = new DefaultTableModel();
	
    private void jbInit() throws Exception {
    
    	this.setTitle("       F a c t u r a c i o n");
    	this.setResizable(false);
    	this.setSize(450, 730);
    	this.setLayout( null );
    	this.setBackground(new Color(2, 204, 204));
    	titulo.setText("FACTURA");
    	titulo.setFont(new java.awt.Font("Tahoma", 0, 36));
    	titulo.setForeground(new java.awt.Color(0, 0, 102));
    	titulo.setBounds(20, 20, 170, 35);
    	cliente.setBounds(20, 100, 70, 20);
    	name.setBounds(90, 100, 150, 20);
    	jLabel2.setBounds(250, 100, 70, 20);
    	nit.setBounds(315, 100, 120, 20);
    	jLabel3.setBounds(290, 50, 70, 20);
    	jLabel4.setBounds(290, 75, 70, 20);
    	fecha.setBounds(350, 50, 70, 20);
    	nro.setBounds(350, 75, 70, 20);
    	
        Object A[] = {"Producto", "Cantidad", "Precio"};
        modelo.addColumn(1);
        modelo.addColumn(2);
        modelo.addColumn(3);
        modelo.addRow(A);
        table = new JTable(modelo);
        table.setBounds(50, 150, 350, 350);
        
        jLabel5.setBounds(230, 520, 70, 20);
        jLabel6.setBounds(230, 550, 70, 20);
        jLabel7.setBounds(230, 580, 70, 20);
        subtotal.setBounds(300, 520,70, 20);
        iva.setBounds(300, 550,70, 20);
        total.setBounds(300, 580,70, 20);
        
        save.setBounds(30, 620, 90, 20);
        print.setBounds(130, 620, 90, 20);
        clear.setBounds(230, 620, 90, 20);
        exit.setBounds(330, 620, 90, 20);
    	
    	this.add(titulo);
    	this.add(cliente);
        this.add(name);
        this.add(jLabel2);
        this.add(nit);
        this.add(jLabel3);
        this.add(jLabel4);
        this.add(fecha);
        this.add(nro);
        this.add(table);
        this.add(jLabel5);
        this.add(jLabel6);
        this.add(jLabel7);
        this.add(subtotal);
        this.add(iva);
        this.add(total);
        this.add(save);
        this.add(print);
        this.add(clear);
        this.add(exit);
        
        ManejadorBoton m = new ManejadorBoton();
		save.addActionListener(m);
		print.addActionListener(m);
		clear.addActionListener(m);
		exit.addActionListener(m);
    }
    private class ManejadorBoton implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			if(evento.getActionCommand().equals("Guardar")){
				Object b[] = {"1","2","3"};
				modelo.addRow(b);
				table = new JTable(modelo);
			}
			if(evento.getActionCommand().equals("Ipmrimir")){
				Object b[] = {"4","5","6"};
				modelo.addRow(b);
				table = new JTable(modelo);
			}
			if(evento.getActionCommand().equals("Limpiar")){
				
			}
			if(evento.getActionCommand().equals("Salir")){
				System.exit(0);
			}
		}
	}
    
	public factura(){
		try {
            jbInit(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	public static void main(String[] args) {
		factura f = new factura();
		f.setVisible(true);
	}
}
