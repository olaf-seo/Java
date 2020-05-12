package chapter3.section1;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	
	public double computerPower() {
		return ramSize * processorSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	
	@Override
	public String toString() {
		String result = "Manufacturer: " + manufacturer +
						"\nCPU: " + processor +
						"\nRam: " + ramSize + 
						"\nDisk: " + diskSize +
						"\nProcessor speed: " + processorSpeed + "gigahertz";
		return result;
	}
	
	
}
