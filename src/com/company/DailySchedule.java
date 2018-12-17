package com.company;

import java.util.ArrayList;

public class DailySchedule
{
    private ArrayList apptList;

    public DailySchedule()
    {
        apptList = new ArrayList();
    }

    public void clearConflicts(Appointment appt)
    {
        for(int i = 0; i < apptList.size(); i++)
        {
            if(apptList.get(i) == appt)
                apptList.remove(apptList.get(i));
        }
    }

    public boolean addAZppt(Appointment appt, boolean emergency)
    {
        if(emergency == true)
        {
            clearConflicts(appt);
            return false;
        }
        else
        {
            apptList.add(appt);
            return true;
        }
    }
}
