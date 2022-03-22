package com.gtxc.practice.lcw;

/*
    Created by gt at 1:47 AM on Wednesday, March 23, 2022.
    Project: practice, Package: com.gtxc.practice.lcw.
*/

public class TimeDiff {

    public static void main(String[] args) {

        System.out.println(StringChallenge("12:30pm-15:32am"));

    }


    public static String StringChallenge(String str) {
        // code goes here
        String[] strArr = str.split("-");
        String[] hour1 = strArr[0].split(":");
        String[] hour2 = strArr[1].split(":");
        Clock c1 = new Clock(Integer.parseInt(hour1[0]), Integer.parseInt(hour1[1].substring(0, 2)), hour1[1].substring(2));
        Clock c2 = new Clock(Integer.parseInt(hour2[0]), Integer.parseInt(hour2[1].substring(0, 2)), hour2[1].substring(2));
        return String.valueOf(c1.diffInMinutes(c2));
    }

    static class Clock {
        private int hour;
        private int minute;
        private String tag;

        public Clock(int hour, int minute, String tag) {
            this.hour = hour;
            this.minute = minute;
            this.tag = tag;
        }

        public int getHour() {
            return this.hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public int getMinute() {
            return this.minute;
        }

        public String getTag() {
            return this.tag;
        }

        public int diffInMinutes(Clock c) {
            Clock c1 = convertTo24(this);
            Clock c2 = convertTo24(c);
            int diff = 60 * (c2.getHour() - c1.getHour()) + (c2.getMinute() - c1.getMinute());
            if (diff < 0) {
                diff += (24 * 60);
            }
            return diff;
        }

        public Clock convertTo24(Clock c) {
            int hour = c.getHour();
            int minute = c.getMinute();
            String tag = c.getTag();
            if (c.getTag().equals("am") && c.getHour() == 12) {
                hour = 0;
            } else if (c.getTag().equals("pm") && c.getHour() != 12) {
                hour += 12;
            }
            return new Clock(hour, minute, tag);
        }
    }
}
