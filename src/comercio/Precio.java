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
public class Precio {

    private String refPrecio;
    private float Precio;

    public Precio(String refPrecio, float Precio) {
        this.refPrecio = refPrecio;
        this.Precio = Precio;
    }

    public String getRefPrecio() {
        return refPrecio;
    }

    public void setRefPrecio(String refPrecio) {
        this.refPrecio = refPrecio;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

}
