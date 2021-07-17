package ceceña;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class main {
	public static ArrayList<Cuadruple> cuadruples;
	public static Programa Arbol;

	public static void main(String[] args) {

		int x = Integer
				.parseInt(JOptionPane.showInputDialog(null, "semantico, sintactico y lexico: 1 \ncuadruplos: 2"));
		switch (x) {
		case 1:
			new Apl();
			break;
		case 2:

			cuadruples = Generador.generarCod(Arbol);
			int c2 = 0;
			for (Cuadruple c : cuadruples)
				System.out.println((++c2) + "\t" + c.getOperador() + "\t" + c.getArg1() + "\t" + c.getArg2() + "\t"
						+ c.getResultado());

			System.out.println("Programa compilado correctamente");
			/*
			 * cuadruplos abo = new cuadruplos(); abo.insertar("F"); abo.insertar("-");
			 * abo.insertar("E"); abo.insertar("/"); abo.insertar("D"); abo.insertar("*");
			 * abo.insertar("C"); abo.insertar("-"); abo.insertar("B");
			 * 
			 * // abo.insertar("("); // abo.insertar("(");
			 * 
			 * // abo.insertar(")");
			 * 
			 * // abo.insertar(")");
			 * 
			 * System.out.println("Impresion entreorden: "); abo.imprimirEntre();
			 * System.out.println("Impresion preorden: "); abo.imprimirPre();
			 * System.out.println("Impresion post: "); abo.imprimirPost();
			 * 
			 * System.out.println("Impresion cuadruplos: "); abo.iniciar(); abo.imprime();
			 */
			break;
		}
	}
}
