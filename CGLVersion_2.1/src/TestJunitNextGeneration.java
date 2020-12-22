import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class TestJunitNextGeneration 
{

	@Test
	public void NextOne()
	{
		int l[][] = {{1,2}};
		Board b = new Board(3, l);
		CurrentGeneration c = new CurrentGeneration(b);
		NextGeneration n = new NextGeneration(c);
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("...\n...\n...",n.generate().toString());
	}
}