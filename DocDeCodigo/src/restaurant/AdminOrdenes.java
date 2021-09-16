package restaurant;

import java.util.ArrayList;
import java.util.List;

public class AdminOrdenes {
	List<Pedido> pedidos;

	public AdminOrdenes() {
		super();
		pedidos = new ArrayList<Pedido>();
	}

	void procesar() {

	}

	/**
	 * Agrega un pedido pasado por parametro.
	 * 
	 * @param un objeto de la clase pedido.
	 * @return id del pedido agregado.
	 */
	int agregar(Pedido p) {
		p.setEstado("ENCARGADO");
		pedidos.add(p);
		int id = Pedido.getNextID();
		p.setId(id);
		Pedido.setNextID(id + 1);
		System.out.println("se ha generado el pedido con el id: " + id);
		return id;
	}

}
