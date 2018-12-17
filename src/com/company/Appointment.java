package com.company;

public class Appointment
{
    private TimeInterval time;

    public TimeInterval getTime()
    {
        this.time = time;
    }

    public boolean conflictsWith(Appointment other)
    {
        if(getTime() == other)
            return true;
        else
            return false;
    }
}
