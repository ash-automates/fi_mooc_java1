import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;


public class ExerciseManagementTest {
    private ExerciseManagement em;
    
    @Before
    public void initialize() {
        em = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, em.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        em.add("Write a test");
        assertEquals(1, em.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        em.add("Write a test");
        assertTrue(em.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        em.add("New Exercise");
        em.markAsCompleted("New Exercise");
        assertTrue(em.isCompleted("New Exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        em.add("New Exercise");
        em.markAsCompleted("New Exercise");
        assertFalse(em.isCompleted("Another Exercise"));
    }
}
