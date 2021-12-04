package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt20Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("6:43 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:16 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:16 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:16 a.m.");
                                mTimesList.add("9:41 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("9:55 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:51 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("9:53 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("11:57 p.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:02 p.m.");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("4:14 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:14 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("6:02 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("8:07 p.m.");
                                mTimesList.add("9:07 p.m.");
                                mTimesList.add("10:07 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("7:29 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("8:29 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("9:29 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:59 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:19 a.m.");
                                mTimesList.add("11:59 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:19 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:09 p.m.");
                                mTimesList.add("1:19 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:06 p.m.");
                                mTimesList.add("2:09 p.m.");
                                mTimesList.add("2:19 p.m.");
                                mTimesList.add("3:09 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:19 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:09 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:19 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("5:09 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:49 p.m.");
                                mTimesList.add("6:04 p.m.");
                                mTimesList.add("6:09 p.m.");
                                mTimesList.add("7:09 p.m.");
                                mTimesList.add("8:09 p.m.");
                                mTimesList.add("9:09 p.m.");
                                mTimesList.add("10:09 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:06 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("4:26 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("5:16 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("5:26 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("10:20 p.m.");
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
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:45 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:25 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:35 a.m.");
                                mTimesList.add("6:41 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("7:24 p.m.");
                                mTimesList.add("9:24 p.m.");
                                mTimesList.add("11:24 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:52 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("3:16 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("11:00 p.m.");
                                mTimesList.add("12:23 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:35 a.m.");
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
