package zyc;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{
 String name;
 String sex;
 int age;
 double fee;
 double pay;
 
 @Override
 public void setPay(double pay) {
  this.pay = pay * 12;
  System.out.println("���������Ϊ��" + this.pay);
 }
 
 @Override
 public void getPay(double pay) {
  this.pay = pay * 12;
  System.out.println("���������Ϊ��" + this.pay);
 }
@Override
public void setFee(double fee) {
this.fee = fee;
System.out.println("���ѧ������Ϊ��" + this.fee);
}

@Override
public void getFee(double fee) {
this.fee = fee;
System.out.println("���ѧ��Ϊ��" + this.fee);
}

public boolean Loan(){
if ((this.pay - this.fee) <42000) {
 System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
 return true;
}
System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee +",��ȥ"+ 42000 + ",��" + 0.03 + "����" + (this.pay - this.fee - 3500)*0.03);
return false;
}
public static void main(String[] args) {
	  Graduate graduate = new Graduate();
	  graduate.name = "��һ��";
	  System.out.println("���:" + graduate.name);
	  
	  try (
	  Scanner input = new Scanner(System.in)) {
	   System.out.println("����������¹��ʣ�");
	   double pay = input.nextDouble();
	   graduate.setPay(pay);
	   System.out.println("���������ѧ�ѣ�");
	   double fee = input.nextDouble();
	   graduate.setFee(fee);
	      input.close();
	  }
	  boolean flag = graduate.Loan();
	  if (flag) {
	   System.out.println("(������˰)");
	  }else {
	   System.out.println("����Ҫ��˰");
	  }
	 }
    }