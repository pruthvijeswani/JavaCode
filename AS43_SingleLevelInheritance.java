package java_assignments;

public class AS43_SingleLevelInheritance extends AS43_ParentClass
{
	static void searchingProduct()
	{
		System.out.println("Searching the product in the application");
	}
	public static void main(String[] args) 
	{
		launchingBrowser();
		login();
		searchingProduct();
		ClosingBrowser();
	}
}
