package todaylive;

public class AgeNotValidExecption extends Excption {
	private String msg;

	public AgeNotValidExecption(String msg) {
		 
		this.msg = msg;
		
	}

	@Override
	public String toString() {
		return "AgeNotValidExecption [message=" + msg + "]";
	}

}
