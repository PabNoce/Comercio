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
public class Ticket {

    private String numVentas;
    private String nome;
    private float prezoTotal;

    public Ticket(String numVentas, String nome, float prezoTotal) {
        this.numVentas = numVentas;
        this.nome = nome;
        this.prezoTotal = prezoTotal;
    }

    public String getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(String numVentas) {
        this.numVentas = numVentas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezoTotal() {
        return prezoTotal;
    }

    public void setPrezoTotal(float prezoTotal) {
        this.prezoTotal = prezoTotal;
    }

    @Override
    public String toString() {
        return "Nº Venta = " + numVentas + ", Nome = " + nome + ", Prezo Total = " + prezoTotal;
    }

}
