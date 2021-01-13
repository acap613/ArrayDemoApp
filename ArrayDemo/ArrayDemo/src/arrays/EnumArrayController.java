package arrays;

import util.ArrayEnum;

public class EnumArrayController {
	
	private ArrayEnum type;
	
	private Object[] arrs;

	public EnumArrayController(ArrayEnum type, int size) {
		super();
		this.type = type;		
		
		switch(type) {
		
			case INTEGER:
				arrs = new Integer[size];
				break;
			case DOUBLE:
				arrs = new Double[size];
				break;
			case STRING:
				arrs = new String[size];
				break;
			default:
				break;
		}
		
	}	
	
	public Object[] getArray() {
		return arrs;
	}

}
