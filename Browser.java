package Week1.day3;

public class Browser {

	
	public void launchBrowser(String Browsername) {
		
System.out.println(Browsername);
	}	
	
	public void loadURL() {
		
		System.out.println("Application url loaded successfully");
	}
	
	
	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.launchBrowser("Browser launched sucessfully"); 
		obj.loadURL();

	}

}
