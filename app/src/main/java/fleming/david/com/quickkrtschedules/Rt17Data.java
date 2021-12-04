package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt17Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("6:26 a.m.");
                                mTimesList.add("7:26 a.m.");
                                mTimesList.add("8:26 a.m.");
                                mTimesList.add("9:26 a.m.");
                                mTimesList.add("10:26 a.m.");
                                mTimesList.add("10:56 a.m.");
                                mTimesList.add("11:56 a.m.");
                                mTimesList.add("12:56 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:56 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("6:56 p.m.");
                                mTimesList.add("8:26 p.m.");
                                mTimesList.add("9:26 p.m.");
                                break;
                            case "Shops at Kanawha Mall":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:10 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("9:40 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Shops at Kanawha Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("9:45 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("11:09 a.m.");
                                mTimesList.add("11:59 a.m.");
                                mTimesList.add("12:29 p.m.");
                                mTimesList.add("1:29 p.m.");
                                mTimesList.add("2:29 p.m.");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("4:29 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("6:29 p.m.");
                                mTimesList.add("7:59 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("9:59 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("10:15 p.m.");
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
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("7:26 a.m.");
                                mTimesList.add("8:26 a.m.");
                                mTimesList.add("9:26 a.m.");
                                mTimesList.add("10:26 a.m.");
                                mTimesList.add("11:26 a.m.");
                                mTimesList.add("12:56 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:56 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("6:56 p.m.");
                                mTimesList.add("8:26 p.m.");
                                mTimesList.add("9:26 p.m.");
                                break;
                            case "Shops at Kanawha Mall":
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("11:40 a.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:10 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("9:40 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Shops at Kanawha Mall":
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("9:45 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:59 a.m.");
                                mTimesList.add("12:29 p.m.");
                                mTimesList.add("1:29 p.m.");
                                mTimesList.add("2:29 p.m.");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("4:29 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("6:29 p.m.");
                                mTimesList.add("7:59 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("9:59 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("10:15 p.m.");
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
