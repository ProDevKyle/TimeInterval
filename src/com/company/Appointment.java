package com.company;

public class Appointment
{
    private TimeInterval timeInterval;

    public Appointment(int start, int end)
    {
        this.timeInterval = new TimeInterval(start, end);
    }

    public TimeInterval getTime()
    {
        return this.timeInterval;
    }

    public boolean conflictsWith(Appointment other)
    {
        return this.getTime().overlapsWith(other.getTime());
    }

    public String toString()
    {
        return this.timeInterval.toString();
    }
}
