package objectPractice;

public class Time {
    int hour;
    int mins;
    int secs;

    Time() { // default constructor sets time to 00:00:00
        hour = 0;
        mins = 0;
        secs = 0;

    }

    Time(int h, int m, int s) {
        hour = h;
        mins = m;
        secs = s;
    }

    void setHour(int m) {
        hour = m;
    }

    void setMinute(int h) {
        mins = h;
    }

    void setSecond(int h) {
        secs = h;
    }

    int getHour() {
        return hour;
    }

    int getMinute() {
        return mins;
    }

    int getSecond() {
        return secs;
    }

    void Display() {
        System.out.println(hour + ":" + mins + ":" + secs);
    }
    void DisplayAM(){System.out.println(hour +":"+mins+":"+secs);}

    void increment() {
        secs++;
        if (secs == 60) {
            mins++;
            secs = 0;
            if (mins == 60) {
                hour++;
                mins = 0;
                if (hour == 24) hour = 0;
            }
        }
    }

    boolean EqualTo(Time t) {
        if (hour == t.hour && mins == t.mins && secs == t.secs)
            return true;
        else return false;
    }

    boolean Greater(Time t) {
        if (hour > t.hour || (hour == t.hour && mins > t.mins) || (hour == t.hour && mins == t.mins && secs == t.secs))
            return true;
        else return false;
    }
}

