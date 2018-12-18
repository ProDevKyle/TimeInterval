package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        DailySchedule dailySchedule = new DailySchedule(new Appointment(1, 2), new Appointment(2, 3), new Appointment(3, 4), new Appointment(4, 5), new Appointment(5, 6));
        System.out.println(dailySchedule.getApptList());
        System.out.println(dailySchedule.addAppt(new Appointment(6, 7), false));
        System.out.println(dailySchedule.getApptList());
        System.out.println(dailySchedule.addAppt(new Appointment(1, 3), false));
        System.out.println(dailySchedule.getApptList());
        System.out.println(dailySchedule.addAppt(new Appointment(2, 5), true));
        System.out.println(dailySchedule.getApptList());
    }
}
