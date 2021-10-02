package ap_assignment01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

	private Array atest=new Array();
			

	@Before
	public void Insert() {
		atest.insert(3, 0);
		atest.insert(1, 1);
		atest.insert(2, 2);
		atest.insert(0, 3);
		atest.insert(5, 4);
		atest.insert(4, 4);
	}
	
	@Test
	public void testInsert() {
		
		int expected[]= {3,1,2,0,4,5};
		System.out.print(atest.size);
		assertEquals(expected.length,atest.size);
		int size=expected.length;
		for(int i=0;i<size;i++)
			assertEquals(expected[i],atest.array[i]);
	}
	@Test
	public void testDelete() {
		atest.delete(2);
		
		int expected[]= {3,1,0,4,5};
		assertEquals(expected.length,atest.size);
		int size=expected.length;
		for(int i=0;i<size;i++)
			assertEquals(expected[i],atest.array[i]);
	}

	@Test
	public void testLinearSearch() {
		assertEquals("linear search is ",true,atest.linearSearch(0));
		assertFalse(atest.linearSearch(8));
	}

	@Test
	public void testBubbleSort() {
		atest.bubbleSort();
		atest.display();
		int expected[]= {0,1,2,3,4,5};
		assertEquals(expected.length,atest.size);
		int size=expected.length;
		for(int i=0;i<size;i++)
			assertEquals(expected[i],atest.array[i]);
	}

	@Test
	public void testBinarySearch() {
		atest.bubbleSort();
		assertTrue(atest.binarySearch(2, 0, atest.size));
		assertTrue(atest.binarySearch(0, 0, atest.size));
		assertTrue(atest.binarySearch(3, 2, atest.size));
		assertFalse(atest.binarySearch(8, 1, atest.size));
		assertFalse(atest.binarySearch(3, 0, 0));
	    assertFalse(atest.binarySearch(0, 3, 3));  	
	}

}
