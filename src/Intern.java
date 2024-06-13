package src;//Author: Carlos J. Pepin Delgado<carlos.pepin1@upr.edu>

public class Intern extends Employee{

    public final double SALARY_LIMIT = 20000; //SALARY LIMIT FOR INTERNS
    private double salary;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        if(salary>SALARY_LIMIT){
            throw new IllegalArgumentException("Salary for intern cannot exceed "+SALARY_LIMIT);
        }

    }

    @Override
    public void setSalary(double salary){
        if(salary>SALARY_LIMIT){
            throw new IllegalArgumentException("Salary for intern cannot exceed "+SALARY_LIMIT);
        }
        super.setSalary(salary);
    }
}
