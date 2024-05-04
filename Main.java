//Zad1
import company.beans.Person;
import company.exceptions.InvalidAgeException;
//zad2


public class Main {
  public static void main(String[] args) {

    //Zad 1/
    try {
      Person person1 = new Person("Andrzej - zad1", 89);

      System.out.println(person1.getName() + " ma " + person1.getAge() + " lat.");
    } 
    catch (InvalidAgeException e) {

      System.out.println(e.getMessage());
    }

    try {
      Person person2 = new Person("Kuba - zad1", 133);

      System.out.println(person2.getName() + " ma " + person2.getAge() + " lat.");
    } 
    catch (InvalidAgeException e) {

      System.out.println(e.getMessage());
    }
    
  }
}