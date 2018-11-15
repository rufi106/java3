package pl.edu.wszib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Kod w PHP:
<?php if(trim($_GET["firstname"])&&trim($_GET["lastname"]))
	file_put_contents("list", $_GET["firstname"].",".$_GET["lastname"]."\n", FILE_APPEND) or die("nie można zapisać do pliku");
$people=file('list', FILE_IGNORE_NEW_LINES) or die("nie można otworzyć pliku");
foreach($people as $person)
	echo (explode(",", $person)[0].".".explode(",", $person)[1].$occurrenceNum[explode(",", $person)[0].",".explode(",", $person)[1]]++."@company.com<br>\n"); ?>
5 linijek z zapisem do pliku i sprawdzaniem poprawności
 */

public class Main
{
    public static void main(String[] args)
    {
        List<Person> list = new ArrayList<Person>(); //PHP jest lepsze
        String firstName;
        String lastName;
        String mode;
        int lastID;
        Scanner input = new Scanner(System.in); //PHP jest lepsze
        while(true)
        {
            System.out.println("p - wypisz | a - dodaj | q - wyjdź");
            mode=input.next();
            if(mode.equals("q"))
                System.exit(0);
            if(mode.equals("p"))
            {
                for (Person person : list) { //PHP jest lepsze
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

                for (Person person : list) //PHP jest lepsze
                    if (person.firstDotLast.equals(firstName + '.' + lastName)) //PHP jest o wiele lepsze
                        lastID++;

                Person newPerson = new Person(firstName, lastName, lastID);
                list.add(newPerson);
            }
        }
    }
}
