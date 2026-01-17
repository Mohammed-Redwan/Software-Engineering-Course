/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;
import java.util.Date;

public class Appointment {
    int appointmentId;
    Date appointmentDate;
    Time appointmentTime;
    String status;
    Patient patient;
    Doctor doctor;
    public void scheduleAppointment(){}
    public void cancelAppointment(){}
    public String getAppointmentDetails()
    {
        return null;
    }
}
