
public class ThrowsException {

	//메서드에 예외를 선언하기
	public static void main(String[] args) throws Exception
	{
		method1();
	}
	static void method1() throws Exception
	{
		throw new Exception();
	}
}
