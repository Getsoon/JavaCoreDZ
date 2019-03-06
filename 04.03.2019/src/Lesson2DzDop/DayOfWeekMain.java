package Lesson2DzDop;

import java.util.Calendar;
import java.util.Date;

public class DayOfWeekMain {
    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        DayOfWeek today = DayOfWeek.convertIntoDay(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Сколько часов до конца рабочей недели:" + getWorkingHours(today));
    }

    private static int getWorkingHours(final DayOfWeek currentDay) {
        int hours = 0;
        if ( currentDay != DayOfWeek.SUNDAY){
            for (DayOfWeek day: DayOfWeek.values()){
                if(day.getDayNumber() >= currentDay.getDayNumber()){
                    hours+=day.getWorkingHours();
                }
            }
        }
        return hours;
    }
}
