package webdriver_Arch;

public interface Webdriver extends SearchContext{
	
	public void findelement(String element);
	
	public void get (String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public void close();

}
