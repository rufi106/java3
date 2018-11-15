package pl.edu.wszib;

public class Person {
    public String firstDotLast;
    public int id;
    public Person(String firstName, String lastName, int id)
    {
        this.firstDotLast=firstName+"."+lastName;
        this.id=id;
    }

    public String outputEmail()
    {
        return this.id==0 ? this.firstDotLast+"@mex.com" : this.firstDotLast+this.id+"@mex.com";
    }
}