package xml.extractXml;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.xml.parsers.SAXParser;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class MyXml {
	public static void main(String a[]){
		SAXBuilder ssd=new SAXBuilder(false);
		try {
			Document document=ssd.build(new StringReader("<as><return><zgm>88</zgm><zgm>9988</zgm></return></as>"));
			Element rootnode=document.getRootElement();
			
			List<Element> we=((Element) rootnode.getChildren("return").get(0)).getChildren("zgm");
			for(Element ele:we){
				String  sub=ele.getValue();
				System.out.println(sub);
				
			}
		} catch (JDOMException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public MyXml() {
		
	}

}
