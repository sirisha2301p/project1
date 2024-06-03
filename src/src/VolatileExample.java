
public class VolatileExample {
	
	    private volatile boolean flag = false;

	    public void setFlag() {
	        flag = true;
	    }

	    public boolean isFlagSet() {
	        return flag;
	    }
	}

