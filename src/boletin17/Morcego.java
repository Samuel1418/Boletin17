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
public class Morcego extends Mamifero implements IPodeVoar,IPodeCamiñar{
     public void voar(){
        System.out.println("Morcego voando");
    }
     public void camiñar(){
         System.out.println("Morcego camiñando");
     }
}
