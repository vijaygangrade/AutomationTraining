package practice;

public class Runner 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		 // TODO Auto-generated method stub
		CustomerLogin cust_login = new CustomerLogin();
		
		cust_login.openBrowser();
		
		String user_role = "admin";
		
		if (user_role.equals("admin")) 
		{
			cust_login.adminLogin();
			System.out.println("Admin");
		}
		else
		{
			System.out.println("Customer");
			cust_login.customerLogin();
			
		}
				
		Thread.sleep(15000);
		System.out.println("Close");
		cust_login.closeBrowser();
		
		}

}