package experiment7;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mytest {

	public void testlogin()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc","abc123"));
		
	}
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(1,myapp.userLogin("abc","abc@123"));
		
	}
}
