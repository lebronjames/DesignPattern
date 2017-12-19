package command;

/**
 * 
* 请求者(Invoker)角色：负责调用命令对象执行请求，相关的方法叫做行动方法。
 */
public class Invoker {

	//持有命令对象
	private Command command = null;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action() {
		command.execute();
	}
}
