import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;

import company.utils.MathUtils;

public class Main {
  public static void main(String[] args) {
    //Zad 4
    final int b = 10;
    


    int result = MathUtils.add(2, 6);
     //zad 4 
    for (int i = 0; i < people.length; i++) {
      if (people[i] != null) {
          int value = MathUtils.add(people[i].getAge(), b);
          // Wykorzystaj wartość w treści wiadomości metody sendMessage
          emailMessenger.sendMessage(people[i].getName() + "'s wartosc to: " + value);
      }
  }
  }
    
}
