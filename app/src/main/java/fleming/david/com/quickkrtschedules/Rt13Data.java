package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt13Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "McQueen at Beech":
                                mTimesList.add("7:14 a.m.");
                                mTimesList.add("8:14 a.m.");
                                mTimesList.add("9:14 a.m.");
                                mTimesList.add("10:14 a.m.");
                                mTimesList.add("11:14 a.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:44 p.m.");
                                mTimesList.add("5:44 p.m.");
                                break;
                            case "Patrick Street Plaza":
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("11:24 a.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("1:54 p.m.");
                                mTimesList.add("3:54 p.m.");
                                mTimesList.add("4:54 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "McQueen at Beech":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
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
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "McQueen at Beech":
                                mTimesList.add("7:14 a.m.");
                                mTimesList.add("8:14 a.m.");
                                mTimesList.add("9:14 a.m.");
                                mTimesList.add("10:14 a.m.");
                                mTimesList.add("11:14 a.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:44 p.m.");
                                mTimesList.add("5:44 p.m.");
                                break;
                            case "Patrick Street Plaza":
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("11:24 a.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("1:54 p.m.");
                                mTimesList.add("3:54 p.m.");
                                mTimesList.add("4:54 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "McQueen at Beech":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
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
