package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class DailySchedule
{
    private ArrayList <Appointment> apptList;

    public DailySchedule(Appointment appointments1, Appointment appointment2, Appointment appointment1, Appointment appointment, Appointment appointments)
    {
        apptList = new ArrayList<>(Arrays.asList(appointments));
    }

    public ArrayList<Appointment> getApptList()
    {
        return apptList;
    }

    public void clearConflicts(Appointment appt)
    {
        for(int i = 0; i < apptList.size(); i++)
        {
            if(apptList.get(i).conflictsWith(appt))
                apptList.remove(i);
        }
    }

    public boolean addAppt(Appointment appt, boolean emergency)
    {
        if (emergency)
            clearConflicts(appt);
        else
        {
            for (Appointment a : this.apptList)
            {
                if (a.conflictsWith(appt))
                    return false;
            }
        }
        this.apptList.add(appt);
        return true;
    }
}
