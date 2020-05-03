package MAIN;

import com.coep.Department;
import com.coep.Employee;
import com.coep.ListObject;
import java.util.ArrayList;

/**
 *
 * @author Z
 */
public class MAIN {

    public static void main(String[] args) {

        //  Dummy Data
        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(new Employee("Z", 1, 12));
        a1.add(new Employee("Raj", 2, 13));
        ArrayList<Department> d1 = new ArrayList<>();
        d1.add(new Department("COMP", 1));
        d1.add(new Department("IS", 2));

        
        //  Creating Plain Object that can be insert into List of List
        ListObject l = new ListObject();
        l.setE(a1);
        l.setD(d1);

        
        //  Display single Object
        for (int i = 0; i < l.getD().size(); i++) {
            System.out.println(l.getD().get(i).getId());
        }

        
        //  Core Part ArrayList of ArrayList
        ArrayList<ListObject> larray = new ArrayList<>();
        larray.add(l);

        
        //  This way we can get or set List Objects
        for (int i = 0; i < larray.size() - 1; i++) {
            for (int j = 0; j < larray.get(i).getE().size(); i++) {
                System.out.println(larray.get(i).getE().get(j).getName());
            }
        }

    }
}
