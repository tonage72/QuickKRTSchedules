package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt11Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:10 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Piedmont at Morris":
                                mTimesList.add("-");
                                mTimesList.add("7:06 a.m.");
                                mTimesList.add("8:06 a.m.");
                                mTimesList.add("9:06 a.m.");
                                mTimesList.add("11:21 a.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("3:36 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("5:36 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:18 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                break;
                            case "Oakridge at Serene":
                                mTimesList.add("6:28 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("11:40 a.m.");
                                mTimesList.add("1:40 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Oakridge at Serene":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("11:52 a.m.");
                                mTimesList.add("1:52 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("6:07 p.m.");
                                break;
                            case "Piedmont at Morris":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:10 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Piedmont at Morris":
                                mTimesList.add("-");
                                mTimesList.add("7:06 a.m.");
                                mTimesList.add("8:06 a.m.");
                                mTimesList.add("9:06 a.m.");
                                mTimesList.add("11:21 a.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("3:36 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("5:36 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:18 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                break;
                            case "Oakridge at Serene":
                                mTimesList.add("6:28 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("11:40 a.m.");
                                mTimesList.add("1:40 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Oakridge at Serene":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("11:52 a.m.");
                                mTimesList.add("1:52 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("6:07 p.m.");
                                break;
                            case "Piedmont at Morris":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i);

        return mTimes;
    }

}
