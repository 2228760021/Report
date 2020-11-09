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
  System.out.println("你的年收入为：" + this.pay);
 }
 
 @Override
 public void getPay(double pay) {
  this.pay = pay * 12;
  System.out.println("你的月收入为：" + this.pay);
 }
@Override
public void setFee(double fee) {
this.fee = fee;
System.out.println("你的学费设置为：" + this.fee);
}

@Override
public void getFee(double fee) {
this.fee = fee;
System.out.println("你的学费为：" + this.fee);
}

public boolean Loan(){
if ((this.pay - this.fee) <42000) {
 System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
 return true;
}
System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee +",减去"+ 42000 + ",乘" + 0.03 + "等于" + (this.pay - this.fee - 3500)*0.03);
return false;
}
public static void main(String[] args) {
	  Graduate graduate = new Graduate();
	  graduate.name = "张一川";
	  System.out.println("你好:" + graduate.name);
	  
	  try (
	  Scanner input = new Scanner(System.in)) {
	   System.out.println("请输入你的月工资：");
	   double pay = input.nextDouble();
	   graduate.setPay(pay);
	   System.out.println("请输入你的学费：");
	   double fee = input.nextDouble();
	   graduate.setFee(fee);
	      input.close();
	  }
	  boolean flag = graduate.Loan();
	  if (flag) {
	   System.out.println("(无需纳税)");
	  }else {
	   System.out.println("你需要纳税");
	  }
	 }
    }