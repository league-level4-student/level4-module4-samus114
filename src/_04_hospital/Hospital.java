package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList<Doctor> doctors = new ArrayList<Doctor>();
ArrayList<Patient> patients = new ArrayList<Patient>();
public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
doctors.add(doctor);
	}


	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}


	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}


	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}


	public void assignPatientsToDoctors() {
		int patientsChecked = 0;
		int i = 0;
		// TODO Auto-generated method stub
		while(patientsChecked != 8) {
			for (int j = patientsChecked; j < patients.size(); j++) {
				try {
					doctors.get(i).assignPatient(patients.get(j));
					patientsChecked++;
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					i++;
				}

			}
		}
		
	}

}
