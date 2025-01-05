

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CollegeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CollegeTest
{
    /**
     * Default constructor for test class CollegeTest
     */
    public CollegeTest()
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
    public void Describe()
    {
        College college2 = new College(2, 2);
        college2.describe();
    }

    @Test
    public void RunCollege()
    {
        College college3 = new College(2, 4);
        college3.runCollege(4);
    }
}


