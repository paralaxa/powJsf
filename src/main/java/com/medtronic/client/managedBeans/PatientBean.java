package com.medtronic.client.managedBeans;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by myPC on 26. 3. 2016.
 */

@ManagedBean(name="patient")
public class PatientBean implements Serializable {
    private List<Patient> patients;

    @PostConstruct
    public void prepareMockData() {
        patients = new ArrayList();
        Patient p1 = new Patient();
        p1.setId(4897328473l);
        p1.setFirstName("firstName1");
        p1.setSurName("surName1");
        p1.setAge(12);
        p1.setType(PatientType.M);

        Patient p2 = new Patient();
        p2.setId(4897328473l);
        p2.setFirstName("firstNamekfdjgfd1");
        p2.setSurName("surNamefsdf1");
        p2.setAge(17);
        p2.setType(PatientType.P);

        Patient p3 = new Patient();
        p3.setId(4897328473l);
        p3.setFirstName("firfdsstName1");
        p3.setSurName("surNamfdse1");
        p3.setAge(19);
        p3.setType(PatientType.M);

        Patient p4 = new Patient();
        p4.setId(485497328473l);
        p4.setFirstName("firstNamefdf1");
        p4.setSurName("surNamsdfe1");
        p4.setAge(21);
        p4.setType(PatientType.P);

        Patient p5 = new Patient();
        p5.setId(4854397328473l);
        p5.setFirstName("ffgfdirstName1");
        p5.setSurName("surNagfdhme1");
        p5.setAge(22);
        p5.setType(PatientType.M);

        patients.add(p1);
        patients.add(p2);
        patients.add(p3);
        patients.add(p4);
        patients.add(p5);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
