package demoLambda;


@FunctionalInterface
interface Cab{
	public void bookCab(String source,String destination);
}
//normal way
class Ola implements Cab{

	@Override
	public void bookCab(String source, String destination) {
     System.out.println("The cab is booked for "+source+" to "+destination);		
	}
	
}
public class Test2 {

	public static void main(String[] args) {
      Cab cab=new Ola();
      cab.bookCab("Pune", "Mumbai");
      //Lambda
      Cab cb=(str,str2)-> System.out.println("The cab is booked for "+str+" to "+str2);
      cb.bookCab("PUNE", "BHUSAWAL");
      
	}

}
