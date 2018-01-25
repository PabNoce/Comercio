/*

 */
package comercio;

/**
 *
 * @author pnocedalopez
 */
public class Comercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventas[] ventas = {new Ventas("1", "rpro1", 7), new Ventas("2", "rpro2", 9), new Ventas("3", "rpro3", 4)};
        Producto[] productos = {new Producto("rpro3", "uvas", "rpre1"), new Producto("rpro1", "peras", "rpre3"), new Producto("rpro2", "patatas", "rpre2")};
        Precio[] precios = {new Precio("rpre2", 2), new Precio("rpre1", 5), new Precio("rpre3", 7)};
        Ticket[] tickets = new Ticket[3];

        for (int i = 0; i < ventas.length; i++) {
            String nv = ventas[i].getNumVentas();
            String nome = null;
            float prezoTotal = 0;
            for (Producto producto : productos) {
                if (producto.getRefProducto().equals(ventas[i].getRefProducto())) {
                    nome = producto.getNome();
                    for (Precio precio : precios) {
                        if (producto.getRefPrecio().equals(precio.getRefPrecio())) {
                            prezoTotal = prezoTotal + precio.getPrecio() * ventas[i].getCantidade();
                        }
                    }
                }
            }
            tickets[i] = new Ticket(nv, nome, prezoTotal);
            System.out.println("Ticket "+(i+1)+": "+tickets[i].toString());
        }

    }

}
