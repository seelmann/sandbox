package com.example.algorithms.sort;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class InsertionSortTest {
	private static final Integer[] SORTED = new Integer[] { Integer.MIN_VALUE,
			-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, Integer.MAX_VALUE };

	private Sort<Integer> sort = new InsertionSort<Integer>();

	@Test
	public void testSortAscendingSorted() {
		Integer[] data = new Integer[] { Integer.MIN_VALUE, -5, -4, -3, -2, -1,
				0, 1, 2, 3, 4, 5, Integer.MAX_VALUE };

		sort.sortAscending(data);

		assertTrue(Arrays.equals(SORTED, data));
	}

	@Test
	public void testSortAscendingUnsorted() {
		Integer[] data = new Integer[] { -4, 3, Integer.MIN_VALUE, -5, 4, -3,
				-2, 1, -1, 2, 5, Integer.MAX_VALUE, 0 };

		sort.sortAscending(data);
		// System.out.println(Arrays.asList(data));

		assertTrue(Arrays.equals(SORTED, data));
	}

	@Test
	public void testSortDescending() {
		Integer[] data = new Integer[] { -4, 3, Integer.MIN_VALUE, -5, 4, -3,
				-2, 1, -1, 2, 5, Integer.MAX_VALUE, 0 };

		sort.sortDescending(data);
		// System.out.println(Arrays.asList(data));

		List<Integer> reverse = new ArrayList<Integer>(Arrays.asList(SORTED));
		Collections.reverse(reverse);
		assertTrue(Arrays.equals(reverse.toArray(), data));
	}

	@Test
	public void testSortNull() {
		sort.sortAscending(null);
	}

	@Test
	public void testSortEmpty() {
		Integer[] data = new Integer[0];

		sort.sortAscending(data);
	}

	@Test
	public void testSortOneElement() {
		Integer[] data = new Integer[] { 0 };

		sort.sortAscending(data);

		assertEquals(1, data.length);
		assertEquals(0, data[0].intValue());
	}
}
