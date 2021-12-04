package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt19Data {

    protected static String[] getTimes19(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                if ("Loop".equals(mDirection)) {
                    switch (mTimepoint) {
                        case "Lee St at Maryland Ave (start route)":
                            mTimesList.add("10:30 a.m.");
                            mTimesList.add("11:30 a.m.");
                            mTimesList.add("12:30 p.m.");
                            mTimesList.add("1:30 p.m.");
                            mTimesList.add("2:30 p.m.\n(To Transit Mall only");
                            mTimesList.add("-");
                            mTimesList.add("4:00 p.m.");
                            mTimesList.add("5:00 p.m.");
                            break;
                        case "Laidley Transit Mall":
                            mTimesList.add("10:36 a.m.");
                            mTimesList.add("11:36 a.m.");
                            mTimesList.add("12:36 p.m.");
                            mTimesList.add("1:36 p.m.");
                            mTimesList.add("2:36 p.m.\n(End of route)");
                            mTimesList.add("3:06 p.m.");
                            mTimesList.add("4:06 p.m.");
                            mTimesList.add("5:06 p.m.");
                            break;
                        case "Capitol Market (eastbound)":
                            mTimesList.add("10:42 a.m.");
                            mTimesList.add("11:42 a.m.");
                            mTimesList.add("12:42 p.m.");
                            mTimesList.add("1:42 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:12 p.m.");
                            mTimesList.add("4:12 p.m.");
                            mTimesList.add("5:12 p.m.");
                            break;
                        case "California Ave at Washington St":
                            mTimesList.add("11:00 a.m.");
                            mTimesList.add("12:00 p.m.");
                            mTimesList.add("1:00 p.m.");
                            mTimesList.add("2:00 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:30 p.m.");
                            mTimesList.add("4:30 p.m.");
                            mTimesList.add("5:30 p.m.");
                            break;
                        case "Quarrier St at Capitol St":
                            mTimesList.add("11:08 a.m.");
                            mTimesList.add("12:08 p.m.");
                            mTimesList.add("1:08 p.m.");
                            mTimesList.add("2:08 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:38 p.m.");
                            mTimesList.add("4:38 p.m.");
                            mTimesList.add("5:38 p.m.");
                            break;
                        case "Capitol Market (westbound)":
                            mTimesList.add("11:12 a.m.");
                            mTimesList.add("12:12 p.m.");
                            mTimesList.add("1:12 p.m.");
                            mTimesList.add("2:12 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:42 p.m.");
                            mTimesList.add("4:42 p.m.");
                            mTimesList.add("5:42 p.m.");
                            break;
                        case "Bigley Ave at Ash St":
                            mTimesList.add("11:20 a.m.");
                            mTimesList.add("12:20 p.m.");
                            mTimesList.add("1:20 p.m.");
                            mTimesList.add("2:20 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:50 p.m.");
                            mTimesList.add("4:50 p.m.");
                            mTimesList.add("5:50 p.m.");
                            break;
                        case "Lee St at Maryland Ave (end route)":
                            mTimesList.add("11:30 a.m.");
                            mTimesList.add("12:30 p.m.");
                            mTimesList.add("1:30 p.m.");
                            mTimesList.add("2:30 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("4:00 p.m.");
                            mTimesList.add("5:00 p.m.");
                            mTimesList.add("6:00 p.m.");
                            break;
                    }
                }
                break;
            case "Saturday":
                if ("Loop".equals(mDirection)) {
                    switch (mTimepoint) {
                        case "Lee St at Maryland Ave (start route)":
                            mTimesList.add("10:30 a.m.");
                            mTimesList.add("11:30 a.m.");
                            mTimesList.add("12:30 p.m.");
                            mTimesList.add("1:30 p.m.");
                            mTimesList.add("2:30 p.m.\n(To Transit Mall only)");
                            mTimesList.add("-");
                            mTimesList.add("4:00 p.m.");
                            mTimesList.add("5:00 p.m.");
                            break;
                        case "Laidley Transit Mall":
                            mTimesList.add("10:36 a.m.");
                            mTimesList.add("11:36 a.m.");
                            mTimesList.add("12:36 p.m.");
                            mTimesList.add("1:36 p.m.");
                            mTimesList.add("2:36 p.m.\n(End of route)");
                            mTimesList.add("3:06 p.m.");
                            mTimesList.add("4:06 p.m.");
                            mTimesList.add("5:06 p.m.");
                            break;
                        case "Capitol Market (eastbound)":
                            mTimesList.add("10:42 a.m.");
                            mTimesList.add("11:42 a.m.");
                            mTimesList.add("12:42 p.m.");
                            mTimesList.add("1:42 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:12 p.m.");
                            mTimesList.add("4:12 p.m.");
                            mTimesList.add("5:12 p.m.");
                            break;
                        case "California Ave at Washington St":
                            mTimesList.add("11:00 a.m.");
                            mTimesList.add("12:00 p.m.");
                            mTimesList.add("1:00 p.m.");
                            mTimesList.add("2:00 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:30 p.m.");
                            mTimesList.add("4:30 p.m.");
                            mTimesList.add("5:30 p.m.");
                            break;
                        case "Quarrier St at Capitol St":
                            mTimesList.add("11:08 a.m.");
                            mTimesList.add("12:08 p.m.");
                            mTimesList.add("1:08 p.m.");
                            mTimesList.add("2:08 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:38 p.m.");
                            mTimesList.add("4:38 p.m.");
                            mTimesList.add("5:38 p.m.");
                            break;
                        case "Capitol Market (westbound)":
                            mTimesList.add("11:12 a.m.");
                            mTimesList.add("12:12 p.m.");
                            mTimesList.add("1:12 p.m.");
                            mTimesList.add("2:12 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:42 p.m.");
                            mTimesList.add("4:42 p.m.");
                            mTimesList.add("5:42 p.m.");
                            break;
                        case "Bigley Ave at Ash St":
                            mTimesList.add("11:20 a.m.");
                            mTimesList.add("12:20 p.m.");
                            mTimesList.add("1:20 p.m.");
                            mTimesList.add("2:20 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("3:50 p.m.");
                            mTimesList.add("4:50 p.m.");
                            mTimesList.add("5:50 p.m.");
                            break;
                        case "Lee St at Maryland Ave (end route)":
                            mTimesList.add("11:30 a.m.");
                            mTimesList.add("12:30 p.m.");
                            mTimesList.add("1:30 p.m.");
                            mTimesList.add("2:30 p.m.");
                            mTimesList.add("-");
                            mTimesList.add("4:00 p.m.");
                            mTimesList.add("5:00 p.m.");
                            mTimesList.add("6:00 p.m.");
                            break;
                    }
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i);

        return mTimes;
    }

}
