
public abstract class Lista {
	protected Nodo root;
	protected Nodo ultimo;
	protected int size;
	Lista(){
		root=null;
		ultimo=null;
		size=0;
	}

	public abstract void insertar(Object o);
	public abstract void insertarFinal(Object o);
	public abstract boolean insertarOrdenado(Object o);

	
	public Object extract(){
		Object info=null;
		if(root!=null){
			info=root.getInfo();
			root=root.getSiguiente();
		}
		size--;
		return info;  
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return root.getInfo().equals(null);
	}
	public boolean contains(Object o){
		Nodo aux=this.root;

		while(aux!=null){
			if(aux.getInfo().equals(o)){
				return true;
			}
			aux=aux.getSiguiente();
		}
		return false;
	}
	public void setUltimo(){
		Nodo aux=new Nodo();
		aux=root;
		while(aux!=null&&aux.getSiguiente()!=null){
			aux=aux.getSiguiente();
		}
		this.ultimo=aux;
	}
	public boolean estaOrdenada(){
		Nodo aux = new Nodo();
		aux = root;
		
		if(aux == null) {
			return true;
		}
		
		while(aux.getSiguiente() != null) {
			if((Integer)aux.getInfo() > (Integer)aux.getSiguiente().getInfo()) {
				return false;
			}
			aux = aux.getSiguiente();
		}
		
		return true;
	}
	
	public void print(int n){
		Nodo tmp=root;
		int i=1;
		while(i<=n){
			tmp=tmp.getSiguiente();
			if(i==n){
				System.out.println(tmp.getInfo());
			}
			i++;
		}
	}
	public void print(){
		Nodo tmp=root;
		while(tmp!=null){
			System.out.println(tmp.getInfo());
			tmp=tmp.getSiguiente();
		}
	}
	public Lista getElementosComunesListas( Lista l2) {
		Lista aux = new ListaSimple();
		Integer size = this.size();
		Object o = null;
		filtro filtro = null;
		
		if(this.estaOrdenada()) {
			filtro = new insertarFinal();
		}
		
		else {
			filtro = new ordenado();
		}

			for(int i = 0; i<size ; i++) {
				o = this.extract();
				if(l2.contains(o)) {
					filtro.insertar(aux, o);
				}
			}
		return aux;
	}
}
