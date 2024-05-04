<<<<<<< HEAD
//Zad1
import company.beans.Person;
import company.exceptions.InvalidAgeException;
//zad2
import company.implementations.EmailMessenger;
import company.utils.MathUtils;


public class Main {
  public static void main(String[] args) {
    //Zad 4
    final int b = 10;
    Person[] people = new Person[5];


    int result = MathUtils.add(2, 6);

    //Zad 1
    try {
      //Zad4

      people[0] = new Person("IronMan", 30);
      people[0] = new Person("BlackWidow", 21);
      people[0] = new Person("Hulk", 55);
      people[0] = new Person("CapitanAmeryka", 48);
      people[0] = new Person("Jarvis", 62);


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

    //Zad 2 + koniec zadania 3
    EmailMessenger emailMessenger = new EmailMessenger();
    emailMessenger.sendMessage("To jest wiadomość Email z wynikiem dodawania:" + result);

    //zad 4 - koniec
    for (int i = 0; i < people.length; i++) {
      if (people[i] != null) {
          int value = MathUtils.add(people[i].getAge(), b);
          // Wykorzystaj wartość w treści wiadomości metody sendMessage
          emailMessenger.sendMessage(people[i].getName() + "'s wartosc to: " + value);
      }
  }
    
  }
=======
//Zad1
import company.beans.Person;
import company.exceptions.InvalidAgeException;
//zad2
import company.implementations.EmailMessenger;
import company.utils.MathUtils;


public class Main {
  public static void main(String[] args) {
    //Zad 4
    final int b = 10;
    Person[] people = new Person[5];


    int result = MathUtils.add(2, 6);

    //Zad 1
    try {
      //Zad4

      people[0] = new Person("IronMan", 30);
      people[0] = new Person("BlackWidow", 21);
      people[0] = new Person("Hulk", 55);
      people[0] = new Person("CapitanAmeryka", 48);
      people[0] = new Person("Jarvis", 62);


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

    //Zad 2 + koniec zadania 3
    EmailMessenger emailMessenger = new EmailMessenger();
    emailMessenger.sendMessage("To jest wiadomość Email z wynikiem dodawania:" + result);

    //zad 4 - koniec
    for (int i = 0; i < people.length; i++) {
      if (people[i] != null) {
          int value = MathUtils.add(people[i].getAge(), b);
          // Wykorzystaj wartość w treści wiadomości metody sendMessage
          emailMessenger.sendMessage(people[i].getName() + "'s wartosc to: " + value);
      }
  }
    
  }
>>>>>>> c036df3e384b46e5d100e9320976d55b04c8aa62
}