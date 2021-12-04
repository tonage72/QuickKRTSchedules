package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt8Data {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Casdorph Road":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Fishers Branch":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("5:27 p.m.");
                                break;
                            case "Sissonville High School":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("5:32 p.m.");
                                break;
                            case "Sissonville":
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Sissonville":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                            case "Sissonville High School":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:52 p.m.");
                                break;
                            case "Fishers Branch":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:57 p.m.");
                                break;
                            case "Casdorph Road":
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("6:02 p.m.");
                                break;
                            case "Littlepage Terrace":
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("8:41 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("3:11 p.m.");
                                mTimesList.add("4:46 p.m.");
                                mTimesList.add("6:07 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:58 p.m.");
                                mTimesList.add("-");
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
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Casdorph Road":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Fishers Branch":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("5:27 p.m.");
                                break;
                            case "Sissonville High School":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("5:32 p.m.");
                                break;
                            case "Sissonville":
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Sissonville":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                            case "Sissonville High School":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:52 p.m.");
                                break;
                            case "Fishers Branch":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:57 p.m.");
                                break;
                            case "Casdorph Road":
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("6:02 p.m.");
                                break;
                            case "Littlepage Terrace":
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("8:41 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("3:11 p.m.");
                                mTimesList.add("4:46 p.m.");
                                mTimesList.add("6:07 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:58 p.m.");
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
