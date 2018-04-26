
public class ordenado extends filtro {

	@Override
	public Lista insertar(Lista l1, Object o) {
		Lista aux=l1;
		aux.insertarOrdenado(o);
		return aux;
	}
	
}
