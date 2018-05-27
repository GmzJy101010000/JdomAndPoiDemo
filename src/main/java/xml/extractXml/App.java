package xml.extractXml;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        digui(56,100);
    }
    
   public static void digui(int i,int j){
	 
	  
	   System.out.println(i);
	   i+=2;
	   if(i<=j){
		   digui(i,j);
	   }
	  
   } 
}
