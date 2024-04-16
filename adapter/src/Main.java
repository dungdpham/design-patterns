public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter calendarAdapter = new CalendarToNewDateAdapter();

        System.out.println("Today: " + calendarAdapter.getDay() + "." + calendarAdapter.getMonth() +
                "." + calendarAdapter.getYear());

        calendarAdapter.setDay(4);
        calendarAdapter.setMonth(1);
        calendarAdapter.setYear(2025);
        System.out.println("Calendar set to: " + calendarAdapter.getDay() + "." + calendarAdapter.getMonth() +
                "." + calendarAdapter.getYear());

        calendarAdapter.advanceDays(-5);
        System.out.println("Go back 5 days: " + calendarAdapter.getDay() + "." + calendarAdapter.getMonth() +
                "." + calendarAdapter.getYear());
    }
}
