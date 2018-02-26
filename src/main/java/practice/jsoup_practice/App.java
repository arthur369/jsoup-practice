package practice.jsoup_practice;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
//    	System.out.println("test");
    Document doc=	Jsoup.connect("http://www.yahoo.com.tw").get();
//       Document doc= Jsoup.parse("http://taichitech.blogspot.tw/2014/11/jsoup-html.html","UTF-8");
      Elements titles= doc.getElementsByTag("p");
      boolean noInformation=true;
      for(Element title:titles) {
    	  
    	  String information=title.text();
    	  if(information.contains("氣象")) {
    		  System.out.println(information);
    		  noInformation=false;
    	  }
//    	  System.out.println("title= "+title.text());
      }
      
      if(noInformation) {
    	  System.out.println("查無資料");
      }
      
      
    }
}
