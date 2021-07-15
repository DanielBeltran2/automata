package ceceña;

public class cuadruplos {
	class Nodo {
		String info;
		Nodo izq, der;
	}

	Nodo raiz;

	public cuadruplos() {
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
					reco = reco.izq;
				}
			}

			if (anterior.izq == null) {
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

}
