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
public class Gato extends Felino implements IPodeNadar,IPodeCamiñar{
    public void nadar(){
        System.out.println("Gato nadando");
    }
    public void camiñar(){
        System.out.println("Gato camiñando");
    }
    //Si que precisamos implementar todos os metodos das interfaces
}
