package LambdaExercise;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
            new Person("Charles","Dickens",60),
            new Person("Lewis","Carrol",42),
            new Person("Thomas","Carlyle",51),
            new Person("Charlotte","Bronte",45),
            new Person("Matthew","Arnold",39));

        System.out.println("using object instance:");
        System.out.println(people);


        System.out.println("Using for loop:");
        for(int i = 0;i<people.size();i++){
            System.out.println(people.get(i));
        }

        System.out.println("Using for in loop:");
        for (Person p : people) {
            System.out.println(p);
        }


        System.out.println("Using Lambda method reference for each loop");
        people.forEach(System.out::println);


        System.out.println("Using Lambda Regular for each loop:");
        people.forEach(p -> System.out.println(p));


    }



    }


class Person{

 private   String  FirstName;
 private String LastName;
 private int Age;

    Person(String FirstName, String LastName, int Age){
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Age = Age;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
       this. FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
       this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                '}';
    }
}