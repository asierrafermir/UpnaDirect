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
public class OfertaVentajosa {
    private Aseguradora[] obtenerTodasLasAseguradoras() {
        Aseguradora[] aseguradoras = new Aseguradora[3];
        aseguradoras[0] = new Adasles();
        aseguradoras[1] = new Mafro();
        aseguradoras[2] = new LineaIndirecta();
        return aseguradoras;
    }

    public Oferta calcularOfertaMasVentajosa(Cliente cliente, Bien bien) {
        Aseguradora[] aseguradoras = obtenerTodasLasAseguradoras();
        Oferta ofertaMasVentajosa = null;
        double importeMinimo = Double.MAX_VALUE;

        for (Aseguradora aseguradora : aseguradoras) {
            Oferta ofertaActual = new Oferta(cliente, bien, aseguradora);
            double importeActual = ofertaActual.calcularImporte();

            if (importeActual < importeMinimo) {
                importeMinimo = importeActual;
                ofertaMasVentajosa = ofertaActual;
            } else if (importeActual == importeMinimo) {
                if (ofertaActual.calcularComision() > ofertaMasVentajosa.calcularComision()) {
                    ofertaMasVentajosa = ofertaActual;
                }
            }
        }

        return ofertaMasVentajosa;
    }
}
