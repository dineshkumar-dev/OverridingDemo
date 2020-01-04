
interface FoodType{
	void breakfast();
} 

class IndianBreakfast implements FoodType{

	@Override
	public void breakfast() {
		System.out.println("Idly and sambar");
		
	}
}
class AmericanBreakFast implements FoodType{

	@Override
	public void breakfast() {
		System.out.println("Roasted Bread,bacon and egg\n");
		
	}
	
}
public class Method2 {
	public static  void main(String[] args) {
		FoodType ftAmr=new AmericanBreakFast();
		FoodType ftInd=new IndianBreakfast();
		System.out.println("American breakfast:\n");
		ftAmr.breakfast();
		System.out.println("- - - - - - -");
		System.out.println("Indian breakfast:\n");
		ftInd.breakfast();
	}
}
