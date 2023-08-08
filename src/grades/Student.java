package grades;

import java.util.ArrayList;

public class Student {
    protected ArrayList<Integer> grades;

    protected String name;

    // The student class should have a constructor
    // that sets name property,
    // and initializes the grades property as an empty ArrayList
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }


    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
     this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }return sum /grades.size();
    }



}
