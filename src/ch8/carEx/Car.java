package ch8.carEx;

public abstract class Car {

	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	public abstract void wash();
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
		wash();
	}
}
