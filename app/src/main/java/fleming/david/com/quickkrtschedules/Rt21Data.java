package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt21Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.\n(Express)");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:30 p.m.\n(Express)");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.\n(Express)");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.\n(Express)");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("8:00 p.m.\n(Express)");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("10:30 p.m.\n(Express w/ Oakwood at Oakhurst)");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("5:52 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:42 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:12 p.m.");
                                mTimesList.add("10:38 p.m.\n(Express)");
                                break;
                            case "Davis Creek":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:47 p.m.");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:17 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("6:02 a.m.");
                                mTimesList.add("7:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("11:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:59 p.m.");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:59 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:59 p.m.");
                                mTimesList.add("7:44 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:29 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Walmart/Southridge Center":
                                mTimesList.add("6:08 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("7:37 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("8:50 a.m.\n(Rt end - see inbound times)");
                                mTimesList.add("10:07 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("11:37 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("12:50 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("2:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("3:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("4:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("5:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("5:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("6:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("7:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("7:52 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("8:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("9:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("10:50 p.m.\n(Rt end - see inbound times)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Walmart/Southridge Center":
                                mTimesList.add("6:08 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("2:07 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("9:37 p.m.");
                                mTimesList.add("10:50 p.m.");
                                break;
                            case "South Central Regional Jail":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:12 p.m.");
                                mTimesList.add("7:57 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:42 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Cross Terrace Blvd at Parkway Rd":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:50 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("12:02 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("6:02 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:32 p.m.");
                                mTimesList.add("8:30 p.m.");
                                mTimesList.add("10:02 p.m.");
                                mTimesList.add("11:00 p.m.");
                                break;
                            case "Davis Creek":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("7:40 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:10 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:16 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:46 a.m.");
                                mTimesList.add("12:16 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:46 p.m.");
                                mTimesList.add("4:16 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:16 p.m.");
                                mTimesList.add("6:46 p.m.");
                                mTimesList.add("7:46 p.m.");
                                mTimesList.add("8:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:16 p.m.");
                                mTimesList.add("11:07 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:58 a.m.");
                                mTimesList.add("12:28 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("6:58 p.m.");
                                mTimesList.add("7:58 p.m.");
                                mTimesList.add("8:58 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("10:28 p.m.");
                                mTimesList.add("11:15 p.m.");
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
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:30 a.m.\n(Express)");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("4:15 p.m.\n(Express)");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:30 p.m.\n(Express)");
                                mTimesList.add("7:15 p.m.");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("8:51 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:27 p.m.");
                                break;
                            case "Davis Creek":
                                mTimesList.add("8:56 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:17 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:32 p.m.");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("9:04 a.m.");
                                mTimesList.add("10:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:29 p.m.");
                                mTimesList.add("2:59 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:44 p.m.");
                                break;
                            case "Walmart/Southridge Center":
                                mTimesList.add("9:10 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("10:37 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("11:50 a.m.\n(Rt end - see inbound times)");
                                mTimesList.add("1:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("3:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("4:35 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("5:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("6:50 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("7:52 p.m.\n(To jail - see inbound times)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Walmart/Southridge Center":
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("1:37 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("7:52 p.m.");
                                break;
                            case "South Central Regional Jail":
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:57 p.m.");
                                break;
                            case "Cross Terrace Blvd at Parkway Rd":
                                mTimesList.add("9:22 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:05 p.m.");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("9:34 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:02 p.m.");
                                mTimesList.add("3:32 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("6:02 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:17 p.m.");
                                break;
                            case "Davis Creek":
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:25 p.m.");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("11:16 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("3:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:16 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:31 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:28 p.m.");
                                mTimesList.add("3:58 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("8:43 p.m.");
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
