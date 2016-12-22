import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmladeno on 20.12.2016.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class CustomListTest {



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

}
