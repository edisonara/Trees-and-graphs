package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import net.miginfocom.swing.MigLayout;
import nodo.NodoPolinomios;
import nodo.Polinomio;
import polinomio.MezclaDirecta;
import polinomio.OperacionesPolinomio;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.ImageProducer;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableCell;
import javax.swing.GroupLayout.Alignment;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.event.AncestorListener;
import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;

import lista.ListaPolinomio;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.SystemColor;

class MiRenderer extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component celda = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        celda.setBackground(new Color(255, 255, 255, 100));
        ((JComponent) celda).setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        ((JComponent) celda).setBorder(new Flush3DBorder());
        ((JComponent) celda).setOpaque(false);
        celda.setFont(new Font("Arial", Font.BOLD, 12));
        return celda;
    }
}

class MiHeaderRenderer extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component encabezado = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        encabezado.setBackground(Color.BLUE);
        encabezado.setForeground(Color.WHITE);
        encabezado.setFont(new Font("Arial", Font.BOLD, 14));
        ((JComponent) encabezado).setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        return encabezado;
    }
}

public class VentanaPrincipal extends JFrame {

	protected static final String DbUtils = null;
	private JPanel contentPane;
	private JTextField Base;
	private JTextField Exponente;
	private JTextField Code;
	private JTable table;
	private DefaultTableModel tableModel;
	private JMenuBar menuBar;
	private JMenu Inicio;
	private JMenuItem Salir;
	private JTable table_1;
	private JLabel lblLista;
	private JLabel lblLista_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		
		createContents();
	}
	private void createContents() {
		setForeground(new Color(105, 105, 105));
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Documentos 1\\Materias Espe\\Nivel 4\\estructuras de datos\\ProyectoPolinomioU1_EdisonJordan\\src\\photo_2022-11-02_22-46-19.jpg"));
		setAlwaysOnTop(true);
		int numFilas= 0;
		Polinomio polinomio1 = new Polinomio(0.0, 0);
		ListaPolinomio<NodoPolinomios<Polinomio>> lista1 = new ListaPolinomio<>();
		ListaPolinomio<NodoPolinomios<Polinomio>> lista2 = new ListaPolinomio<>();
		//ListaPolinomio<NodoPolinomios<Polinomio>> suma = OperacionesPolinomio.sumar(lista1, lista2);
		//ListaPolinomio<NodoPolinomios<Polinomio>> resta = OperacionesPolinomio.restar(lista1, lista2);
		//ListaPolinomio<NodoPolinomios<Polinomio>> multiplicacion = OperacionesPolinomio.multiplicar(lista1, lista2);
		//ListaPolinomio<NodoPolinomios<Polinomio>> division = OperacionesPolinomio.dividir(lista1, lista2);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1089, 768);
		contentPane = new JPanel(){
			@Override
			public void paintComponent(Graphics g) {
				Image imagen = Toolkit.getDefaultToolkit().getImage("E:\\Documentos 1\\Materias Espe\\Nivel 4\\estructuras de datos\\ProyectoPolinomioU1_EdisonJordan\\src\\photo_2022-11-02_22-46-19.jpg");

				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(192, 192, 192));
		/*
		{
			@Override
			public void paintComponent(Graphics g) {
				Image imagen = Toolkit.getDefaultToolkit().getImage("E:\\Documentos 1\\Materias Espe\\Nivel 4\\estructuras de datos\\ProyectoPolinomioU1_EdisonJordan\\src\\photo_2022-11-02_22-46-19.jpg");

				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		*/
		contentPane.setToolTipText("Edison\r\n");
		contentPane.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		
		menuBar = new JMenuBar();
		menuBar.setToolTipText("hol\r\n");
		setJMenuBar(menuBar);
		
		Inicio = new JMenu("Inicio");
		menuBar.add(Inicio);
		
		Salir = new JMenuItem("Salir");
		Inicio.add(Salir);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(contentPane);
		
		JLabel Titulo = new JLabel("Cálculo de Polinomios");
		Titulo.setForeground(new Color(169, 169, 169));
		Titulo.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 40));
		
		JLabel lblNewLabel = new JLabel("Ingrese polinomio de tipo x^a..");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel X = new JLabel("X");
		X.setForeground(new Color(169, 169, 169));
		X.setLabelFor(this);
		X.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel A = new JLabel("a");
		A.setForeground(new Color(192, 192, 192));
		A.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		Base = new JTextField();
		Base.setToolTipText("");
		Base.setColumns(10);
		
		Exponente = new JTextField();
		Exponente.setColumns(10);
		
		Code = new JTextField();
		Code.setColumns(10);
		
		JButton insertarLista1 = new JButton("Insertar Lista 1");
		insertarLista1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton mezclaDirecta = new JButton("Mezcla Directa");
		mezclaDirecta.setIcon(new ImageIcon("E:\\Documentos 1\\Materias Espe\\Nivel 4\\estructuras de datos\\ProyectoPolinomioU1_EdisonJordan\\src\\mezcla (Personalizado).png"));
		mezclaDirecta.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
				
		JLabel lblTenerEnCuenta = new JLabel("Tener en cuenta que tiene que tener ");
		lblTenerEnCuenta.setForeground(new Color(192, 192, 192));
		lblTenerEnCuenta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblElHastcode = new JLabel("el HastCode");
		lblElHastcode.setForeground(new Color(192, 192, 192));
		lblElHastcode.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		
		Object[] columnNames = {"Lista", "HasCode", "Base", "Exponete"};
		tableModel = new DefaultTableModel(columnNames, numFilas);
		
		
		table = new JTable(tableModel);
		table.setFillsViewportHeight(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBackground(new Color(0, 128, 128));
		table.setSurrendersFocusOnKeystroke(true);
		String[] encabezado = {"Lista", "HasCode", "Base", "Exponete"};
		tableModel.addRow(encabezado);
		

		table.setBackground(Color.GRAY);
		table.setForeground(Color.RED);
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JTableHeader header = table.getTableHeader();
		header.setBackground(Color.BLUE);
		header.setForeground(Color.WHITE);
		header.setFont(new Font("Arial", Font.BOLD, 14));
		
		TableColumn columna = table.getColumnModel().getColumn(0);
		columna.setPreferredWidth(100);
		columna.setResizable(true);
		//columna.setPreferredWidth(10);
		columna.setCellRenderer(new MiRenderer());
		columna.setHeaderRenderer(new MiHeaderRenderer());
		TableColumn columna1 = table.getColumnModel().getColumn(1);
		columna1.setPreferredWidth(100);
		columna1.setResizable(true);
		//columna.setPreferredWidth(10);
		columna1.setCellRenderer(new MiRenderer());
		columna1.setHeaderRenderer(new MiHeaderRenderer());
		
		TableColumn columna2 = table.getColumnModel().getColumn(2);
		columna2.setPreferredWidth(100);
		columna2.setResizable(true);
		//columna.setPreferredWidth(10);
		columna2.setCellRenderer(new MiRenderer());
		columna2.setHeaderRenderer(new MiHeaderRenderer());

		TableColumn columna3 = table.getColumnModel().getColumn(3);
		columna3.setPreferredWidth(100);
		columna3.setResizable(true);
		//columna.setPreferredWidth(10);
		columna3.setCellRenderer(new MiRenderer());
		columna3.setHeaderRenderer(new MiHeaderRenderer());
		
		TableCellRenderer renderer = table.getDefaultRenderer(Object.class);
		((JLabel) renderer).setHorizontalAlignment(SwingConstants.CENTER);
		table.setBorder(new LineBorder(Color.BLACK, 2, true));
	
		
		
    
		
		
		
		
		/*
		tableModel.addRow(row);
		tableModel.hashCode();
		table.addColumn(columna);
		System.out.println(tableModel.getRowCount());
		//tableModel.removeRow(numFilas);
        table.getColumnModel().getColumn(0).setHeaderValue(row[0]);
        table.getColumnModel().getColumn(1).setHeaderValue(row[1]);
        table.getColumnModel().getColumn(2).setHeaderValue(row[2]);*/
        
		
	
		
		JButton InsertarLista2 = new JButton("Insertar Lista 2");
		InsertarLista2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setSelectedIcon(new ImageIcon("E:\\Documentos 1\\Materias Espe\\Nivel 4\\estructuras de datos\\ProyectoPolinomioU1_EdisonJordan\\src\\calculadora (Pequeño) (Pequeño) (Personalizado) (1) (Personalizado) (Personalizado).png"));
		btnNewButton.setIcon(new ImageIcon("E:\\Documentos 1\\Materias Espe\\Nivel 4\\estructuras de datos\\ProyectoPolinomioU1_EdisonJordan\\src\\calculadora (Pequeño) (Pequeño) (Personalizado) (1) (Personalizado) (Personalizado).png"));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		JRadioButton suma = new JRadioButton("Suma");
		suma.setFont(new Font("Tahoma", Font.BOLD, 10));
		suma.setBackground(new Color(105, 105, 105));
		suma.setForeground(new Color(220, 220, 220));
		
		JRadioButton resta = new JRadioButton("Resta");
		resta.setFont(new Font("Tahoma", Font.BOLD, 10));
		resta.setBackground(new Color(105, 105, 105));
		resta.setForeground(new Color(220, 220, 220));
		
		JRadioButton multiplicacion = new JRadioButton("Multiplication");
		multiplicacion.setBackground(new Color(105, 105, 105));
		multiplicacion.setForeground(new Color(220, 220, 220));
		
		JRadioButton Division = new JRadioButton("division");
		Division.setFont(new Font("Tahoma", Font.BOLD, 10));
		Division.setBackground(new Color(105, 105, 105));
		Division.setForeground(new Color(220, 220, 220));
		
		//ButtonGroup buttonGroup = new ButtonGroup();
       // buttonGroup.add(suma);
        //buttonGroup.add(resta);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("MS PGothic", Font.BOLD, 16));
		TableModel tableModel2 = new DefaultTableModel(columnNames, numFilas);
		table_1 = new JTable(tableModel2);
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_1.setForeground(Color.BLUE);
		table_1.setFont(new Font("Arial", Font.PLAIN, 12));
		table_1.setFillsViewportHeight(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table_1.setBackground(Color.GRAY);
		JTableHeader header2 = table_1.getTableHeader();
		header2.setBackground(Color.BLUE);
		header2.setForeground(Color.WHITE);
		header2.setFont(new Font("Arial", Font.BOLD, 14));
		
		((DefaultTableModel) tableModel2).addRow(encabezado);
		
		TableColumn columna_0 = table_1.getColumnModel().getColumn(0);
		columna_0.setPreferredWidth(100);
		columna_0.setResizable(true);
		//columna.setPreferredWidth(10);
		columna_0.setCellRenderer(new MiRenderer());
		columna_0.setHeaderRenderer(new MiHeaderRenderer());
		TableColumn columna_1 = table_1.getColumnModel().getColumn(1);
		columna_1.setPreferredWidth(100);
		columna_1.setResizable(true);
		//columna.setPreferredWidth(10);
		columna_1.setCellRenderer(new MiRenderer());
		columna_1.setHeaderRenderer(new MiHeaderRenderer());
		
		TableColumn columna_2 = table_1.getColumnModel().getColumn(2);
		columna_2.setPreferredWidth(100);
		columna_2.setResizable(true);
		//columna.setPreferredWidth(10);
		columna_2.setCellRenderer(new MiRenderer());
		columna_2.setHeaderRenderer(new MiHeaderRenderer());

		TableColumn columna_3 = table_1.getColumnModel().getColumn(3);
		columna_3.setPreferredWidth(100);
		columna_3.setResizable(true);
		//columna.setPreferredWidth(10);
		columna_3.setCellRenderer(new MiRenderer());
		columna_3.setHeaderRenderer(new MiHeaderRenderer());
		
		TableCellRenderer renderer2 = table_1.getDefaultRenderer(Object.class);
		((JLabel) renderer2).setHorizontalAlignment(SwingConstants.CENTER);
		table.setBorder(new LineBorder(Color.BLACK, 2, true));
		
		insertarLista1.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dato = Base.getText();
                String dato2 = Exponente.getText();
                try {
                    double base = Double.parseDouble(dato);
                    int exponente = Integer.parseInt(dato2);
                    Polinomio polinomio = new Polinomio(base, exponente);
                    NodoPolinomios<Polinomio> nodoPolinomio = new NodoPolinomios<>(polinomio);
                    lista1.insertarInicio(nodoPolinomio);
                    System.out.println(lista1.visualizar());
                    Object[] row1 = {"lista 1",lista1.getInicio().hashCode(), lista1.getInicio().getDato().getCoef(),lista1.getInicio().getDato().getExp() };
                    tableModel.addRow(row1);
                    
                  
                    
                    
                    // Realizar operaciones con el número
                } catch (NumberFormatException e1) {
                    System.out.println("El valor ingresado no es un número válido.");
                }
            
                Base.setText("");
                Exponente.setText("");
            }
        });
		
		InsertarLista2.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dato = Base.getText();
                String dato2 = Exponente.getText();
                try {
                    double base = Double.parseDouble(dato);
                    int exponente = Integer.parseInt(dato2);
                    Polinomio polinomio = new Polinomio(base, exponente);
                    NodoPolinomios<Polinomio> nodoPolinomio = new NodoPolinomios<>(polinomio);
                    
                    lista2.insertarInicio(nodoPolinomio);
                    System.out.println(lista2.visualizar());
                    Object[]row = {"Lista 2", lista2.getInicio().hashCode(), lista2.getInicio().getDato().getCoef(),lista2.getInicio().getDato().getExp() };
                    ((DefaultTableModel) tableModel2).addRow(row);
                    
                    
                    
                  
                    
                    
                    // Realizar operaciones con el número
                } catch (NumberFormatException e1) {
                    System.out.println("El valor ingresado no es un número válido.");
                }
            
                Base.setText("");
                Exponente.setText("");
                Base.requestFocus();
            }
        });
		
		
		eliminar.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String dato = Code.getText();
            	int dato1 = Integer.parseInt(dato);
            	String eliminado = lista2.eliminarNodo2(dato1);
            	JOptionPane.showMessageDialog(null, "Eliminado el nodo: "+eliminado);
                Code.setText("");
                int numFilas = table_1.getRowCount();
                
               
                for (int i = numFilas - 1; i > 0; i--) {
                	((DefaultTableModel) tableModel2).removeRow(i);
                }
                
                int cantidad_1= lista2.lista().size();
                for (int i =0; i < cantidad_1; i++) {
                	((DefaultTableModel) tableModel2).addRow(lista2.lista().get(i));
                	System.out.println(lista2.lista().get(i));
                }
                
                
            }
        });
		mezclaDirecta.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            	JOptionPane.showMessageDialog(null,  "| Lista 2 ordenada"+lista2.toString()+ " | ");
                
                ListaPolinomio<NodoPolinomios<Polinomio>> listaOrdenada = MezclaDirecta.mezclar(lista2);
                lista2.setInicio(listaOrdenada.getInicio());
                int numFilas = table_1.getRowCount();
                for (int i = numFilas - 1; i > 0; i--) {
                	((DefaultTableModel) tableModel2).removeRow(i);
                }
                JOptionPane.showMessageDialog(null, "| Lista 2 "+listaOrdenada.toString()+ " | ");
                int cantidad= lista2.lista().size();
                for (int i =0; i < cantidad; i++) {
                	((DefaultTableModel) tableModel2).addRow(lista2.lista().get(i));
                	System.out.println(lista2.lista().get(i));
                }
                
                
               // ((DefaultTableModel) tableModel2).setModel(DbUtils.resultSetToTableModel(lista2.lista()));
                
                System.out.println("Polinomios de lista 2 ordenados.");
                System.out.println();
                
                /////////////////////////////////
                JOptionPane.showMessageDialog(null,  "| Lista 1 "+lista1.toString()+ " | ");
                
                ListaPolinomio<NodoPolinomios<Polinomio>> listaOrdenada_1 = MezclaDirecta.mezclar(lista1);
                lista1.setInicio(listaOrdenada_1.getInicio());
                int numFilas_1 = table.getRowCount();
                for (int i = numFilas_1 - 1; i > 0; i--) {
                	tableModel.removeRow(i);
                }
                JOptionPane.showMessageDialog(null, "| Lista 1 ordenada "+listaOrdenada_1.toString()+ " | ");
                int cantidad_1= lista1.lista().size();
                for (int i =0; i < cantidad_1; i++) {
                	tableModel.addRow(lista1.lista().get(i));
                	System.out.println(lista1.lista().get(i));
                }
               // ((DefaultTableModel) tableModel2).setModel(DbUtils.resultSetToTableModel(lista2.lista()));
                
                System.out.println("Polinomios de lista 1 ordenados.");
                System.out.println();
                
            }
        });
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	/*
            	 * 
            	 * Division
            	 * multiplicacion
            	 * resta
            	 * suma*/
            	textArea.setText("");
            	if (suma.isSelected()|| resta.isSelected()||multiplicacion.isSelected() || Division.isSelected()) {
	            	if (suma.isSelected()) {
	            		ListaPolinomio<NodoPolinomios<Polinomio>> suma = OperacionesPolinomio.sumar(lista1, lista2);
	        		    System.out.println("Suma de polinomios:");
	        		    suma.visualizar();
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la opción 1");
	                    textArea.append("Suma: "+System.lineSeparator()+suma.visualizar());
	                }
	            	if (resta.isSelected()) {
	            		ListaPolinomio<NodoPolinomios<Polinomio>> resta = OperacionesPolinomio.restar(lista1, lista2);
	        		    System.out.println("Resta de polinomios:");
	        		    resta.visualizar();
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la opción 2");
	                    textArea.append("Resta: "+System.lineSeparator()+resta.visualizar());
	            	} 
	            	if (multiplicacion.isSelected()) {
	            		ListaPolinomio<NodoPolinomios<Polinomio>> multiplicacion = OperacionesPolinomio.multiplicar(lista1, lista2);
	        		    System.out.println("Multiplicación de polinomios:");
	        		    multiplicacion.visualizar();
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la opción 2");
	                    textArea.append("Multiplicación: "+System.lineSeparator()+multiplicacion.visualizar());
	            	}
	            	if (Division.isSelected()) {
	            		ListaPolinomio<NodoPolinomios<Polinomio>> division = OperacionesPolinomio.dividir(lista1, lista2);
	        		    System.out.println("División de polinomios:");
	        		    division.visualizar();
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la opción 2");
	                    textArea.append("División: "+System.lineSeparator()+division.visualizar());
	            	} 
            	}else {
                    JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
                }
                Code.setText("");
            }
        });
		
		lblLista = new JLabel("Lista 1");
		lblLista.setForeground(Color.BLACK);
		lblLista.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		
		lblLista_2 = new JLabel("Lista 2");
		lblLista_2.setForeground(Color.BLACK);
		lblLista_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
						.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLista, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLista_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
					.addGap(145)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(mezclaDirecta)
							.addGap(205))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(multiplicacion, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
									.addComponent(Division, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(suma, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
									.addComponent(resta, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
							.addGap(231))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addGap(271))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(144)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(X, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addGap(43)
								.addComponent(Base, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(356)
								.addComponent(Code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(insertarLista1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addComponent(A, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addGap(43)
										.addComponent(Exponente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addComponent(InsertarLista2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
								.addComponent(eliminar))))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTenerEnCuenta, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
							.addGap(39))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblElHastcode, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addGap(130))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(lblNewLabel)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(X)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(Base, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(Code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenerEnCuenta))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(7)
									.addComponent(A))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(8)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(eliminar)
										.addComponent(Exponente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblElHastcode)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addComponent(insertarLista1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(37)
							.addComponent(mezclaDirecta)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(InsertarLista2)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(resta)
						.addComponent(suma))
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(Division)
								.addComponent(multiplicacion))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblLista, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addGap(130)
									.addComponent(lblLista_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)))))
					.addGap(107))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
