package mainpack;
import java.util.*;
public class PathBuilder {

	public static void main(String args[]) throws Exception{
		String drive= "";
		Scanner sc = new Scanner(System.in);
		//drive = sc.next();
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			String some = sc.next();
			//System.out.println(some);
			sb.append((some+"\\"));
			
			
		}
		
		System.out.println(sb.toString());
		Runtime.getRuntime().exec("explorer.exe /select,"+ sb.toString());
		}
			
	
}
