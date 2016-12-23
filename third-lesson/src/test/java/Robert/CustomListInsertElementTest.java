import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by dmladeno on 20.12.2016.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class CustomListInsertElementTest {


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
   // assertEquals(elementToInsert, testee.get(1));
  }
  
  @Test
  public void shouldInsertStringElementInList() {
    // given
    CustomList<String> testee = new CustomList<String>();
    String elementToInsert = "Stefan";
    // when
    testee.add(elementToInsert);
    // then
    assertEquals(1, testee.size());
    assertEquals(elementToInsert, testee.get(0));
  }

  @Test
  public void shouldInsertTwoStringElementsInList() {
    // given
    CustomList<String> testee = new CustomList<String>();
    String elementToInsert1 = "Stefan";
    String elementToInsert2 = "Robert";
    String elementToInsert3 = "Maja";
    // when
    testee.add(elementToInsert1);
    testee.add(elementToInsert2);
    testee.add(elementToInsert3);
    // then
    assertEquals(3, testee.size());
    assertEquals(elementToInsert1, testee.get(0));
    assertEquals(elementToInsert2, testee.get(1));
    assertEquals(elementToInsert3, testee.get(2));
  }
  
  
  @Test
  public void shouldNotInsertNullList() {
    // given
    CustomList<String> testee = new CustomList<String>();

    // when
    testee.add(null);
    // then
    assertEquals(0, testee.size());
    assertNull(testee.get(0));
  }
  
  @Test
  public void shouldInsertATousendList() {
    // given
    CustomList<Double> testee = new CustomList<Double>();
	Random random = new Random();
    // when
    for (int i = 0; i < 1000; i++) {
    	testee.add(random.nextDouble());
	}
    // then
    assertEquals(1000, testee.size());
    assertNotNull(testee.get(999));
  }
  
}
