
public class MultiExceptionBlock {

	public static void main(String[] args) {
		try 
		{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		//jdk1.7 ���� Multi Exception Block ��밡��
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("���ܸ޽��� : " + e.getMessage());
		}
	}
}
