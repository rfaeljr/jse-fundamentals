//Basic package
//Here we can grouping class with objective of organized and create hierarchy in classes 
package logic.javase01;

/**
 *
 * @author rafaelcosta
 */
//Concept of class in OOP
//Factory or model for generate objects
//Based in mapping on the real world
public class Animal {
    //atributes (characteristics mapping of any dominium from real world, example Animals)
   private double weight = 0.0;
   private String habitat = "Land";
   private String typeFood = "Herbivorous";
    
   //methods are actions or behavior of the things
   //I'd like of use verbs for the actions
   public void run(double velocity){}
   public void fight(Animal other){}
   public void drink(double litres){}
   
   //Creation of methods for get and set atributes
   //In OOP we have the important concept, Encapsulation
   //That sad the atributes can not be directly accessed, for this are created methods get and set

    public double getWeight() {
        return weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }
   
    
}
