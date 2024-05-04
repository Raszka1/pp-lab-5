//Zad1


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
}