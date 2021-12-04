package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt18Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:35 a.m.\n(To SC Tech Park on St Albans Rt)");
                                mTimesList.add("1:00 p.m.\n(To SC Tech Park on St Albans Rt)");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:30 p.m.\n(To SC Tech Park on St Albans Rt)");
                                mTimesList.add("9:25 p.m.\n(To SC Tech Park on St Albans Rt)");
                                break;
                            case "Wilkie Dr at Churchill Dr":
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Daverton Rd at Thorne Rd":
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("4:18 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Montrose Dr at Glendale Ave":
                                mTimesList.add("7:53 a.m.");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:53 p.m.");
                                mTimesList.add("4:23 p.m.");
                                mTimesList.add("5:53 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "SC Tech Center":
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("9:45 p.m.");
                                break;
                            case "E St at 6th Ave":
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:38 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:28 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("6:08 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Riverwalk":
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Riverwalk":
                                mTimesList.add("-");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("11:22 a.m.\n(To Transit Mall on St Albans Rt from Tech Center)");
                                mTimesList.add("1:37 p.m.\n(To Garage on St Albans Rt from Tech Center)");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "E St at 6th Ave":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:21 a.m.");
                                mTimesList.add("9:51 a.m.");
                                mTimesList.add("11:26 a.m.\n(To Transit Mall on St Albans Rt from Tech Center)");
                                mTimesList.add("1:41 p.m.\n(To Garage on St Albans Rt from Tech Center)");
                                mTimesList.add("3:21 p.m.");
                                mTimesList.add("4:51 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "SC Tech Center":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("11:34 a.m.\n(To Transit Mall on St Albans Rt from Tech Center)");
                                mTimesList.add("1:49 p.m.\n(To Garage on St Albans Rt from Tech Center)");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("4:59 p.m.");
                                mTimesList.add("6:50 p.m.\n(To Garage on St Albans Rt)");
                                mTimesList.add("10:00 p.m.\n(To Transit Mall on St Albans Rt)");
                                break;
                            case "Montrose Dr at Glendale Ave":
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("8:31 a.m.");
                                mTimesList.add("10:06 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:36 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Daverton Rd at Thorne Rd":
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:36 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:41 p.m.");
                                mTimesList.add("5:11 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Wilkie Dr at Churchill Dr":
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("8:44 a.m.");
                                mTimesList.add("10:19 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:49 p.m.");
                                mTimesList.add("5:19 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:54 a.m.");
                                mTimesList.add("10:29 a.m.");
                                mTimesList.add("11:54 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:59 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:20 p.m.");
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
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Wilkie Dr at Churchill Dr":
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:40 p.m.");
                                break;
                            case "Daverton Rd at Thorne Rd":
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:50 p.m.");
                                break;
                            case "Montrose Dr at Glendale Ave":
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                            case "SC Tech Center":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "E St at 6th Ave":
                                mTimesList.add("8:06 a.m.");
                                mTimesList.add("9:36 a.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("6:06 p.m.");
                                break;
                            case "Riverwalk":
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("6:10 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Riverwalk":
                                mTimesList.add("-");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:50 p.m.");
                                break;
                            case "E St at 6th Ave":
                                mTimesList.add("6:54 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("9:54 a.m.");
                                mTimesList.add("3:24 p.m.");
                                mTimesList.add("4:54 p.m.");
                                break;
                            case "SC Tech Center":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Montrose Dr at Glendale Ave":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Daverton Rd at Thorne Rd":
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("5:10 p.m.");
                                break;
                            case "Wilkie Dr at Churchill Dr":
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("4:00 p.m.");
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
