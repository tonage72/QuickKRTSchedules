package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt2CCData {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.");
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
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("6:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:26 p.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("-");
                                mTimesList.add("6:23 a.m.");
                                mTimesList.add("6:53 a.m.");
                                mTimesList.add("7:23 a.m.");
                                mTimesList.add("8:23 a.m.");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("10:23 a.m.");
                                mTimesList.add("11:23 a.m.");
                                mTimesList.add("12:23 p.m.");
                                mTimesList.add("1:23 p.m.");
                                mTimesList.add("2:23 p.m.");
                                mTimesList.add("3:23 p.m.");
                                mTimesList.add("4:23 p.m.");
                                mTimesList.add("5:23 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:34 p.m.");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("-");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:53 p.m.");
                                mTimesList.add("11:42 p.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("6:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:54 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("6:56 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("7:56 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("9:56 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:56 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("10:08 p.m.");
                                mTimesList.add("12:04 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("6:32 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("7:32 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:02 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:17 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:17 p.m.");
                                mTimesList.add("12:05 a.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:27 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("6:11 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:40 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("10:40 p.m.");
                                mTimesList.add("12:15 a.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("6:22 a.m.");
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("1:37 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("8:52 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:23 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:18 a.m.");
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
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:31 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
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
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:41 a.m.");
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
                                mTimesList.add("5:00 a.m.");
                                mTimesList.add("6:00 a.m.");
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
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:12 a.m.");
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("6:12 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("5:23 a.m.");
                                mTimesList.add("6:23 a.m.");
                                mTimesList.add("7:23 a.m.");
                                mTimesList.add("8:23 a.m.");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("10:23 a.m.");
                                mTimesList.add("11:23 a.m.");
                                mTimesList.add("12:23 p.m.");
                                mTimesList.add("1:23 p.m.");
                                mTimesList.add("2:23 p.m.");
                                mTimesList.add("3:23 p.m.");
                                mTimesList.add("4:23 p.m.");
                                mTimesList.add("5:23 p.m.");
                                mTimesList.add("6:23 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:38 p.m.");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("5:33 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:53 p.m.");
                                mTimesList.add("11:48 p.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("5:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:01 a.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("5:56 a.m.");
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:56 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:56 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:56 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:11 p.m.");
                                mTimesList.add("10:08 p.m.");
                                mTimesList.add("12:11 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("6:10 a.m.");
                                mTimesList.add("7:02 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:02 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:17 p.m.");
                                mTimesList.add("12:11 a.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("-");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:27 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("10:40 p.m.");
                                mTimesList.add("12:21 a.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("1:37 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                mTimesList.add("7:37 p.m.");
                                mTimesList.add("8:52 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:29 a.m.");
                                break;
                            case "Capitol Complex":
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
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:37 a.m.");
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
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:47 a.m.");
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
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("7:27 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:27 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("5:38 a.m.");
                                mTimesList.add("7:38 a.m.");
                                mTimesList.add("9:38 a.m.");
                                mTimesList.add("11:38 a.m.");
                                mTimesList.add("1:38 p.m.");
                                mTimesList.add("3:38 p.m.");
                                mTimesList.add("5:38 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("9:38 p.m.");
                                mTimesList.add("11:38 p.m.");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("5:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:48 p.m.");
                                mTimesList.add("11:48 p.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("6:01 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:01 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:01 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("6:11 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("2:11 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("6:11 p.m.");
                                mTimesList.add("8:03 p.m.");
                                mTimesList.add("10:11 p.m.");
                                mTimesList.add("12:03 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("8:17 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("12:03 a.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("-");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:13 a.m.");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:40 p.m.");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("10:40 p.m.");
                                mTimesList.add("12:26 a.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("6:52 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("10:52 a.m.");
                                mTimesList.add("12:52 p.m.");
                                mTimesList.add("2:52 p.m.");
                                mTimesList.add("4:52 p.m.");
                                mTimesList.add("6:52 p.m.");
                                mTimesList.add("8:52 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:38 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:49 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("1:01 a.m.");
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
