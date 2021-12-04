package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt14Data {

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
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                            case "Capitol Market":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("10:03 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("2:03 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("6:03 p.m.");
                                break;
                            case "City Park/Vista View Apartments":
                                mTimesList.add("7:08 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:08 a.m.");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:08 p.m.");
                                mTimesList.add("5:08 p.m.");
                                mTimesList.add("6:08 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "City Park/Vista View Apartments":
                                mTimesList.add("7:08 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:08 a.m.");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:08 p.m.");
                                mTimesList.add("5:08 p.m.");
                                mTimesList.add("6:08 p.m.");
                                break;
                            case "Capitol Market":
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("6:12 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("9:17 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("1:17 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("6:17 p.m.");
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
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Capitol Market":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("10:03 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("2:03 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                break;
                            case "City Park/Vista View Apartments":
                                mTimesList.add("7:08 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:08 a.m.");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:08 p.m.");
                                mTimesList.add("5:08 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "City Park/Vista View Apartments":
                                mTimesList.add("7:08 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:08 a.m.");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:08 p.m.");
                                mTimesList.add("5:08 p.m.");
                                break;
                            case "Capitol Market":
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("9:17 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("1:17 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:17 p.m.");
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
