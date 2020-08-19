package _04_hospital;

import java.util.ArrayList;

public class Doctor {
ArrayList<Patient> doctorsPatients = new ArrayList<Patient>();
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (doctorsPatients.size() >= 3) {
			throw new DoctorFullException();
		}
		doctorsPatients.add(patient);

	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return doctorsPatients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < doctorsPatients.size(); i++) {
			doctorsPatients.get(i).caredFor = true;
		}
	}

}
