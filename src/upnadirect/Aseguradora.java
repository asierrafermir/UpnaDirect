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
public class Aseguradora {
    private String nombre;

    public Aseguradora(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        if (!(nombre.equalsIgnoreCase("Mafro") || nombre.equalsIgnoreCase("Linea Indirecta") || nombre.equalsIgnoreCase("Adasles"))){
            System.out.println("Nombre de aseguradora inválido.");
        }
        return nombre;
    }

    public Double getPorcentajeImporte(Cliente cliente, Bien bien){
        return 0.03;
    }

    public Double getPorcentajeComision(Oferta oferta){
        return 0.01;
    }
}
