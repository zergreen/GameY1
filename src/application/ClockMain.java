package timer;

import java.util.Date;

class Clock {
//    class Clock {
        private int hour;
        private int minute;
        private int second;

        public Clock() {
            Date now = new Date();
            hour = now.getHours();
            minute = now.getMinutes();
            second = now.getSeconds();
        }

        // public void plusSecond() {
        //     second++;
        //     if (this.second == 60) {
        //         this.minute++;
        //         this.second = 0;
        //         if (this.minute == 60) {
        //             this.hour++;
        //             this.minute = 0;
        //         }
        //     }
        // }

        public void plusSecond() {
            second++;
            if (second == 60) {
                minute++;
                second = 0;
            }
            if (minute == 60) {
                hour++;
                minute = 0;
            }
        }


        // public void display() {
        // System.out.print(hour + ":" + minute + ":" + second);
        // }
        public String display(){
            return hour + ":" + minute + ":" + second;
        }
    }

public class ClockMain{
    public static void main(String[] args) throws Exception {
        Clock t = new Clock();
        while (true) {
            System.out.println(t.display());
            Thread.sleep(1000);
            t.plusSecond();
        }
    }
}

