// 1.导包，找到Scanner这个类在哪
// 书写要注意：要写在类定义的上面
// 计算两个整数数字之和
import java.util.Scanner;

public class ScannerDemo2{
	public static void main(String[] args){
		// 创建对象，表示我现在准备要用Scanner这个类
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数字:");
		// 接受数据
		// 变量i记录了键盘录入的数据
		int num1 = sc.nextInt();
		
		// 再次接受第二个数据
		System.out.println("请输入第二个数字:");
		int num2 = sc.nextInt();
		System.out.println(num1+num2);
	}
}