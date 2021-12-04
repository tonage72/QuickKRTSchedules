package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt23Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                break;
                            case "Lilly St":
                                mTimesList.add("5:39 a.m.");
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("3:24 p.m.");
                                mTimesList.add("5:24 p.m.");
                                mTimesList.add("7:24 p.m.");
                                mTimesList.add("9:29 p.m.");
                                break;
                            case "Dutch Rd":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                break;
                            case "Coopers Creek":
                                mTimesList.add("5:49 a.m.");
                                mTimesList.add("7:49 a.m.");
                                mTimesList.add("9:49 a.m.");
                                mTimesList.add("11:49 a.m.");
                                mTimesList.add("3:34 p.m.");
                                mTimesList.add("5:34 p.m.");
                                mTimesList.add("7:34 p.m.");
                                mTimesList.add("9:39 p.m.");
                                break;
                            case "Frame Rd to Crossings Mall":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("7:42 p.m.");
                                mTimesList.add("9:47 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("6:02 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("10:02 a.m.");
                                mTimesList.add("12:02 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("9:52 p.m.");
                                break;
                            case "Frame Rd from Crossings Mall":
                                mTimesList.add("6:07 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("3:52 p.m.");
                                mTimesList.add("5:52 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("9:57 p.m.");
                                break;
                            case "Jordan Creek":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("10:05 p.m.");
                                break;
                            case "Clendenin":
                                mTimesList.add("6:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("12:24 p.m.");
                                mTimesList.add("4:09 p.m.");
                                mTimesList.add("6:09 p.m.");
                                mTimesList.add("8:09 p.m.");
                                mTimesList.add("10:14 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Clendenin":
                                mTimesList.add("6:36 a.m.");
                                mTimesList.add("8:36 a.m.");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("4:21 p.m.");
                                mTimesList.add("6:21 p.m.");
                                mTimesList.add("8:21 p.m.");
                                mTimesList.add("10:21 p.m.");
                                break;
                            case "Jordan Creek":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("8:30 p.m.");
                                mTimesList.add("10:30 p.m.");
                                break;
                            case "Frame Rd to Crossings Mall":
                                mTimesList.add("6:53 a.m.");
                                mTimesList.add("8:53 a.m.");
                                mTimesList.add("10:53 a.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("8:38 p.m.");
                                mTimesList.add("10:38 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("6:58 a.m.");
                                mTimesList.add("8:58 a.m.");
                                mTimesList.add("10:58 a.m.");
                                mTimesList.add("12:58 p.m.");
                                mTimesList.add("4:43 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("8:43 p.m.");
                                mTimesList.add("10:43 p.m.");
                                break;
                            case "Frame Rd from Crossings Mall":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:48 p.m.");
                                mTimesList.add("10:48 p.m.");
                                break;
                            case "Coopers Creek":
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("9:11 a.m.");
                                mTimesList.add("11:11 a.m.");
                                mTimesList.add("1:11 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("6:56 p.m.");
                                mTimesList.add("8:56 p.m.");
                                mTimesList.add("10:56 p.m.");
                                break;
                            case "Dutch Rd":
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("11:18 a.m.");
                                mTimesList.add("1:18 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                break;
                            case "Lilly St":
                                mTimesList.add("7:21 a.m.");
                                mTimesList.add("9:21 a.m.");
                                mTimesList.add("11:21 a.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("7:06 p.m.");
                                mTimesList.add("9:06 p.m.");
                                mTimesList.add("11:06 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
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
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                break;
                            case "Lilly St":
                                mTimesList.add("5:39 a.m.");
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("3:24 p.m.");
                                mTimesList.add("5:24 p.m.");
                                mTimesList.add("7:24 p.m.");
                                mTimesList.add("9:29 p.m.");
                                break;
                            case "Dutch Rd":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                break;
                            case "Coopers Creek":
                                mTimesList.add("5:49 a.m.");
                                mTimesList.add("7:49 a.m.");
                                mTimesList.add("9:49 a.m.");
                                mTimesList.add("11:49 a.m.");
                                mTimesList.add("3:34 p.m.");
                                mTimesList.add("5:34 p.m.");
                                mTimesList.add("7:34 p.m.");
                                mTimesList.add("9:39 p.m.");
                                break;
                            case "Frame Rd to Crossings Mall":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("7:42 p.m.");
                                mTimesList.add("9:47 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("6:02 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("10:02 a.m.");
                                mTimesList.add("12:02 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("9:52 p.m.");
                                break;
                            case "Frame Rd from Crossings Mall":
                                mTimesList.add("6:07 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("3:52 p.m.");
                                mTimesList.add("5:52 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("9:57 p.m.");
                                break;
                            case "Jordan Creek":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("10:05 p.m.");
                                break;
                            case "Clendenin":
                                mTimesList.add("6:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("12:24 p.m.");
                                mTimesList.add("4:09 p.m.");
                                mTimesList.add("6:09 p.m.");
                                mTimesList.add("8:09 p.m.");
                                mTimesList.add("10:14 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Clendenin":
                                mTimesList.add("6:36 a.m.");
                                mTimesList.add("8:36 a.m.");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("4:21 p.m.");
                                mTimesList.add("6:21 p.m.");
                                mTimesList.add("8:21 p.m.");
                                mTimesList.add("10:21 p.m.");
                                break;
                            case "Jordan Creek":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("8:30 p.m.");
                                mTimesList.add("10:30 p.m.");
                                break;
                            case "Frame Rd to Crossings Mall":
                                mTimesList.add("6:53 a.m.");
                                mTimesList.add("8:53 a.m.");
                                mTimesList.add("10:53 a.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("8:38 p.m.");
                                mTimesList.add("10:38 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("6:58 a.m.");
                                mTimesList.add("8:58 a.m.");
                                mTimesList.add("10:58 a.m.");
                                mTimesList.add("12:58 p.m.");
                                mTimesList.add("4:43 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("8:43 p.m.");
                                mTimesList.add("10:43 p.m.");
                                break;
                            case "Frame Rd from Crossings Mall":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:48 p.m.");
                                mTimesList.add("10:48 p.m.");
                                break;
                            case "Coopers Creek":
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("9:11 a.m.");
                                mTimesList.add("11:11 a.m.");
                                mTimesList.add("1:11 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("6:56 p.m.");
                                mTimesList.add("8:56 p.m.");
                                mTimesList.add("10:56 p.m.");
                                break;
                            case "Dutch Rd":
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("11:18 a.m.");
                                mTimesList.add("1:18 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                break;
                            case "Lilly St":
                                mTimesList.add("7:21 a.m.");
                                mTimesList.add("9:21 a.m.");
                                mTimesList.add("11:21 a.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("7:06 p.m.");
                                mTimesList.add("9:06 p.m.");
                                mTimesList.add("11:06 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
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
