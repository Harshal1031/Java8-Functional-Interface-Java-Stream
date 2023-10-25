package demoLambda;
@FunctionalInterface
interface CabD{
	public String bookCab(String str,String str2);
}

public class Test3 {

	public static void main(String[] args) {
              CabD cab=(str,str2)->"The cab is booked for "+str+" to "+str2;
              System.out.println(cab.bookCab("Pune", "Vashi"));
	}

}
