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
public class ObjectInterationBetween {
    
    public static void main(String[] args){
        //instanced  object from differents classes
        LionPolimorfism lion = new LionPolimorfism();
        GorillazFromMonkeyAbstract gorillaz = new GorillazFromMonkeyAbstract();
        
        //encapsulation and hid of atributes
        //the atributes of class do not accessed directly
        lion.setTypeFood("beef");
        gorillaz.setTypeFood("banana");
    }
}
