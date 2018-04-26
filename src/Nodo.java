
public class Nodo {
	private Object info;
	private Nodo siguiente;
	private Nodo anterior;
	public Nodo(){
		info=null;
		siguiente=null;
		anterior=null;
	}
	public Nodo(Object o,Nodo n){
		info=o;
		siguiente=n;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	
}
