package week2.day1;

public class Browser {

	public static void launchBrowser(String browserName) {
	System.out.println(browserName);

	}
	public String loadurl(String sturl) {
	return sturl;	
	}
	public static void main(String[] args) {
		Browser obj = new Browser();
		Browser.launchBrowser("chrome");
		
		String loadURL = obj.loadurl("URL Loaded successfully");
		System.out.println(loadURL);
	}
}

