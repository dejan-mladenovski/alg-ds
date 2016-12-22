import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by dmladeno on 20.12.2016.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestList {



  @Test
  public void shouldInsertElementInList() {
    // given
    CustomList<Integer> testee = new CustomList<Integer>();
    Integer elementToInsert = 1;
    // when
    testee.add(elementToInsert);
    // then
    assertEquals(1, testee.size());
    assertEquals(elementToInsert, testee.get(0));

//    uncomment the line to see a failed test. No element exists at index 1
//    assertEquals(elementToInsert, testee.get(1));
  }
  
  @Test
  public void removeElement() {
    // given
    CustomList<Integer> testee = new CustomList<Integer>();
    Integer elementToInsert = 1;
    // when
    testee.add(elementToInsert);
    // then
    testee.removeAt(0);
    assertFalse(testee.isEmpty());
}
 
  @Test
  public void checkIfElementsContainsInList() {
    // given
	  CustomList<Integer> testee = new CustomList<Integer>();
    Integer elementToInsert = 1;
    // when
    testee.add(elementToInsert);
    // then
    boolean result=testee.contains(1);
    assertTrue(result);
    
}
}