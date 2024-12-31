import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Michael", "Quinter", "01/02/2015");
        Employee e2 = new Employee("Jane", "Doe", "05/08/2000");
        Employee e3 = new Employee("John", "Dee", "11/02/2011");
        Employee e4 = new Employee("Justin", "Reeves", "05/03/2013");
        Employee e5 = new Employee("Steven", "Blaine", "23/07/2020");

        List<Employee> employees = new ArrayList<>(List.of(e1, e2, e3, e4, e5));
        printOrderedList(employees, "name");
        System.out.println();
        printOrderedList(employees, "year");
    }

    public static void printOrderedList(List<Employee> eList, String sortField) {

        int currentYear = LocalDate.now().getYear();

        class DecoratedEmployee {

            private Employee containedEmployee;
            private String fullName;
            private int yearsWorked;

            public DecoratedEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.firstName(), containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName, yearsWorked);
            }
        }

        List<DecoratedEmployee> list = new ArrayList<>();
        for (Employee employee : eList) {
            list.add(new DecoratedEmployee(employee));
        }

        var comparator = new Comparator<DecoratedEmployee>() {

            @Override
            public int compare(DecoratedEmployee o1, DecoratedEmployee o2) {
                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list.sort(comparator);
        for (DecoratedEmployee employee : list) {
            System.out.println(employee);
        }
    }
}
