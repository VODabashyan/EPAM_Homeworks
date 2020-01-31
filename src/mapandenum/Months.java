package mapandenum;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Months {
    JANUARY(31, 8, new HashMap<Integer, String>() {
        {
            put(1, "New Year Holiday");
            put(2, "New Year Holiday");
            put(3, "New Year Holiday");
            put(4, "New Year Holiday");
            put(5, "New Year Holiday");
            put(6, "Armenian Christmas Holiday");
            put(7, "New Year Holiday");
            put(28, "National Army Day");
        }
    }),
    FEBRUARY(29, 0, null),
    MARCH(31, 1, new HashMap<Integer, String>() {
        {
            put(8, "International Women's Day");
        }
    }),
    APRIL(30, 2, new HashMap<Integer, String>() {
        {
            put(13, "Easter Monday");
            put(24, "Armenian Genocide Remembrance Day");
        }
    }),
    MAY(31, 3, new HashMap<Integer, String>() {
        {
            put(1, "Labour Day");
            put(9, "Victory and Peace Day");
            put(28, "1st Republic Day");
        }
    }),
    JUNE(30, 0, null),
    JULY(31, 1, new HashMap<Integer, String>() {
        {
            put(5, "Constitution Day");
        }
    }),
    AUGUST(31, 0, null),
    SEPTEMBER(30, 1, new HashMap<Integer, String>() {
        {
            put(21, "Independence Day");
        }
    }),
    OCTOBER(31, 0, null),
    NOVEMBER(30, 0, null),
    DECEMBER(31, 1, new HashMap<Integer, String>() {
        {
            put(31, "New Year's Eve");
        }
    });

    private int numberOfDays;
    private int numberOfHolidays;
    private HashMap<Integer, String> holidays;

    Months(int numberOfDays, int numberOfHolidays, HashMap<Integer, String> holidays) {
        this.numberOfDays = numberOfDays;
        this.numberOfHolidays = numberOfHolidays;
        this.holidays = holidays;
    }

    static void printHolidays(Months month) {
        System.out.println("--Holidays in " + month + "--");
        for (Map.Entry<Integer, String> entry : month.holidays.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(month.toString() + " " + key + " - " + value);
        }
        System.out.println();
    }

    static String getDayCount(Months month) {
        return "There are " + month.numberOfDays + " days in " + month + "\n";
    }

    static void printMonths() {
        System.out.println("--The list of months--");
        for (Months month : EnumSet.allOf(Months.class)) {
            System.out.println(month);
        }
    }

    static void checkPublicHoliday(Months month, int day) {
        if(month.holidays != null) {
            for (Integer d : month.holidays.keySet()) {
                if (d.equals(day)) {
                    System.out.println(month.toString() + " " + day + " is " + month.holidays.get(day));
                } else {
                    System.out.println(month.toString() + " " + day + " is not a holiday.");
                }
            }
        } else {
            System.out.println("No holidays in " + month.toString());
        }
    }
}
