
public class ListaDoblementeVinculada extends Lista {
	public ListaDoblementeVinculada(){
		super();
	}

	@Override
	public void insertar(Object o) {
		Nodo aux=new Nodo(o,null);
		if(aux.getSiguiente()!=null){
			aux.getSiguiente().setAnterior(aux);
		}
		aux.setAnterior(null);
		root=aux;
		size++;
	}

	@Override
	public void insertarFinal(Object o) {
		this.setUltimo();
		Nodo nuevo=new Nodo(o,null);
		if(this.ultimo==null){
			insertar(o);
		}
		else{
			Nodo aux=root;
			while(aux.getSiguiente()!=null){
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);
			size++;
		}
	}

	@Override
	public boolean insertarOrdenado(Object o) {
		Nodo aux=root;
		Nodo nuevo=new Nodo(o,null);
		if(aux==null||(int)aux.getInfo()>(int)nuevo.getInfo()){
			insertar(o);
			return true;
		}
		else{
			while(aux.getSiguiente()!=null){
				if(aux.getSiguiente()==null&&(int)aux.getSiguiente().getInfo()>(int)nuevo.getInfo()){
					nuevo.setSiguiente(aux.getSiguiente());
					aux.setSiguiente(nuevo);
					if(aux.getSiguiente()!=null){
						aux.getSiguiente().setAnterior(nuevo);
					}
					aux.setSiguiente(nuevo);
					nuevo.setAnterior(aux);
					size++;
					return true;
				}
			}
		} 
		return false;

	}
}
