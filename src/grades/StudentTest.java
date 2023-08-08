package grades;

public class StudentTest {
    public static void main(String[] args) {
        //Verify that you can add grades to each object,
        // and that your getGradeAverage method correctly returns the average of the student's grades.
        Student kurt = new Student("Kurt");
        System.out.println(kurt.name);
        System.out.println(kurt.grades);
        kurt.addGrade(100);
        kurt.addGrade(100);
        kurt.addGrade(0);
        kurt.addGrade(200);
        System.out.println(kurt.grades);
        kurt.getGradeAverage();
        System.out.println(kurt.getGradeAverage());
    }
}
