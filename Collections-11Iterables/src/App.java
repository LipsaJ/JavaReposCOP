
public class App {

	public static void main(String[] args) {
		
		UrlLibrary UrlLibrary = new UrlLibrary();
		
		for(String html: UrlLibrary ){
			System.out.println(html.length());
		}
	} 
}
