package com.lkbhua.MethodDemo1;

public class demo3 {
    public static void main(String[] args) {
        /*  Ŀ�꣺���������ķ������壬�������в����ͷ���ֵ
            ���󣺶���һ����������һ���̳�ÿ�����ȵ�Ӫҵ��
                ���ݷ�������ڼ����ȫ��Ӫҵ��
        * */
      double sale1 =  getQuarterSale(1000,2000,3000);
      double sale2 =  getQuarterSale(2000,3000,4000);
      double sale3 =  getQuarterSale(5000,6000,7000);
      double sale4 =  getQuarterSale(1000,2000,3000);
      double yearSale = sale1+sale2+sale3+sale4;
      System.out.println(yearSale);
    }
    public static double getQuarterSale(double q1,double q2,double q3)
    {
        double sale = q1+q2+q3;
        return sale;
    }
}
