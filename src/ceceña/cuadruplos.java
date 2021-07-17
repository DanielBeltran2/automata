package ceceña;

public class cuadruplos {

	private String signos, DK[];
	String[] Car;
	private int contSignos, x, y, z;

	class Nodo {
		String info;
		Nodo izq, der;
	}

	Nodo raiz;

	public cuadruplos() {
		y = 0;
		x = 0;
		z = 0;
		contSignos = 0;
		raiz = null;
	}

	public void insertar(String info) {
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.info = info;
		nuevo.izq = null;
		nuevo.der = null;
		if (raiz == null)
			raiz = nuevo;
		else {
			Nodo anterior = null, reco;
			reco = raiz;
			while (reco != null) {
				anterior = reco;
				if (anterior.der == null) {
					x++;
					reco = reco.izq;
				}
			}

			if (anterior.izq == null) {
				x++;
				anterior.izq = nuevo;
			}
		}
	}

	private void imprimirEntre(Nodo reco) {
		if (reco != null) {
			imprimirEntre(reco.izq);
			System.out.print(reco.info + " ");
			Car[y] = reco.info;
			y++;
			imprimirEntre(reco.der);
		}
	}

	public void imprimirEntre() {
		imprimirEntre(raiz);
		System.out.println();
	}

	private void imprimirPre(Nodo reco) {
		if (reco != null) {
			System.out.print(reco.info + " ");
			imprimirPre(reco.izq);
			imprimirPre(reco.der);
		}
	}

	public void imprimirPre() {
		imprimirPre(raiz);
		System.out.println();
	}

	private void imprimircuadruplos(Nodo reco) {
		System.out.println("owo");
		if (reco != null) {
			imprimirEntre(reco.izq);
			System.out.print(reco.info + " ");
			imprimirEntre(reco.der);
		}
	}

	public void imprimircuadruplos() {
		imprimircuadruplos(raiz);

		System.out.println();
	}

	public void contarSignos() {

		String izquierda, derecha;
		for (int i = 0; i < Car.length; i++) {
			try {
				if (Car[i].equals("*")) {
					try {
						izquierda = Car[i + 1];
						derecha = Car[i - 1];
						DK[z] = "DK " + (z + 1) + " * " + " " + izquierda + " " + derecha;
					} catch (ArrayIndexOutOfBoundsException e) {
						break;
					}
					z++;
					Car[i] = "DK" + z;
					Car[i + 1] = "DK" + z;
					Car[i - 1] = "DK" + z;

				}
				if (Car[i].equals("/")) {
					try {
						izquierda = Car[i + 1];
						derecha = Car[i - 1];
						DK[z] = "DK " + (z + 1) + " / " + " " + izquierda + " " + derecha;
					} catch (ArrayIndexOutOfBoundsException e) {
						break;
					}
					z++;
					Car[i] = "DK" + z;
					Car[i + 1] = "DK" + z;
					Car[i - 1] = "DK" + z;

				}
				if (Car[i].equals("+")) {
					try {
						izquierda = Car[i + 1];
						derecha = Car[i - 1];
						DK[z] = "DK " + (z + 1) + " + " + " " + izquierda + " " + derecha;
					} catch (ArrayIndexOutOfBoundsException e) {
						break;
					}
					z++;
					Car[i] = "DK" + z;
					Car[i + 1] = "DK" + z;
					Car[i - 1] = "DK" + z;

				}
				if (Car[i].equals("-")) {
					try {
						izquierda = Car[i + 1];
						derecha = Car[i - 1];
						DK[z] = "DK " + (z + 1) + " - " + " " + izquierda + " " + derecha;
					} catch (ArrayIndexOutOfBoundsException e) {
						break;
					}

					z++;
					Car[i] = "DK" + z;
					Car[i + 1] = "DK" + z;
					Car[i - 1] = "DK" + z;

				}
			} catch (NullPointerException e) {

			}

		}
	}

	public void iniciar() {
		DK = new String[x];
		Car = new String[x];

	}

	private void imprimirPost(Nodo reco) {
		if (reco != null) {
			imprimirPost(reco.izq);
			imprimirPost(reco.der);
			System.out.print(reco.info + " ");
		}
	}

	public void imprimirPost() {
		imprimirPost(raiz);
		System.out.println();
	}

	private String operacion(Nodo reco) {
		return reco.info;
	}

	public void imprime() {
		for (int i = 0; i < DK.length; i++) {

			System.out.println(DK[i]);

		}
	}
}