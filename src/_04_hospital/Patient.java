package _04_hospital;

public class Patient {
public boolean caredFor = false;
	public Object feelsCaredFor() {
		if(caredFor) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		caredFor = true;
	}

}
