package com.example.virtualpiano;

public class myTime {
    private int hour;
    private int minute;
    private int second;
    public myTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public myTime(String currentTime)
    {
        String[] stime = currentTime.split(":");
        hour = Integer.parseInt(stime[0]);
        minute = Integer.parseInt(stime[1]);
        second = Integer.parseInt(stime[2]);
    }
    public String getCurrentTime()
    {
        return hour + ":" + minute + ":" + second;
    }
    public void oneSecondPassed()
    {
        second++;
        if(second == 60)
        {
            minute++;
            second = 0;
            if(minute == 60)
            {
                hour++;
                minute = 0;
            }
        }
    }
    public void reset()
    {
        hour = 0;
        minute = 0;
        second = 0;
    }

}
