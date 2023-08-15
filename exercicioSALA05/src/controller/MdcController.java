package controller;

public class MdcController {

	public MdcController() {
		super();
	}
	public int MDC(int a, int b){
		if (a < b) {
			return MDC(a, b);
		} else 
			if (a %b == 0)  
				return b;
			else
				return MDC(a, a%b);
		}
	}

