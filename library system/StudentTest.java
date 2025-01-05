

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void Description()
    {
        Library library2 = new Library(3);
        Student student2 = new Student("Adam", library2);
        student2.describe();
    }

    @Test
    public void Studies()
    {
        Library library2 = new Library(5);
        Student student2 = new Student("Jake", library2);
        assertEquals(false, student2.finishedStudies());
    }

    @Test
    public void GetName()
    {
        Library library1 = new Library(4);
        Student student1 = new Student("Bob", library1);
        assertEquals("Bob", student1.getName());
    }

    @Test
    public void Study()
    {
        Library library1 = new Library(8);
        Student student1 = new Student("Anna", library1);
        student1.study();
    }
}




