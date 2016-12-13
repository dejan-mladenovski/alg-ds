import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by dmladeno on 23.11.2016.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TaskSolutionTest {

  TaskSolution testee;

  @Test
  public void firstSolution() {
    // given
    int[] array = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};
    // when
    int result = testee.firstEquilibriumSolution(array);
    //then
    assertThat(result, is(1));
  }


}
