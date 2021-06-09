package idv.biggraybao.JUnitTest_maven;

import binarySearch.*;

import triangle.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void binarySearchTest() {
		float[] arr = {5, 4, 3, 2, 1, 6, 7, 9, 8, 0, 100, 1000, 10000};
		Arrays.sort(arr);
		
		assertEquals(-1, BinarySearch.binarySearch(arr, 999));
		assertEquals(4, BinarySearch.binarySearch(arr, 4));
	}
	
	@Test
	public void triangleTest() {
		float[] arr1 = {0, 0, 0};
		assertEquals("不能成為三角形", Triangle.triangle(arr1));
		float[] arr2 = {1, 2, 3};
		assertEquals("不能成為三角形", Triangle.triangle(arr2));
		float[] arr3 = {3, 3, 3};
		assertEquals("正三角形", Triangle.triangle(arr3));
		float[] arr4 = {3, 3, 4};
		assertEquals("等腰三角形", Triangle.triangle(arr4));
		float[] arr5 = {3, 4, 4};
		assertEquals("等腰三角形", Triangle.triangle(arr5));
		float[] arr6 = {5, 6, 7};
		assertEquals("銳角三角形", Triangle.triangle(arr6));
		float[] arr7 = {7, 8, 12};
		assertEquals("鈍角三角形", Triangle.triangle(arr7));
		float[] arr8 = {3, 4, 5};
		assertEquals("直角三角形", Triangle.triangle(arr8));
	}
}
