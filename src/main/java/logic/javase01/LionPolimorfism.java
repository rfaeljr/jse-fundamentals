/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.javase01;

/**
 *
 * @author rafaelcosta
 */
//Concept of Inherintance
//The class LionPolimorfism inherintance all atributes and methods of the class Animal
public class LionPolimorfism extends Animal{
    //construct of the class LionPolimorfism accessing the father constructor
    public LionPolimorfism(){
        super();
    }
    //example polimorfism, override of the method Animal.drink()
    @Override
    public void drink(double litres){
        litres *= 2;
    }
}
