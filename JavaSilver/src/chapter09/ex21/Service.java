package chapter09.ex21;

public class Service {
	private Algorithm logic;
	public void setLogic(Algorithm logic) {
		this.logic = logic;
	}
	public void doProcess(String name) {
		System.out.println("Start");
		this.logic.perform(name);
		System.out.println("end");
	}

}
