package Lesson2DzDop;

public enum DayOfWeek {
    SUNDAY(7,0), MONDAY(1,0), TUESDAY(2,8), WEDNESDAY(3,8),
    THURSDAY(4,8), FRIDAY(5,8), SATURDAY(6,0);

    private final int  dayNumber;
    private final int workingHours;

    DayOfWeek(int dayNumber, int workingHours) {
        this.dayNumber = dayNumber;
        this.workingHours = workingHours;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }

    public int getWorkingHours() {
        return this.workingHours;
    }

    static DayOfWeek convertIntoDay(int number) {
        for (DayOfWeek day: values())
            if (day.dayNumber == number)
                return day;
        return null;
    }
}
