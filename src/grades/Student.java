package grades;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades;

   private String name;

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

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    // adds the given grade to the grades property
    public void addGrade(double grade) {
     this.grades.add((int) grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }return sum /grades.size();
    }



}
