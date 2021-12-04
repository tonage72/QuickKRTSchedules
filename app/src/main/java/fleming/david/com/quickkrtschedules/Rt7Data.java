package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt7Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        if ("Monday-Friday".equals(mDay)) {
            switch (mDirection) {
                case "Outbound":
                    switch (mTimepoint) {
                        case "Laidley Transit Mall":
                            mTimesList.add("6:45 a.m.");
                            mTimesList.add("8:45 a.m.");
                            mTimesList.add("12:15 p.m.");
                            mTimesList.add("2:45 p.m.");
                            mTimesList.add("5:15 p.m.");
                            break;
                        case "CAMC Memorial":
                            mTimesList.add("6:56 a.m.");
                            mTimesList.add("8:56 a.m.");
                            mTimesList.add("12:26 p.m.");
                            mTimesList.add("2:56 p.m.");
                            mTimesList.add("5:26 p.m.");
                            break;
                        case "57th at MacCorkle":
                            mTimesList.add("7:10 a.m.");
                            mTimesList.add("9:10 a.m.");
                            mTimesList.add("12:40 p.m.");
                            mTimesList.add("3:10 p.m.");
                            mTimesList.add("5:40 p.m.");
                            break;
                        case "Cambronne Lane":
                            mTimesList.add("7:35 a.m.");
                            mTimesList.add("9:35 a.m.");
                            mTimesList.add("1:05 p.m.");
                            mTimesList.add("3:35 p.m.");
                            mTimesList.add("6:05 p.m.");
                            break;
                    }
                    break;
                case "Inbound":
                    switch (mTimepoint) {
                        case "Cambronne Lane":
                            mTimesList.add("7:50 a.m.");
                            mTimesList.add("9:50 a.m.");
                            mTimesList.add("1:20 p.m.");
                            mTimesList.add("4:20 p.m.");
                            mTimesList.add("6:20 p.m.");
                            break;
                        case "57th at MacCorkle":
                            mTimesList.add("8:15 a.m.");
                            mTimesList.add("10:15 a.m.");
                            mTimesList.add("1:45 p.m.");
                            mTimesList.add("4:45 p.m.");
                            mTimesList.add("6:45 p.m.");
                            break;
                        case "CAMC Memorial":
                            mTimesList.add("8:29 a.m.");
                            mTimesList.add("10:29 a.m.");
                            mTimesList.add("1:59 p.m.");
                            mTimesList.add("4:59 p.m.");
                            mTimesList.add("6:59 p.m.");
                            break;
                        case "Laidley Transit Mall":
                            mTimesList.add("8:45 a.m.");
                            mTimesList.add("10:45 a.m.");
                            mTimesList.add("2:15 p.m.");
                            mTimesList.add("5:15 p.m.");
                            mTimesList.add("7:15 p.m.");
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
