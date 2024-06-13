package src;//Author: Carlos J. Pepin Delgado<carlos.pepin1@upr.edu>

public class Employee {

    private String name;
    private String email;
    private int age;
    private double salary;

    public Employee(String name, String email, int age, double salary) {
        this.setName(name);
        this.setEmail(email);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
