import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class TestJunitBoard 
{

	@Test
	public void BoardOne()
	{
		int live[][] = {{1,2}}; 
		Board b = new Board(3,live);
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("...\n..*\n...",b.toString());
	}
}
