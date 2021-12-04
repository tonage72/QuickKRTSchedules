package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt5Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:06 p.m.");
                                mTimesList.add("3:09 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:06 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("11:08 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("3:26 p.m.");
                                mTimesList.add("4:26 p.m.");
                                mTimesList.add("5:26 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("6:14 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:19 a.m.");
                                mTimesList.add("9:26 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:22 a.m.");
                                mTimesList.add("12:21 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:31 p.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("5:40 p.m.");
                                break;
                            case "Top of Tyler Mountain":
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("6:26 a.m.");
                                mTimesList.add("7:32 a.m.");
                                mTimesList.add("8:31 a.m.");
                                mTimesList.add("9:38 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:34 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:22 p.m.");
                                mTimesList.add("2:43 p.m.");
                                mTimesList.add("3:52 p.m.");
                                mTimesList.add("4:52 p.m.");
                                mTimesList.add("5:52 p.m.");
                                break;
                            case "Andrew Jackson Middle School":
                                mTimesList.add("5:38 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:43 a.m.");
                                mTimesList.add("8:42 a.m.");
                                mTimesList.add("9:49 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("6:03 p.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:48 a.m.");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("7:53 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:58 p.m.");
                                mTimesList.add("11:55 p.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:04 p.m.");
                                mTimesList.add("4:13 p.m.");
                                mTimesList.add("5:13 p.m.");
                                mTimesList.add("6:13 p.m.");
                                break;
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:53 a.m.");
                                mTimesList.add("6:52 a.m.");
                                mTimesList.add("7:58 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:18 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("2:02 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("6:17 p.m.");
                                break;
                            case "Andrew Jackson Middle School":
                                mTimesList.add("6:03 a.m.");
                                mTimesList.add("7:02 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("12:13 p.m.");
                                mTimesList.add("1:13 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:22 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:27 p.m.");
                                break;
                            case "Top of Tyler Mountain":
                                mTimesList.add("6:13 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:38 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("12:23 p.m.");
                                mTimesList.add("1:23 p.m.");
                                mTimesList.add("2:22 p.m.");
                                mTimesList.add("3:32 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:52 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:35 p.m.");
                                mTimesList.add("1:35 p.m.");
                                mTimesList.add("2:34 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:49 p.m.");
                                mTimesList.add("5:49 p.m.");
                                mTimesList.add("6:49 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:43 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:08 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("2:52 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:14 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:27 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("5:33 p.m.");
                                break;
                            case "Top of Tyler Mountain":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                break;
                            case "Andrew Jackson Middle School":
                                mTimesList.add("6:09 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("2:57 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:57 p.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("6:19 a.m.");
                                mTimesList.add("7:09 a.m.");
                                mTimesList.add("8:09 a.m.");
                                mTimesList.add("9:09 a.m.");
                                mTimesList.add("11:09 a.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("3:09 p.m.");
                                mTimesList.add("5:09 p.m.");
                                mTimesList.add("6:09 p.m.");
                                break;
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:12 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("9:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:17 p.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                break;
                            case "Andrew Jackson Middle School":
                                mTimesList.add("6:32 a.m.");
                                mTimesList.add("7:32 a.m.");
                                mTimesList.add("8:42 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("3:32 p.m.");
                                mTimesList.add("5:32 p.m.");
                                mTimesList.add("6:32 p.m.");
                                break;
                            case "Top of Tyler Mountain":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:07 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("1:57 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:57 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
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
