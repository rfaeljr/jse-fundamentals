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
public class GorillazFromMonkeyAbstract extends MonkeyAbstract {
    private double size;
    
    public static void main(String[] args){
        //if retirement the comment up down, the compiler raise exception
        //Abstract class cannot be instancead
        //MonkeyAbstract monkey = new MonkeyAbstract();
        GorillazFromMonkeyAbstract africanGorillaz = new GorillazFromMonkeyAbstract();
        //But the object from class abstract can receive object the class child 
        MonkeyAbstract monkey = africanGorillaz;
    }
}
