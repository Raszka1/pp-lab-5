import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;


public class Main {
  public static void main(String[] args) {
    //Zad 4
    final int b = 10;
    Person[] people = new Person[5];


    int result = MathUtils.add(2, 6);

    //Zad 1
    try {

      Person person1 = new Person("Andrzej - zad1", 89);

      System.out.println(person1.getName() + " ma " + person1.getAge() + " lat.");
    
    } 
    catch (InvalidAgeException e) {

      System.out.println(e.getMessage());
    }

    //Zad 2 + koniec zadania 3
    EmailMessenger emailMessenger = new EmailMessenger();
    emailMessenger.sendMessage("To jest wiadomość Email z wynikiem dodawania :)");

  }
    
  }
}
