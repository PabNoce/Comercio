/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

/**
 *
 * @author pnocedalopez
 */
public class Ventas {

    private String numVentas;
    private String refProducto;
    private int cantidade;

    public Ventas(String numVentas, String refProducto, int cantidade) {
        this.numVentas = numVentas;
        this.refProducto = refProducto;
        this.cantidade = cantidade;
    }

    public String getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(String numVentas) {
        this.numVentas = numVentas;
    }

    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

}
