package grades;

import util.Input;

import java.util.HashMap;

//Create a class named GradesApplication with a main method. Inside the main method,
// create a HashMap named students. It should have keys that are strings
// that represent github usernames, and values that are Student objects.
// Create at least 4 Student objects with at least 3 grades each, and add them to the map.
public class GradesApplication {


    public static void main(String[] args) {
        Student kurt = new Student("Kurt");
        kurt.addGrade(85);
        kurt.addGrade(92);
        kurt.addGrade(78);

        Student anthony = new Student("Anthony");
        anthony.addGrade(90);
        anthony.addGrade(88);
        anthony.addGrade(95);

        Student erick = new Student("Erick");
        erick.addGrade(75);
        erick.addGrade(83);
        erick.addGrade(79);

        Student alice = new Student("Alice");
        alice.addGrade(95);
        alice.addGrade(89);
        alice.addGrade(91);

        HashMap<String, Student> students = new HashMap<>();

        System.out.println(students.size());
        ///// PUTTING THE STUDENTS IN HASH MAP
        students.put("Kurt4269", kurt);
        students.put("Anthony7356", anthony);
        students.put("Erick07537", erick);
        students.put("Alice3689", alice);

        System.out.println(students.size());
        System.out.println(students);


/////////


        Input input = new Input();

        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Grades Application!");
            System.out.println("Here are the GitHub usernames of the students:");

            for (String username : students.keySet()) {
                System.out.print(username + " ");
            }

            System.out.println("\nEnter a GitHub username to see more information (or type 'exit' to quit):");
            String usernameInput = input.getString();

            if (usernameInput.equalsIgnoreCase("exit")) {
                running = false;
            } else {
                Student student = students.get(usernameInput);
                if (student == null) {
                    System.out.println("No student found with that GitHub username.");
                } else {
                    System.out.println("\nStudent Name: " + student.getName());
                    System.out.println("Grades: " + student.getGrades());
                    System.out.println("Average Grade: " + student.getGradeAverage());
                }
            }
        }

        System.out.println("Thank you for using the Grades Application!");
    }

}

