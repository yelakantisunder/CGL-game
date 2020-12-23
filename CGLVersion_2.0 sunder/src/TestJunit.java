import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Sunder
 *
 */

public class TestJunit {
@Test
 public void testCGLOne() {
 Board b = new Board();
 System.out.println("======TEST ONE EXECUTED=======");
 System.out.println(b.printBoard(null));
     Assertions.assertEquals("Board is printed",b.printBoard(null));
}

 @Test
 public void testCGLTwo() {
 Board b = new Board();
 System.out.println("======TEST TWO EXECUTED=======");
     Assertions.assertSame(false,b.createboard(-5,null));
 
 
 }
@Test
 public void testCGLThree() {
 Board b = new Board();

     System.out.println("======TEST THREE EXECUTED=======");
     Assertions.assertSame(true,b.createboard(5,null));
 }
}