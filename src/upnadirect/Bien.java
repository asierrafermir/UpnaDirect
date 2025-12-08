/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class Bien {
    private String tipo;
    private int valor;

    public Bien(String tipo, int valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo(){
        if (!(tipo.equalsIgnoreCase("Vehiculo") || tipo.equalsIgnoreCase("Vivienda"))){
            System.out.println("Tipo de bien inválido.");
            return null;
        } else {
            return tipo;
        }
    }

    public int getValor(){
        if (valor < 0 || (!(tipo.equalsIgnoreCase("Vehiculo")) && valor > 50000) || (!(tipo.equalsIgnoreCase("Vivienda")) && valor < 500000)){
            System.out.println("Valor del bien inválido.");
            return -1;
        } else {
            return valor;
        }
    }
}
