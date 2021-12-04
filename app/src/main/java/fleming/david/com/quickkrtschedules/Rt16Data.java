package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt16Data {

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
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                break;
                            case "Alcoa Dr/South Park":
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("12:43 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("3:58 p.m.");
                                mTimesList.add("4:58 p.m.");
                                mTimesList.add("5:58 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Alcoa Dr/South Park":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
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
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                break;
                            case "Alcoa Dr/South Park":
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("12:43 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("3:58 p.m.");
                                mTimesList.add("4:58 p.m.");
                                mTimesList.add("5:58 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Alcoa Dr/South Park":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
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
