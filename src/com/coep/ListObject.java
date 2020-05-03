package com.coep;

import java.util.ArrayList;

/**
 *
 * @author Jahed
 */
public class ListObject {

    //private Employee e1;
    //private Department d1;
    private ArrayList<Employee> e;
    private ArrayList<Department> d;

    public ListObject() {
    }

    public ListObject(ArrayList<Employee> e, ArrayList<Department> d) {
        this.e = e;
        this.d = d;
    }

    public ListObject(ArrayList<Department> d) {
        this.d = d;
    }

    public ArrayList<Employee> getE() {
        return e;
    }

    public void setE(ArrayList<Employee> e) {
        this.e = e;
    }

    public ArrayList<Department> getD() {
        return d;
    }

    public void setD(ArrayList<Department> d) {
        this.d = d;
    }

}
