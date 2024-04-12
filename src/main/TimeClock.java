package main;

public class TimeClock {
    public static void main(String[] args) {
        double minuteDegree = 0;
        double hourDegree = 0;
        double degree = 0;
        double finalDegree = 170;

        int second;
        int minute;
        int hour;

        int finalSecond = 0;
        int finalMinute = 0;
        int finalHour = 0;

        for (int a = 0; a < 12; a++) {
            for (int b = 0; b < 60; b++) {
                for (int c = 0; c < 60; c++) {
                    second = c;
                    minute = b;
                    hour = a;
                    minuteDegree = (minute * 6) + (second * 0.1);
                    hourDegree = (second * 0.0083) + (minute * 0.5) + ((hour % 12) * 30);
                    degree = Math.abs(hourDegree - minuteDegree);
                    if (170<degree && degree<180) {
                        if(finalDegree<degree){
                            finalDegree=degree;
                            finalHour=a;
                            finalMinute=b;
                            finalSecond=c;
                        }

                    }
                }
            }
        }
        System.out
                .println("최고 각도는 " + finalHour + "시 " + finalMinute + "분 " + finalSecond + "초 , " + finalDegree + "도");
    }
}
