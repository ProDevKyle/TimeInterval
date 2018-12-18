package com.company;

public class TimeInterval
{
    private int start, end;

    public TimeInterval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public boolean overlapsWith(TimeInterval interval)
    {
        return (this.start <= interval.start && interval.start < this.end) || (this.start < interval.end && interval.end <= this.end) || (interval.start <= this.start && this.start < interval.end) || (interval.start < this.end && this.end <= interval.end);
    }

    public String toString()
    {
        return this.start + "–" + this.end;
    }
}
