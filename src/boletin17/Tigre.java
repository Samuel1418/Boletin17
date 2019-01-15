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
public class Tigre extends Felino implements IPodeCamiñar,IPodeNadar{
    public void camiñar(){
        System.out.println("Tigre camiñando");
    }
    public void nadar(){
        System.out.println("Tigre nadar");
    }
}
