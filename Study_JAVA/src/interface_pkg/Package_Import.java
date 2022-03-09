package interface_pkg;
//같은 패키지 내의 사용할 클래스를 import
import interface_pkg.Import_Print;

public class Package_Import {

	public static void main(String[] args) {
		
		//생성자 생성
		Import_Print import_print = new Import_Print();
		//import된 클래스의 함수 사용
		import_print.Import_Test();

	}

}
