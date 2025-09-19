public class VariableDemo2{
	// 主入口
	public static void main(String[] args){
		// 1.基本用法
		int a = 10;
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		
		// 2.变量参与计算
		int a1 = 10;
		int a2 = 20;
		System.out.println(a1+a2);
		
		// 修改变量记录的值
		a = 50;
		System.out.println(a);
		
		System.out.println("--------------------");
		// 注意事项
		// 在一条语句中，可以定义多个变量
		int d = 100, e = 200, f = 300;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		// 变量在使用之前必须赋值！
		// 建议：在定义变量的时候就赋值初始值！
	}
}