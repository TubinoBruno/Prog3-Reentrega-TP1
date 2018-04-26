
public class ListaSimple extends Lista{
	ListaSimple(){
		super();
	}

	public void insertar(Object o) {
		Nodo tmp = new Nodo(o, null);
		tmp.setSiguiente(root);
		root = tmp;
		size++;
	}
	public void insertarFinal(Object o) {
		this.setUltimo();
				if(this.ultimo == null) {
			this.insertar(o);
		}
		
		else {
			Nodo tmp = new Nodo(o, null);
			this.ultimo.setSiguiente(tmp);
			ultimo = tmp;
			size++;
		}
	}

	
	
	public boolean insertarOrdenado(Object i) {
		Nodo aux = this.root;
		Nodo nuevo = new Nodo(i, null);

		if(aux == null || (Integer)aux.getInfo()>(Integer)nuevo.getInfo()) {
			this.insertar(i);
			return true;
		}

		while(aux != null) {
			if(aux.getSiguiente() == null || (Integer)aux.getSiguiente().getInfo() > (Integer)nuevo.getInfo()) {
				nuevo.setSiguiente(aux.getSiguiente());
				aux.setSiguiente(nuevo);
				size++;
				return true;
			}
			aux = aux.getSiguiente();
		}
		return false;
	}
	

}
