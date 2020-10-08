# Java-
Java课程作业项目仓库

#阅读程序

##实验目的

用类描述计算机中 CPU 的速度和硬盘的容量。要求 Java 应用程序有 4 个类，名字分别 是 PC、CPU、HardDisk 和 Test，其中 Test 是主类。

CPU 类 要求 getSpeed()返回 speed 的值，要求 setSpeed(int m)方法将参数 m 的值 赋值给 speed。 

HardDisk 类 要求 getAmount()返回 amount 的值， 要求 setAmount(int m)方法将 参数 m 的值赋值给 amount。

PC 类 要求 setCPU(CPU c)将参数 c 的值赋值给 cpu，要求 setHardDisk(HardDisk h)方法将参数 h 的值赋值给 HD， 要求 show()方法能显示 cpu 的速度和 硬盘的容量。
 主类 Test 的要求 （1） main 方法中创建一个 CPU 对象 cpu，cpu 将自己的 speed 设置为 2200； 

##实验过程
（1） main 方法中创建一个 CPU 对象 cpu，cpu 将自己的 speed 设置为 2200； 

（2） main 方法中创建一个 HardDisk 对象 disk，disk 将自己的 amount 设置为 200； 

（3） main 方法中创建一个 PC 对象 pc； 

（4） pc 调用 setCPU(CPU c)方法，调用时实参是 cpu； 

（5） pc 调用 setHardDisk(HardDisk h)方法，调用时实参是 disk; 

（6） pc 调用 show()方法。

##实验结果

package CPU;

public class CPU {

public int speed;
public void setSpeed(int m){
speed=m;
}
int getSpeed(){
return speed;
}
}


package HardDisk;

public class HardDisk {
int count;
public String amount;

public void setAmount(int m){
count=m;
}
int getAmount(){
return count;
}
}

package PC;

import CPU.CPU;
import HardDisk.HardDisk;

public class PC {
	CPU cpu;
	HardDisk hd;
	public void setCPU(CPU cpu) {
		this.cpu=cpu;
	}
	public void setHardDisk(HardDisk hd) {
		this.hd=hd;
	}
	public void show() {
		System.out.println("CPU speed"+cpu.speed+"\nHardDisk amount"+hd.amount);
	}
	
 
}


package Test;

import CPU.CPU;
import HardDisk.HardDisk;
import PC.PC;

public class Test {
public static void main(String args[]){
CPU cpu=new CPU();
HardDisk disk=new HardDisk();
PC pc=new PC();
cpu.setSpeed(2200);
disk.setAmount(200);
pc.setCPU(cpu);
pc.setHardDisk(disk);
pc.show();
}
}

##实验感想
初步接触Java，体会到了Java简洁的表达，了解了Java的基本使用方法，在接下来的学习中还要不断提高。
