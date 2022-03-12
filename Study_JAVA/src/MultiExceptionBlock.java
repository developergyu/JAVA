
public class MultiExceptionBlock {

	public static void main(String[] args) {
		try 
		{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		//jdk1.7 부터 Multi Exception Block 사용가능
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("예외메시지 : " + e.getMessage());
		}
	}
}
