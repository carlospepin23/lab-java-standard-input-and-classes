![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Standard Input and Classes

## Introduction

We have just learned how to use input/output in the console and files, so let's practice a bit more.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

### Employee and Intern Classes

1. Create an `Employee` class to represent an employee of a company. The class should have `name`, `email`, `age`, `salary` properties and appropriate getters and setters.
2. Create an `Intern` class that extends from `Employee`. The `Intern` class should have a salary limit of 20000 (constant).
3. Implement validation in the `Intern` class to ensure that an intern is not created (or salary updated) with a salary that exceeds the maximum allowed value.
4. Write a program that creates 10 `Employee` objects and prints all of their properties (name, email, age, salary) to a file named `employees.txt`.

<br>

### Tips

- Be sure to consider the relationship between the `Employee` and `Intern` classes when designing your solution.
- Think about the different properties and behaviors that are applicable to both `Employee` and `Intern` objects and consider how you can use inheritance to avoid duplication of code.
- Use appropriate access modifiers (e.g. `private`, `protected`, `public`) to control the visibility of your class properties and methods.
- Make sure to handle edge cases and handle them appropriately (e.g. what happens if an `Intern` object is created with a salary that exceeds the maximum allowed value?).

<br>

## FAQs

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am stuck and don't know how to solve the problem or where to start. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are stuck in your code and don't know how to solve the problem or where to start, you should take a step back and try to form a clear, straight forward question about the specific issue you are facing. The process you will go through while trying to define this question, will help you narrow down the problem and come up with potential solutions.

  For example, are you facing a problem because you don't understand the concept or are you receiving an error message that you don't know how to fix? It is usually helpful to try to state the problem as clearly as possible, including any error messages you are receiving. This can help you communicate the issue to others and potentially get help from classmates or online resources.

  Once you have a clear understanding of the problem, you should be able to start working toward the solution.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I create a Maven project in IntelliJ?</summary>

  <br> <!-- ✅ -->

  To create a Maven project in IntelliJ, you can follow these steps:

  1. Open IntelliJ IDEA and click the "Create New Project" button.
  2. In the "New Project" dialog, select "Maven" as the build system.
  3. Specify the name of the project.
  4. In the "Project Location" section, specify a location where you want to save your project.
  5. Select the "Create Git repository" checkbox in order to initialize the git repository upon creation of the project.
  6. Click the "Create" button to create the Maven project.

 
 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is inheritance in Java and how do I extend a class to another class?</summary>

  <br> <!-- ✅ -->

  Inheritance in Java is a mechanism that allows you to create a new class (the child class) based on an existing class (the parent class). The child class inherits the properties and methods of the parent class, which means that you can reuse the code and add new functionality to the child class.

  To extend a class to another class, you use the `extends` keyword in the child class declaration. The parent class is specified after the `extends` keyword. For example:

  ```java
  class ParentClass {
      int x;

      void display() {
          System.out.println("This is the ParentClass");
      }
  }

  class ChildClass extends ParentClass {
      int y;

      void display() {
          System.out.println("This is the ChildClass");
      }
  }
  ```

  In this example, `ChildClass` extends `ParentClass`, so it inherits the `x` variable and the `display()` method. You can also add new properties and methods to the child class, such as the y variable and the `display()` method override in the child class.

  It's important to note that the child class can access all the properties and methods of the parent class that have public or protected visibility. Properties and methods with private visibility are not inherited by the child class.

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the difference between using "PrintWriter" and "FileWriter" in Java and how can they be used together?</summary>

  <br> <!-- ✅ -->

  `PrintWriter` and `FileWriter` are two classes in Java that are used to write data to a file. However, they serve different purposes and have different features.

  `FileWriter` is a basic class in Java that provides simple file output functions. You can use it to write text to a file, but it does not provide any formatting options, such as controlling the number of characters per line or specifying the line separator.

  `PrintWriter`, on the other hand, provides advanced printing functions, including formatting options and automatic line flushing. It also provides a more user-friendly API for writing to a file compared to `FileWriter`.

  Here's how you can use `FileWriter` and `PrintWriter` together in a program:

  ```java
  import java.io.*;

  public class WriteToFile {
      public static void main(String[] args) {
          try {
              FileWriter fw = new FileWriter("output.txt");
              PrintWriter pw = new PrintWriter(fw);
              pw.println("This is a line written using PrintWriter");
              pw.println("Another line written using PrintWriter");
              pw.close();
              fw.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
  }
  ```

  In this example, `FileWriter` is used to open a file named `output.txt` and `PrintWriter` is used to write lines of text to the file. The `println` method in `PrintWriter` automatically adds a line separator after each line of text, making it easier to write formatted text to a file.

  It's important to note that you need to close both `FileWriter` and `PrintWriter` when you are done writing to the file, as shown in the code above.

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am unable to push changes to my repository. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are unable to push changes to your repository, here are a few steps that you can follow:

  1. Check your internet connection: Ensure that your internet connection is stable and working.
  1. Verify your repository URL: Make sure that you are using the correct repository URL to push your changes.
  2. Check Git credentials: Ensure that your Git credentials are up-to-date and correct. You can check your credentials using the following command:

  ```bash
  git config --list
  ```

  4. Update your local repository: Before pushing changes, make sure that your local repository is up-to-date with the remote repository. You can update your local repository using the following command:

  ```bash
  git fetch origin
  ```

  5. Check for conflicts: If there are any conflicts between your local repository and the remote repository, resolve them before pushing changes.
  6. Push changes: Once you have resolved any conflicts and updated your local repository, you can try pushing changes again using the following command:

  ```bash
  git push origin <branch_name>
  ```

</details>
