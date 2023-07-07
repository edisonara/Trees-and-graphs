package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import lista.ListaPolinomio;
import nodo.NodoPolinomios;
import nodo.Polinomio;
import polinomio.MezclaDirecta;
import polinomio.OperacionesPolinomio;

public class VentanaPrincipalV0 extends JFrame {

    /**
	 * 
	 */
	public ListaPolinomio<NodoPolinomios<Polinomio>> lista1 = new ListaPolinomio<>();
    public  ListaPolinomio<NodoPolinomios<Polinomio>> lista2 = new ListaPolinomio<>();

    
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField Base;
    private JTextField Exponente;
    private JTextField Code;
    private JTable table1;
    private JTable table2;
    private DefaultTableModel tableModel1;
    private DefaultTableModel tableModel2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipalV0 frame = new VentanaPrincipalV0();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VentanaPrincipalV0() {
        createContents();
    }

    private void createContents() {
        setAlwaysOnTop(true);
        int numFilas = 4;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1089, 768);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 255));
        contentPane.setToolTipText("Edison");
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

        JButton imprimirLista1 = new JButton("Imprimir Lista 1");
        imprimirLista1.setFont(new Font("Arial Black", Font.PLAIN, 12));

        JButton insertarLista2 = new JButton("Insertar Lista 2");
        insertarLista2.setFont(new Font("Arial Black", Font.PLAIN, 12));

        JButton imprimirLista2 = new JButton("Imprimir Lista 2");
        imprimirLista2.setFont(new Font("Arial Black", Font.PLAIN, 12));

        JLabel lblLista1 = new JLabel("Lista 1");
        lblLista1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));

        JLabel lblLista2 = new JLabel("Lista 2");
        lblLista2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));

        JScrollPane scrollPane1 = new JScrollPane();
        JScrollPane scrollPane2 = new JScrollPane();

        // Table Model for Table 1
        tableModel1 = new DefaultTableModel();
        tableModel1.addColumn("HashCode");
        tableModel1.addColumn("Base");
        tableModel1.addColumn("Exponente");

        // Table Model for Table 2
        tableModel2 = new DefaultTableModel();
        tableModel2.addColumn("HashCode");
        tableModel2.addColumn("Base");
        tableModel2.addColumn("Exponente");

        // Table 1
        table1 = new JTable(tableModel1);
        scrollPane1.setViewportView(table1);

        // Table 2
        table2 = new JTable(tableModel2);
        scrollPane2.setViewportView(table2);

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(22)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblNewLabel)
                        .addComponent(insertarLista1)
                        .addComponent(imprimirLista1)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(Base, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(X)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(Exponente, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(A))
                        .addComponent(Code, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(eliminar)
                            .addGap(18)
                            .addComponent(mezclaDirecta))
                        .addComponent(insertarLista2)
                        .addComponent(imprimirLista2)
                        .addComponent(lblLista1)
                        .addComponent(lblLista2))
                    .addGap(62)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap(366, Short.MAX_VALUE)
                    .addComponent(Titulo)
                    .addGap(369))
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Titulo)
                    .addGap(46)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(lblNewLabel)
                            .addGap(18)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(Base, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(X)
                                .addComponent(Exponente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(A))
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(insertarLista1)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(imprimirLista1)
                            .addGap(18)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(eliminar)
                                .addComponent(mezclaDirecta))
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(insertarLista2)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(imprimirLista2)
                            .addGap(18)
                            .addComponent(lblLista1))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addComponent(lblLista2)
                    .addGap(32))
        );
        contentPane.setLayout(gl_contentPane);
    }

    /**
     * Inserta un término en la Lista 1 y actualiza la tabla correspondiente.
     */
    private void insertarLista1() {
        int base = Integer.parseInt(Base.getText());
        int exponente = Integer.parseInt(Exponente.getText());
        Polinomio polinomio = new Polinomio(base, exponente);
        NodoPolinomios<Polinomio> nodoPolinomio = new NodoPolinomios<>(polinomio);

        try {
        	 lista1.insertarInicio(nodoPolinomio);
            Object[] rowData ={lista1.hashCode(), lista1.getInicio().getDato().getCoef(),lista1.getInicio().getDato().getExp() };
            tableModel1.addRow(rowData);
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this, "El término ya existe en la Lista 1.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Limpiar campos de entrada
        Base.setText("");
        Exponente.setText("");
        Base.requestFocus();
    }

    /**
     * Imprime los términos de la Lista 1 en la consola.
     */
    private void imprimirLista1() {
        if (((CharSequence) lista1).isEmpty()) {
            JOptionPane.showMessageDialog(this, "La Lista 1 está vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println("Lista 1:");
        //for (Termino termino : lista1) {
        //    System.out.println(termino);
        //}
    }

    /**
     * Inserta un término en la Lista 2 y actualiza la tabla correspondiente.
     */
    private void insertarLista2() {
    	int base = Integer.parseInt(Base.getText());
        int exponente = Integer.parseInt(Exponente.getText());
        Polinomio polinomio = new Polinomio(base, exponente);
        NodoPolinomios<Polinomio> nodoPolinomio = new NodoPolinomios<>(polinomio);

        try {
        	 lista2.insertarInicio(nodoPolinomio);
            Object[] rowData ={lista2.hashCode(), lista2.getInicio().getDato().getCoef(),lista2.getInicio().getDato().getExp() };
            tableModel1.addRow(rowData);
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this, "El término ya existe en la Lista 1.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Limpiar campos de entrada
        Base.setText("");
        Exponente.setText("");
        Base.requestFocus();
    }

    /**
     * Imprime los términos de la Lista 2 en la consola.
     */
    private void imprimirLista2() {
        if (((CharSequence) lista2).isEmpty()) {
            JOptionPane.showMessageDialog(this, "La Lista 2 está vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println("Lista 2:");
       // for (Termino termino : lista2) {
       //     System.out.println(termino);
       // }
    }

    /**
     * Elimina un término de la Lista 1 y actualiza la tabla correspondiente.
     */
    private void eliminarTermino() {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un término de la Lista 1.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //int hashCode = (int) tableModel1.getValueAt(selectedRow, 0);
        //Termino termino = new Termino(hashCode, 0, 0);
        String eliminado = lista1.eliminarNodo2(selectedRow);
        
        tableModel1.removeRow(selectedRow);
        JOptionPane.showMessageDialog(null, "Eliminado el nodo: "+eliminado);
        Code.setText("");
    }

    /**
     * Realiza la mezcla directa de las dos listas y muestra el resultado en la consola.
     */
    private void mezclaDirecta() {
        if (lista1==null || lista2==null) {
            JOptionPane.showMessageDialog(this, "Ambas listas deben contener términos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ListaPolinomio<NodoPolinomios<Polinomio>> listaOrdenada = MezclaDirecta.mezclar(lista2);
        lista2.setInicio(listaOrdenada.getInicio());
        JOptionPane.showMessageDialog(null, "Lista ordenado "+listaOrdenada.toString());

        System.out.println("Polinomios ordenados.");
        System.out.println();
    }

   
}

