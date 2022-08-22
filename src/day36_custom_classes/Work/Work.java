package day36_custom_classes.Work;

import java.util.ArrayList;
import java.util.Arrays;

public class Work {
    public static void main(String[] args) {

        Employee james = new Employee("James Bond", 7, "Spy", 10_000_000);
        james.goToMeeting();
        System.out.println(james);

        Employee obj2 = new Employee("Ana");
        System.out.println(obj2);

        Employee obj3 = new Employee("Jane", 9);
        System.out.println(obj3);

        Employee obj4 = new Employee("Penny", 12, "CEO");
        System.out.println(obj4);

        System.out.println("-------------------------------------------------");

        EmployeeV2 james2 = new EmployeeV2("James Bond", 7, "Spy", 10_000_000);
        System.out.println(james2);

        EmployeeV2 obj10 = new EmployeeV2("Ana");
        System.out.println(obj10);

        EmployeeV2 obj11 = new EmployeeV2("Jane", 9);
        System.out.println(obj11);

        EmployeeV2 obj12 = new EmployeeV2("Penny", 12, "CEO");
        System.out.println(obj12);

        // for practice:
        Employee[] arr = new Employee[3];
        arr[0] = james;
        arr[1] = obj2;
        arr[2] = obj3;
        System.out.println(Arrays.toString(arr));

        ArrayList<Employee> list = new ArrayList<>();

    }

    public static class Employee {
        /*
            create a class called Employee

            - data:

                name, id, job title, salary

            - constructor

                - create a constructor that creates an Employee object with the name, id, job title, and salary

                NEW PART: create four total constructors

            - method:

                goToMeeting()
                    when this method is called print:
                        $name is going to a meeting

                toString()
                    print all the employees information

        Create a separate class to create and test the Employee objects
         */

        String name;
        long id;
        String jobTitle;
        double salary;

        public Employee(String name) {
            this.name = name;
        }

        public Employee(String name, long id) {
            this.name = name;
            this.id = id;
        }

        public Employee(String name, long id, String jobTitle) {
            this.name = name;
            this.id = id;
            this.jobTitle = jobTitle;
        }

        public Employee(String name, long id, String jobTitle, double salary) {
            this.name = name;
            this.id = id;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public void goToMeeting(){
            System.out.println(name + " is going to a meeting");
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static class EmployeeV2 {

        String name;
        long id;
        String jobTitle;
        double salary;

        public EmployeeV2(String name) {
            this.name = name;
        }

        public EmployeeV2(String name, long id) {
            this(name);
            this.id = id;
        }

        public EmployeeV2(String name, long id, String jobTitle) {
            this(name, id);
            this.jobTitle = jobTitle;
        }

        public EmployeeV2(String name, long id, String jobTitle, double salary) {
            this(name, id, jobTitle);
            this.salary = salary;
        }

        public String toString(){

            String output = "Name: " + name;

            if(id != 0){ // true if the id was initialized
                output += ", id: " + id;
            }

            if(jobTitle != null){// true if the jobTitle was initialized
                output += ", job title: " + jobTitle;
            }

            if(salary != 0){
                output += ", salary: $" + salary;
            }

            return output;
        }

        // not allowed to call itself
    //    public EmployeeV2(int a){
    //        this();
    //    }
    //
    //    public EmployeeV2(){
    //        this(5);
    //    }

    }
}

