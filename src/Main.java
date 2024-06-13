package src;//Author: Carlos J. Pepin Delgado<carlos.pepin1@upr.edu>

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //EMPLOYEE CREATION
        Employee e1 =new Intern("Carlos","carlos@gmail.com",20,19999);
        Employee e2 =new Intern("Clarymar","clary@gmail.com",19,20000);
        Employee e3 =new Intern("Ortiz","ortiz@gmail.com",19,500);
        Employee e4 =new Intern("Luisito","luis@gmail.com",19,19999);
        Employee e5 =new Employee("Isoelis","iso@gmail.com",25,100001);
        Employee e6 =new Employee("Marie","marie@gmail.com",25,100000);
        Employee e7 =new Employee("Iris","iris@gmail.com",42,90000);
        Employee e8 =new Employee("Hugo","hugo@gmail.com",45,45000);
        Employee e9 =new Employee("Javier","javier@gmail.com",46,44000);
        Employee e10 =new Employee("Pito","pito@gmail.com",48,40000);

        Employee[] staff={e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};

        //DOCUMENT GENERATOR & MODIFIER
        FileWriter fw = new FileWriter("src/employees.txt");
        fw.write("The currents employees & interns in our company are: \n");

        for (Employee e : staff) {
            fw.write("Name: " + e.getName() + "  ");
            fw.write("Email: " + e.getEmail() + "  ");
            fw.write("Age: " + e.getAge() + "  ");
            fw.write("Salary: " + e.getSalary() + "\n");
        }

        fw.close();
    }
}
