package models;

public class Manager extends Staff {

    private int popularity;

    public Manager(){}

    public Manager(String name, double salary, int popularity){
        super(name, salary);
        this.popularity = popularity;
    }
}
