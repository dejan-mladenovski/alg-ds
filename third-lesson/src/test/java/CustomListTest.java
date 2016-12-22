import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

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

		// uncomment the line to see a failed test. No element exists at index 1
		// assertEquals(elementToInsert, testee.get(1));

	}

	// Test for empty list after deletion of one element
	@Test
	public void shouldRemoveElementInList() {
		CustomList<Integer> testee = new CustomList<Integer>();
		Integer elementToInsert = 1;
		testee.add(elementToInsert);

		testee.removeAt(0);
		assertTrue(testee.isEmpty());
	}

	// Test for the CustomList objects
	@Test
	public void shouldCheckForSameElementsInList() {
		CustomList<Integer> test1 = new CustomList<Integer>();
		CustomList<Integer> test2 = new CustomList<Integer>();

		Integer elementToInsert1 = 1;
		Integer elementToInsert2 = 1;
		test1.add(elementToInsert1);
		test2.add(elementToInsert2);

		assertEquals(test1.get(0), test2.get(0));

	}

	// Test for checking if some value is the CustomList
	@Test
	public void shouldCheckElementsContainsInList() {
		CustomList<Integer> test1 = new CustomList<Integer>();
		Integer elementToInsert1 = 1;
		test1.add(elementToInsert1);

		boolean result = test1.contains(1);
		assertTrue(result);
	}

	// Test for checking last element of list
	@Test
	public void shouldCheckLastElementInList() {
		CustomList<Integer> test1 = new CustomList<Integer>();
		Integer elementToInsert1 = 1;
		Integer elementToInsert2 = 5;
		Integer elementToInsert3 = 10;
		Integer elementToInsert4 = 15;
		Integer elementToInsert5 = 20;
		test1.add(elementToInsert1);
		test1.add(elementToInsert2);
		test1.add(elementToInsert3);
		test1.add(elementToInsert4);
		test1.add(elementToInsert5);

		int result1 = test1.lastIndexOf(20);
		assertEquals(result1, 4);
	}

	// Test for checking does list is empty
	@Test
	public void shouldCheckEmptyList() {
		CustomList<Integer> test1 = new CustomList<Integer>();
		Integer elementToInsert1 = 1;
		Integer elementToInsert2 = 5;
		test1.add(elementToInsert1);
		test1.add(elementToInsert2);
		test1.clear();
		assertTrue(test1.size() == 0);
	}
}
