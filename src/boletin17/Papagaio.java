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
public class Papagaio extends Aves implements IPodeCamiñar,IPodeVoar{
 public void camiñar(){
     System.out.println("Papagaio camiñando");
 }
 public void voar(){
     System.out.println("Papagaio voando");
 }

}
