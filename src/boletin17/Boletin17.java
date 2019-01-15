/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author Samuel
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato obxGato = new Gato();
        Tigre oxTigre=new Tigre();
        Morcego obxMorcego= new Morcego();
        Avestruza obxAvestruza= new Avestruza();
        Papagaio obxPapagaio= new Papagaio();
        obxGato.camiñar();
        obxGato.nadar();
        oxTigre.camiñar();
        oxTigre.nadar();
        obxMorcego.camiñar();
        obxMorcego.voar();
        obxAvestruza.camiñar();
        obxAvestruza.voar();
        obxPapagaio.camiñar();
        obxPapagaio.voar();
    }
    
}
