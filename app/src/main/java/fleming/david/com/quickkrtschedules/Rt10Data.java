package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt10Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        if ("Monday-Friday".equals(mDay)) {
            switch (mDirection) {
                case "Outbound":
                    switch (mTimepoint) {
                        case "Laidley Transit Mall":
                            mTimesList.add("6:30 a.m.");
                            mTimesList.add("7:30 a.m.");
                            mTimesList.add("12:00 p.m.");
                            mTimesList.add("4:30 p.m.");
                            mTimesList.add("5:30 p.m.");
                            break;
                        case "Greenbrier at Washington":
                            mTimesList.add("6:40 a.m.");
                            mTimesList.add("7:40 a.m.");
                            mTimesList.add("12:10 p.m.");
                            mTimesList.add("4:40 p.m.");
                            mTimesList.add("5:40 p.m.");
                            break;
                        case "YMCA":
                            mTimesList.add("6:47 a.m.");
                            mTimesList.add("7:47 a.m.");
                            mTimesList.add("12:17 p.m.");
                            mTimesList.add("4:47 p.m.");
                            mTimesList.add("5:47 p.m.");
                            break;
                        case "Hillcrest Apartments":
                            mTimesList.add("6:52 a.m.");
                            mTimesList.add("7:52 a.m.");
                            mTimesList.add("12:22 p.m.");
                            mTimesList.add("4:52 p.m.");
                            mTimesList.add("5:52 p.m.");
                            break;
                        case "Northgate Business Park":
                            mTimesList.add("7:05 a.m.");
                            mTimesList.add("8:05 a.m.");
                            mTimesList.add("12:35 p.m.");
                            mTimesList.add("5:05 p.m.");
                            mTimesList.add("6:05 p.m.");
                            break;
                    }
                    break;
                case "Inbound":
                    switch (mTimepoint) {
                        case "Northgate Business Park":
                            mTimesList.add("7:05 a.m.");
                            mTimesList.add("8:05 a.m.");
                            mTimesList.add("12:35 p.m.");
                            mTimesList.add("5:05 p.m.");
                            mTimesList.add("6:05 p.m.");
                            break;
                        case "Greenbrier at Washington":
                            mTimesList.add("7:15 a.m.");
                            mTimesList.add("8:15 a.m.");
                            mTimesList.add("12:45 p.m.");
                            mTimesList.add("5:15 p.m.");
                            mTimesList.add("6:15 p.m.");
                            break;
                        case "Laidley Transit Mall":
                            mTimesList.add("7:30 a.m.");
                            mTimesList.add("8:30 a.m.");
                            mTimesList.add("1:00 p.m.");
                            mTimesList.add("5:30 p.m.");
                            mTimesList.add("6:30 p.m.");
                            break;
                    }
                    break;
            }
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i);

        return mTimes;
    }

}
