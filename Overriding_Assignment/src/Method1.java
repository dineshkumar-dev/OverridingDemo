class Travel{
	void summer() {
		System.out.println("I prefer Travelling in ac bus during summer");
	}
	void winter() {
		System.out.println("I prefer Travelling in normal bus during winter");
	}
}
class Travelling extends Travel{
	@Override
	void summer() {
		System.out.println("I prefer Travelling in normal bus during summer because of budget!!!");
	}
}
public class Method1 {
	public static  void main(String[] args) {
		Travelling t=new Travelling();
		t.summer();
		t.winter();
		
	}
}
