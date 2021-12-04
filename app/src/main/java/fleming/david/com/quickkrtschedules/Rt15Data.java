package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt15Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:20 a.m.\n(No Myrlte Rd)");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Bridge Rd and Walnut Rd":
                                mTimesList.add("7:25 a.m.\n(No Myrlte Rd)");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Ashton Place Shopping Center":
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("8:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("10:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:39 p.m.");
                                mTimesList.add("1:39 p.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("3:39 p.m.");
                                mTimesList.add("4:39 p.m.");
                                mTimesList.add("5:39 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Ashton Place Shopping Center":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("8:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("10:59 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:39 p.m.");
                                mTimesList.add("1:39 p.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("3:39 p.m.");
                                mTimesList.add("4:39 p.m.");
                                mTimesList.add("5:39 p.m.");
                                break;
                            case "Bridge Rd and Walnut Rd":
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("11:08 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
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
                                mTimesList.add("7:20 a.m.\n(No Myrlte Rd)");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Bridge Rd and Walnut Rd":
                                mTimesList.add("7:25\n(No Myrlte Rd)");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Ashton Place Shopping Center":
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("8:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("10:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:39 p.m.");
                                mTimesList.add("1:39 p.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("3:39 p.m.");
                                mTimesList.add("4:39 p.m.");
                                mTimesList.add("5:39 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Ashton Place Shopping Center":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("8:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("10:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:39 p.m.");
                                mTimesList.add("1:39 p.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("3:39 p.m.");
                                mTimesList.add("4:39 p.m.");
                                mTimesList.add("5:39 p.m.");
                                break;
                            case "Bridge Rd and Walnut Rd":
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
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
