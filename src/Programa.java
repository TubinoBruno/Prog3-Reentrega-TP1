
public class Programa {

	public static void main(String[] args) {
		Lista milista = new ListaSimple();
		Lista milista2 = new ListaSimple();

		
		milista.insertarFinal(105);
		milista.insertarFinal(111);
		milista.insertarFinal(116);
		milista.insertarFinal(157);
		milista.insertarFinal(1);
		milista.insertarFinal(22);
		milista.insertarFinal(4);
		milista.insertarFinal(54);
		milista.insertarFinal(66);
		milista.insertarFinal(93);
		milista.insertarFinal(94);
		
		milista2.insertarFinal(4);
		milista2.insertarFinal(63);
		milista2.insertarFinal(94);
		milista2.insertarFinal(95);
		milista2.insertarFinal(111);
		milista2.insertarFinal(128);
		milista2.insertarFinal(133);
		milista2.insertarFinal(136);
		milista2.insertarFinal(157);
		milista2.insertarFinal(204);
		
		Lista milistacomun=new ListaSimple();
		milistacomun = milista.getElementosComunesListas( milista2);
		
		milistacomun.print();
		
	}

	
}



