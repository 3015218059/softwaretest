package homeWork1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	
	Triangle t1 = new Triangle();
	public void test(){
		assertEquals("noTriangle",t1.function(-1, 2, 3));
		assertEquals("noTriangle",t1.function(1, 2, 3));
		assertEquals("noTriangle",t1.function(8, 2, 3));
		assertEquals("equilateral",t1.function(3, 3, 3));
		assertEquals("isosceles",t1.function(3, 3, 2));
		assertEquals("scalene",t1.function(3, 4, 2));
	}
	public static void main(String[] args) {
		TriangleTest t2 = new TriangleTest();
		t2.test();
	}
}
