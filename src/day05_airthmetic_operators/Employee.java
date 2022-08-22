package day05_airthmetic_operators;

public class Employee {

      /*
    create a class Employee
create a main method
    declare and assign these variables with the most appropriate datatypes:
        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time
    declare new variables and use concatenation from previous variables to set their values
        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")
    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.
     */
    public static void main (String[] args){
        String firstName = "Nataliia";
        String lastName = "Budni";
        String companyName = "MCFR";
        String jobTitle = "editor";
        char suite = 'E';
        int employeeId = 9;
        int umberOfPTO = 12;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName;
        String email = firstName + employeeId + '@' + companyName + ".com";
        String benefits = "$" + salary + " salary a year," + umberOfPTO + " PTO days and WFH.";

String summary = "Employee information for" + fullName + "." + jobTitle + "for " + companyName + ", based in suite " + suite + " .Mr/Mrs " + lastName  + " at " + email + ". Current benefits include " + benefits;

        System.out.println(summary);




    }
}
