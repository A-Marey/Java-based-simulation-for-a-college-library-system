import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a college with students
 */
public class College {
    private ArrayList<Student> students;
    private Library library;
    private Random random;
    
     /**
     * constructs a new college with a number of students and textbooks in the library.
     *
     * @param numStudents  the number of students in college.
     * @param numTextBooks the number of textbooks in the library.
     */
    public College(int numStudents, int numTextBooks) {
        library = new Library(numTextBooks);
        students = new ArrayList<>();
        random = new Random();

        for (int i = 1; i <= numStudents; i++) {
            students.add(new Student("Student" + i, library));
        }
    }
    
     /**
     * prints out a description of the college.
     */
    public void describe() {
        System.out.println("The college currently has " + students.size() + " hard working students");
        library.describe();
    }
    
     /**
     * Internal method for carrying out the next step in the college.
     * If there are no students left, .
     * - Otherwise, selects a random student and either removes them if they finished studies or lets them study.
     */
    private void nextStep() {
        if (students.isEmpty()) {
            System.out.println("no students left.");
        } else {
            int randomIndex = random.nextInt(students.size());
            Student selectedStudent = students.get(randomIndex);

            if (selectedStudent.finishedStudies()) {
                students.remove(randomIndex);
                System.out.println("Student " + selectedStudent.getName() + " has finished college.");
            } else {
                selectedStudent.study();
            }
        }
    }
    
     /**
     * Runs the college simulation for the specified number of steps.
     *
     * @param nSteps The number of steps to run the simulation.
     */
    public void runCollege(int nSteps) {
        for (int i = 1; i <= nSteps; i++) {
            System.out.println("Step " + i);
            describe();
            nextStep();
        }
    }
    
    /**
     * Main method to run the program standalone.
     *
     * @param args command line arguments for specifying the number of students,textbooks,and steps.
     */
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java College <numStudents> <numTextBooks> <numSteps>");
            return;
        }

        int numStudents = Integer.parseInt(args[0]);
        int numTextBooks = Integer.parseInt(args[1]);
        int numSteps = Integer.parseInt(args[2]);

        College college = new College(numStudents, numTextBooks);
        college.runCollege(numSteps);
    }
}
