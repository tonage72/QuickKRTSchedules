package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt22MData {
    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:30 a.m.");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("9:20 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:37 a.m.");
                                mTimesList.add("5:37 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("7:27 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:57 p.m.");
                                mTimesList.add("9:31 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:47 a.m.");
                                mTimesList.add("5:47 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("9:41 p.m.");
                                break;
                            case "Quincy Walmart":
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
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("9:55 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("12:05 p.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("3:05 p.m.");
                                mTimesList.add("4:05 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("7:35 p.m.");
                                mTimesList.add("10:05 p.m.");
                                break;
                            case "Montgomery":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:50 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Montgomery":
                                mTimesList.add("5:35 a.m.");
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("7:35 a.m.");
                                mTimesList.add("8:35 a.m.");
                                mTimesList.add("9:35 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:35 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("6:35 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:50 a.m.");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("8:07 p.m.");
                                mTimesList.add("10:26 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:17 p.m.");
                                mTimesList.add("10:35 p.m.");
                                break;
                            case "Quincy Walmart":
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
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:22 a.m.");
                                mTimesList.add("9:22 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("5:22 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:37 p.m.");
                                mTimesList.add("10:52 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:32 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:32 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:47 p.m.");
                                mTimesList.add("11:02 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:55 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("11:15 p.m.");
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
                                mTimesList.add("4:15 a.m.");
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:27 a.m.");
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:27 p.m.");
                                mTimesList.add("9:31 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:37 a.m.");
                                mTimesList.add("5:37 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                mTimesList.add("9:41 p.m.");
                                break;
                            case "Quincy Walmart":
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
                            case "Quincy Mall":
                                mTimesList.add("4:55 a.m.");
                                mTimesList.add("5:55 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("9:55 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("3:05 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("7:05 p.m.");
                                mTimesList.add("10:05 p.m.");
                                break;
                            case "Montgomery":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Montgomery":
                                mTimesList.add("5:35 a.m.");
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("7:35 a.m.");
                                mTimesList.add("9:35 a.m.");
                                mTimesList.add("10:35 a.m.");
                                mTimesList.add("11:35 a.m.");
                                mTimesList.add("1:35 p.m.");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("6:35 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:50 a.m.");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("10:26 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("10:35 p.m.");
                                break;
                            case "Quincy Walmart":
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
                            case "Malden Underpass":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("11:22 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("2:22 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:32 p.m.");
                                mTimesList.add("10:52 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:42 p.m.");
                                mTimesList.add("11:02 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("8:55 p.m.");
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
                                mTimesList.add("4:25 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:35 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("7:24 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:45 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("7:32 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("4:57 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("5:53 p.m.");
                                mTimesList.add("7:47 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:00 a.m.");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("7:50 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:07 a.m.");
                                mTimesList.add("9:31 a.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("6:06 p.m.");
                                mTimesList.add("8:03 p.m.");
                                break;
                            case "Montgomery":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("9:51 a.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("8:15 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Montgomery":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("6:18 p.m.");
                                mTimesList.add("8:15 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:35 a.m.");
                                mTimesList.add("10:18 a.m.");
                                mTimesList.add("1:43 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("8:28 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("8:35 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("8:38 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("8:52 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("8:59 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
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
