package ceceña;

public class cuadruplos {

	private String signos, DK[], Car;
	private int contSignos, x, y;

	class Nodo {
		String info;
		Nodo izq, der;
	}

	Nodo raiz;

	public cuadruplos() {
		y = 0;
		x = 0;
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
		contarSignos(raiz);
		System.out.println();
	}

	public void iniciar() {
		DK = new String[x];
		contarSignos();
	}

	private void contarSignos(Nodo reco) {

		String izquierda, derecha;
		if (reco != null) {

			contarSignos(reco.izq);
			contarSignos(reco.der);
			if (reco.info == "*" || reco.info == "/" || reco.info == "+" || reco.info == "-") {
				signos = reco.info;
			}

		}
		while (reco != null) {

			if (signos == "*") {
				izquierda = operacion(reco.izq);
				derecha = operacion(reco.der);
				DK[y] = "DK " + (y + 1) + signos + " " + izquierda + " " + derecha;
				y++;
				break;

			}
			if (signos == "/") {
				izquierda = operacion(reco.izq);
				derecha = operacion(reco.der);
				DK[y] = "DK " + (y + 1) + signos + " " + izquierda + " " + derecha;
				y++;
				break;

			}
			if (signos == "+") {
				izquierda = operacion(reco.izq);
				derecha = operacion(reco.der);
				DK[y] = "DK " + (y + 1) + signos + " " + izquierda + " " + derecha;
				y++;
				break;
			}
			if (signos == "-") {
				izquierda = operacion(reco.izq);
				derecha = operacion(reco.der);
				DK[y] = "DK " + (y + 1) + signos + " " + izquierda + " " + derecha;
				y++;
				break;
			}
		}

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
			if (DK[i] == null) {

			} else {
				System.out.println(DK[i]);
			}
		}
	}
}