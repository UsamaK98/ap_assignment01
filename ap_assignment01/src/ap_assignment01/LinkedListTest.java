package ap_assignment01;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	LinkedList list = new LinkedList();
	
	
	@Test
	public void pushFrontTest() {
		list.display();
		
		list.pushFront(2);
		list.pushFront(5);
		list.pushFront(1);
		list.pushFront(50);

		assertEquals(50,list.head.key);
	}

	@Test
	public void pushBackTest() {
		list.pushBack(0);
		list.pushBack(5);
		list.pushBack(4);
		list.pushBack(5);

		LinkedList.Node temp = LinkedList.head;
		while(temp.next != null){
			temp=temp.next;
		}
		
		assertEquals(5,temp.key);
	}

	@Test
	public void popBackTest() {
		list.pushBack(5);
		list.pushBack(6);
		list.pushBack(7);
		list.pushBack(5);
		list.popBack();
		list.popBack();
		list.popBack();
		
		assertEquals(5,list.head.key);
	}

	@Test
	public void popFrontTest() {
		list.pushFront(8);
		list.pushFront(9);
		list.pushFront(8);
		list.popFront();
		list.popFront();

		assertEquals(8,list.head.key);		
	}
	
	@Test 
	public void remainingTests () {
		
		list.pop(0);
		list.pushFront(1);
		list.pop(0);
		list.pushFront(2);
		list.popBack();
		list.pushBack(3);
		list.pushBack(4);
		list.pop(3);
		list.pop(1);
	
		list.display();
	}

}