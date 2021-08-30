package chapterEight;

public class TimeOne {

    private int hour;
    private int minute;
    private int seconds;

    public void setTime(int hour, int minute, int seconds)
    {
        if(hour < 0 || hour >= 24 || minute < 0 || minute >=60 || seconds < 0 || seconds >= 60)
        {
            throw new IllegalArgumentException("Hour, minute and seconds was out of bound");
        }
        this.hour = hour;
        this.minute = minute;
        this.seconds=seconds;
    }
    public String toUniversalString()
    {
        return String.format("%02d: %02d: %02d:", hour,minute,seconds);
    }
}
