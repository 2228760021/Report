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
