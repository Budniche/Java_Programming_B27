package Practice;

public class Student {

    int ID;
    String firstName;
    String lastName;
    String groupNumber;
    double gpa;
    boolean isFullTime;
    char gender;
    int IQ;
    double grade;
    String major;
    double balanceDue;


    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", gpa=" + gpa +
                ", isFullTime=" + isFullTime +
                ", gender=" + gender +
                ", IQ=" + IQ +
                ", grade=" + grade +
                ", major='" + major + '\'' +
                ", balanceDue=" + balanceDue +
                '}';
    }


    public void changeGrade(double change){
        gpa += change;

    }

    public void changeGroup(String newGroup) {
        groupNumber = newGroup;
    }
    public void changeLaastName(String newName) {
        lastName = newName;
}

public void setMajor(){
        if(groupNumber.equals("B27")) {
            major = "Java SDET";
        } else{
            major = "Java developer";
        }
}

public void getPayment(double payment) {
        balanceDue -= payment;
}
}
