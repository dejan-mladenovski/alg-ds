
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

import org.junit.Test;

@RunWith(BlockJUnit4ClassRunner.class)
public class CustomListRemoveElementTest {

	  @Test
	  public void shouldRemoveTheFirstElementOfList() {
		    // given
		    CustomList<String> testee = new CustomList<String>();
		    String elementToInsert1 = "Stefan";
		    String elementToInsert2 = "Robert";
		    String elementToInsert3 = "Maja";
		    // when
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert2);
		    testee.add(elementToInsert3);
		    testee.remove(elementToInsert1);
		    // then
		    assertEquals(2, testee.size());
		    assertEquals(elementToInsert2, testee.get(0));
		    assertEquals(elementToInsert3, testee.get(1));
	  }
	
	  @Test
	  public void shouldRemoveTheLastElementOfList() {
		    // given
		    CustomList<String> testee = new CustomList<String>();
		    String elementToInsert1 = "Stefan";
		    String elementToInsert2 = "Robert";
		    String elementToInsert3 = "Maja";
		    // when
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert2);
		    testee.add(elementToInsert3);
		    testee.remove(elementToInsert3);
		    // then
		    assertEquals(2, testee.size());
		    assertEquals(elementToInsert1, testee.get(0));
		    assertEquals(elementToInsert2, testee.get(1));
	  }
	  
	  @Test
	  public void shouldRemoveTheLastElementOfListByIndex() {
		    // given
		    CustomList<String> testee = new CustomList<String>();
		    String elementToInsert1 = "Stefan";
		    String elementToInsert2 = "Robert";
		    String elementToInsert3 = "Maja";
		    // when
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert2);
		    testee.add(elementToInsert3);
		    testee.removeAt(2);
		    // then
		    assertEquals(2, testee.size());
		    assertEquals(elementToInsert1, testee.get(0));
		    assertEquals(elementToInsert2, testee.get(1));
	  }
	  
	  @Test
	  public void shouldRemoveTheRandomElementOfListByIndex() {
		    // given
		    CustomList<String> testee = new CustomList<String>();
		    String elementToInsert1 = "Stefan";
		    String elementToInsert2 = "Robert";
		    String elementToInsert3 = "Maja";
		    // when
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert2);
		    testee.add(elementToInsert3);
		    testee.removeAt(1);
		    // then
		    assertEquals(2, testee.size());
		    assertEquals(elementToInsert1, testee.get(0));
		    assertEquals(elementToInsert3, testee.get(1));
	  }
	
	  @Test
	  public void shouldRemoveElementOfListOutOfBoundsByIndex() {
		    // given
		    CustomList<String> testee = new CustomList<String>();
		    String elementToInsert1 = "Stefan";
		    String elementToInsert2 = "Robert";
		    String elementToInsert3 = "Maja";
		    // when
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert2);
		    testee.add(elementToInsert3);
		    testee.removeAt(5);
		    // then
		    assertEquals(3, testee.size());
	  }
	  
	  @Test
	  public void shouldRemoveElementOfListWithDataNull() {
		    // given
		    CustomList<String> testee = new CustomList<String>();
		    String elementToInsert1 = "Stefan";
		    String elementToInsert2 = "Robert";
		    String elementToInsert3 = "Maja";
		    // when
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert2);
		    testee.add(elementToInsert3);
		    testee.remove(null);
		    // then
		    assertEquals(3, testee.size());
	  }
	  
	  @Test
	  public void shouldRemoveElementOfEmptyList() {
		    // given
		    CustomList<String> testee = new CustomList<String>();
		    String elementToInsert1 = "Stefan";
		    // when
		    testee.remove(elementToInsert1);
		    // then
		    assertEquals(0, testee.size());
	  }
	  
	  @Test
	  public void shouldRemoveElementOfListWithDuplicates() {
		    // given
		    CustomList<String> testee = new CustomList<String>();
		    String elementToInsert1 = "Stefan";
		    String elementToInsert2 = "Robert";
		    String elementToInsert3 = "Maja";
		    // when
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert1);
		    testee.add(elementToInsert2);
		    testee.add(elementToInsert3);
		    testee.remove(elementToInsert1);
		    // then
		    assertEquals(2, testee.size());
	  }
}
