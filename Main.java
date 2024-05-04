import company.beans.Person;
import company.exceptions.InvalidAgeException;
//zad2
import company.implementations.EmailMessenger;;

public class Main {
  public static void main(String[] args) {

    //Zad 1
    try {
      Person person1 = new Person("Andrzej", 89);

      System.out.println(person1.getName() + " ma " + person1.getAge() + " lat.");
    } 
    catch (InvalidAgeException e) {

      System.out.println(e.getMessage());
    }

    try {
      Person person2 = new Person("Kuba", 133);

      System.out.println(person2.getName() + " ma " + person2.getAge() + " lat.");
    } 
    catch (InvalidAgeException e) {

      System.out.println(e.getMessage());
    }

    //Zad 2
    EmailMessenger emailMessenger = new EmailMessenger();
    emailMessenger.sendMessage("To jest wiadomość Email :)");
  }
}