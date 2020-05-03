package com.coep;

/**
 *
 * @author Jahed
 */
public class Department {

    private String name;
    private int id;

    public Department() {
    }

    public Department(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
