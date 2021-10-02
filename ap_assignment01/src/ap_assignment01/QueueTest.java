package ap_assignment01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class QueueTest {
	
	private Queue obj = new Queue();

	@Before
	public void Enqueue() throws Exception
	{
		obj.enqueue(4);
		obj.enqueue(6);
		obj.enqueue(2);
		obj.display();
	}
	
	@Test
	public void testEnqueue() {
		Queue.Node tmp = obj.head;
		int expectedarr[]= {4,6,2};
		assertEquals(expectedarr.length,obj.size);
		for(int i=0;i<expectedarr.length;i++) {
			assertEquals(expectedarr[i],tmp.key);
			tmp=tmp.next;
		}
	}

	@Test
	public void testDequeue() throws Exception {
		assertEquals(4,obj.dequeue());
		assertEquals(6,obj.dequeue());
		assertEquals(2,obj.dequeue());
		assertEquals(-1,obj.dequeue());
		obj.display();
	}

}
