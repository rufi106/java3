package pl.edu.wszib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main
{
    public static void main(String[] args)
    {
        List<Person> list = new ArrayList<Person>(); 
        String firstName;
        String lastName;
        String mode;
        int lastID;
        Scanner input = new Scanner(System.in); 
        while(true)
        {
            System.out.println("p - wypisz | a - dodaj | q - wyjdź");
            mode=input.next();
            if(mode.equals("q"))
                System.exit(0);
            if(mode.equals("p"))
            {
                for (Person person : list) { 
                    System.out.println(person.outputEmail());
                }
            }
            if(mode.equals("a"))
            {
                lastID = 0;
                System.out.print("Imię: ");
                firstName = input.next();
                System.out.print("Nazwisko: ");
                lastName = input.next();

                for (Person person : list) 
                    if (person.firstDotLast.equals(firstName + '.' + lastName)) 
                        lastID++;

                Person newPerson = new Person(firstName, lastName, lastID);
                list.add(newPerson);
            }
        }
    }
}
