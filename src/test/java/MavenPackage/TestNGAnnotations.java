package MavenPackage;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGAnnotations 

{
 
    @BeforeMethod
	public void transactions()
	{
		System.out.println("===Common Code===");
	}
 
	@Test
	public void Purachaseorder()
	{
		System.out.println("New Purchase Order");
	}
	
	/*@Test
	public void salesOrder()
	{
		System.out.println("Raise sale order");
	}*/
	
	@AfterMethod
	public void report()
	{
		System.out.println("===Final===");
	}
}
