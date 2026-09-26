package test.algorithms.arrays;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

import com.algorithms.arrays.LinkedListHelper;

public class LinkedListTest {

	@Test
	public void testLinklistToString() {
		LinkedList<String> object = new LinkedList<String>();

        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");

        assertEquals("[D, A, E, B, C, F, G]", object.toString());
	}

	@Test
	public void testFindMiddleElement() {
		LinkedListHelper linkedList = new LinkedListHelper();
		LinkedListHelper.Node head = linkedList.head();
		linkedList.add(new LinkedListHelper.Node("1"));
		linkedList.add(new LinkedListHelper.Node("2"));
		linkedList.add(new LinkedListHelper.Node("3"));
		linkedList.add(new LinkedListHelper.Node("4"));

		// Finding middle element of LinkedList in single pass
		LinkedListHelper.Node current = head;
		int length = 0;
		LinkedListHelper.Node middle = head;

		// Move this code portion?
		while (current.next() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next();
			}
			current = current.next();
		}

		if (length % 2 == 1) {
			middle = middle.next();
		}

		assertEquals(4, length);
		assertEquals("2", middle.toString());
	}
}
