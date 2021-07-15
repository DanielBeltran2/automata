package ceceña;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int x = Integer
				.parseInt(JOptionPane.showInputDialog(null, "semantico, sintactico y lexico: 1 \ncuadruplos: 2"));
		switch (x) {
		case 1:
			new Apl();
			break;
		case 2:

			cuadruplos abo = new cuadruplos();
			abo.insertar("B");
			abo.insertar("-");
			abo.insertar("C");
			abo.insertar("*");
			abo.insertar("D");
			abo.insertar("/");
			abo.insertar("E");
			abo.insertar("-");
			abo.insertar("F");
			System.out.println("Impresion entreorden: ");
			abo.imprimirEntre();
			System.out.println("Impresion preorden: ");
			abo.imprimirPre();
			System.out.println("Impresion cuadruplos: ");
			abo.imprimircuadruplos();
			break;
		}
	}
}
