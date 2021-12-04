package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt6Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:25 p.m.");
                                break;
                            case "Greenbrier St at Washington St":
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("5:35 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("-");
                                mTimesList.add("8:49 a.m.");
                                mTimesList.add("2:19 p.m.");
                                mTimesList.add("4:04 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Capital High School":
                                mTimesList.add("7:19 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                            case "Quick Road":
                                mTimesList.add("7:31 a.m.");
                                mTimesList.add("9:09 a.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("4:24 p.m.");
                                mTimesList.add("5:55 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("7:43 a.m.");
                                mTimesList.add("9:21 a.m.");
                                mTimesList.add("2:51 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("6:05 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Crossings Mall":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:46 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("4:39 p.m.");
                                break;
                            case "Quick Road":
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("7:58 a.m.");
                                mTimesList.add("9:36 a.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("4:51 p.m.");
                                break;
                            case "Capital High School":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("3:18 p.m.");
                                mTimesList.add("5:03 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("9:56 a.m.");
                                mTimesList.add("3:26 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Greenbrier St at Washington St":
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("8:19 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("5:12 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:58 a.m.");
                                mTimesList.add("8:29 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:22 p.m.");
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
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Greenbrier St at Washington St":
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("5:40 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("7:49 a.m.");
                                mTimesList.add("9:34 a.m.");
                                mTimesList.add("2:19 p.m.");
                                mTimesList.add("4:04 p.m.");
                                mTimesList.add("5:49 p.m.");
                                break;
                            case "Capital High School":
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:57 p.m.");
                                break;
                            case "Quick Road":
                                mTimesList.add("8:09 a.m.");
                                mTimesList.add("9:54 a.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("4:24 p.m.");
                                mTimesList.add("6:09 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("8:21 a.m.");
                                mTimesList.add("10:06 a.m.");
                                mTimesList.add("2:51 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("6:21 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Crossings Mall":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("10:09 a.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("4:39 p.m.");
                                break;
                            case "Quick Road":
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("8:36 a.m.");
                                mTimesList.add("10:21 a.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("4:51 p.m.");
                                break;
                            case "Capital High School":
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("3:18 p.m.");
                                mTimesList.add("5:03 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("8:56 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:26 p.m.");
                                mTimesList.add("5:11 p.m.");
                                break;
                            case "Greenbrier St at Washington St":
                                mTimesList.add("7:16 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("10:43 a.m.");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:26 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:30 p.m.");
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
