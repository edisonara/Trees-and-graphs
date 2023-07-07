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

public class VentanaPrincipal2 extends JFrame {

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
	public VentanaPrincipal2() {
		
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
		contentPane = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Image imagen = Toolkit.getDefaultToolkit().getImage("E:\\Documentos 1\\Materias Espe\\Nivel 4\\estructuras de datos\\ProyectoPolinomioU1_EdisonJordan\\src\\photo_2022-11-02_22-46-19.jpg");

				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
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
		
		JLabel Titulo = new JLabel("Calculo de Polinomios");
		Titulo.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("Ingrese polinomio de tipo x^a..");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel X = new JLabel("X");
		X.setLabelFor(this);
		X.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel A = new JLabel("a");
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
		mezclaDirecta.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
				
		JLabel lblTenerEnCuenta = new JLabel("Tener en cuenta que tiene que tener ");
		lblTenerEnCuenta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lblElHastcode = new JLabel("el HastCode");
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
		

		table.setBackground(Color.CYAN);
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
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		JRadioButton suma = new JRadioButton("Suma");
		
		JRadioButton resta = new JRadioButton("Resta");
		
		JRadioButton multiplicacion = new JRadioButton("Multiplication");
		
		JRadioButton Division = new JRadioButton("division");
		
		//ButtonGroup buttonGroup = new ButtonGroup();
       // buttonGroup.add(suma);
        //buttonGroup.add(resta);
		
		JTextArea textArea = new JTextArea();
		
		table_1 = new JTable((TableModel) null);
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_1.setForeground(Color.RED);
		table_1.setFont(new Font("Arial", Font.PLAIN, 12));
		table_1.setFillsViewportHeight(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table_1.setBackground(new Color(0, 128, 128));
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
                    tableModel.addRow(row);
                    
                    
                    
                  
                    
                    
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
            	String eliminado = lista1.eliminarNodo2(dato1);
            	JOptionPane.showMessageDialog(null, "Eliminado el nodo: "+eliminado);
                Code.setText("");
            }
        });
		mezclaDirecta.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            	JOptionPane.showMessageDialog(null, "Lista Normal "+lista2.toString());
                
                ListaPolinomio<NodoPolinomios<Polinomio>> listaOrdenada = MezclaDirecta.mezclar(lista2);
                lista2.setInicio(listaOrdenada.getInicio());
                JOptionPane.showMessageDialog(null, "Lista ordenado "+listaOrdenada.toString());

                System.out.println("Polinomios ordenados.");
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
	                    textArea.append(suma.visualizar());
	                }
	            	if (resta.isSelected()) {
	            		ListaPolinomio<NodoPolinomios<Polinomio>> resta = OperacionesPolinomio.restar(lista1, lista2);
	        		    System.out.println("Resta de polinomios:");
	        		    resta.visualizar();
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la opción 2");
	                    textArea.append(resta.visualizar());
	            	} 
	            	if (multiplicacion.isSelected()) {
	            		ListaPolinomio<NodoPolinomios<Polinomio>> multiplicacion = OperacionesPolinomio.multiplicar(lista1, lista2);
	        		    System.out.println("Multiplicación de polinomios:");
	        		    multiplicacion.visualizar();
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la opción 2");
	                    textArea.append(multiplicacion.visualizar());
	            	}
	            	if (Division.isSelected()) {
	            		ListaPolinomio<NodoPolinomios<Polinomio>> division = OperacionesPolinomio.dividir(lista1, lista2);
	        		    System.out.println("División de polinomios:");
	        		    division.visualizar();
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la opción 2");
	                    textArea.append(division.visualizar());
	            	} 
            	}else {
                    JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
                }
                Code.setText("");
            }
        });
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(473)
					.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(134)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(144)
					.addComponent(X, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(Base, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(504)
					.addComponent(Code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(144)
					.addComponent(A, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(Exponente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(435)
					.addComponent(lblTenerEnCuenta, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(806)
					.addComponent(lblElHastcode, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(179)
					.addComponent(insertarLista1)
					.addGap(501)
					.addComponent(eliminar))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(179)
					.addComponent(InsertarLista2)
					.addGap(476)
					.addComponent(mezclaDirecta))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addGap(188)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(suma, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(resta, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(multiplicacion, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(Division, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(37)
							.addComponent(btnNewButton))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addGap(248)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE))
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
							.addComponent(Base, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(Code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(A))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(8)
							.addComponent(Exponente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTenerEnCuenta))
					.addGap(8)
					.addComponent(lblElHastcode)
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(insertarLista1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(eliminar)))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(InsertarLista2))
						.addComponent(mezclaDirecta))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(suma)
								.addComponent(resta))
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(multiplicacion)
								.addComponent(Division))
							.addGap(41)
							.addComponent(btnNewButton)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
