package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt22QData {

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
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:30 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:37 a.m.");
                                mTimesList.add("5:37 a.m.");
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:27 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("1:57 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("2:57 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:57 p.m.");
                                mTimesList.add("7:42 p.m.");
                                mTimesList.add("9:31 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:47 a.m.");
                                mTimesList.add("5:47 a.m.");
                                mTimesList.add("6:07 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:07 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("2:07 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("9:41 p.m.");
                                mTimesList.add("11:37 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("9:55 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:52 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:18 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("12:00 a.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:17 p.m.");
                                mTimesList.add("10:35 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("6:51 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("7:51 a.m.");
                                mTimesList.add("8:22 a.m.");
                                mTimesList.add("8:51 a.m.");
                                mTimesList.add("9:22 a.m.");
                                mTimesList.add("9:51 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("10:51 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("11:51 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("12:51 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("1:51 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("2:51 p.m.");
                                mTimesList.add("3:51 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("4:51 p.m.");
                                mTimesList.add("5:22 p.m.");
                                mTimesList.add("5:51 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("6:51 p.m.");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:36 p.m.");
                                mTimesList.add("8:37 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:18 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:01 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:01 a.m.");
                                mTimesList.add("8:32 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("10:01 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:01 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:01 p.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("1:01 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:01 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:01 p.m.");
                                mTimesList.add("4:01 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:01 p.m.");
                                mTimesList.add("5:32 p.m.");
                                mTimesList.add("6:01 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:01 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:46 p.m.");
                                mTimesList.add("8:47 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:28 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:55 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:42 a.m.");
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
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:27 a.m.");
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:31 p.m.");
                                mTimesList.add("11:24 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:37 a.m.");
                                mTimesList.add("5:37 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:07 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                mTimesList.add("7:37 p.m.");
                                mTimesList.add("9:41 p.m.");
                                mTimesList.add("11:33 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("4:55 a.m.");
                                mTimesList.add("5:55 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("9:55 p.m.");
                                mTimesList.add("11:48 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:51 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:28 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:54 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("10:35 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("7:51 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("8:51 a.m.");
                                mTimesList.add("9:51 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("11:22 a.m.");
                                mTimesList.add("11:51 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("12:51 p.m.");
                                mTimesList.add("1:51 p.m.");
                                mTimesList.add("2:22 p.m.");
                                mTimesList.add("4:46 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("5:51 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:46 p.m.");
                                mTimesList.add("8:32 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:09 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:01 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("10:01 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("12:01 p.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("1:01 p.m.");
                                mTimesList.add("2:01 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("6:01 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:56 p.m.");
                                mTimesList.add("8:42 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:17 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("9:10 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:29 a.m.");
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
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:35 a.m.");
                                mTimesList.add("6:41 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("7:24 p.m.");
                                mTimesList.add("9:24 p.m.");
                                mTimesList.add("11:24 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:45 a.m.");
                                mTimesList.add("6:49 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:52 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("9:35 p.m.");
                                mTimesList.add("11:32 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("4:57 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:53 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("7:50 p.m.");
                                mTimesList.add("9:50 p.m.");
                                mTimesList.add("11:47 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Mall":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("8:35 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("11:50 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("11:23 a.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("8:38 p.m.");
                                mTimesList.add("10:33 p.m.");
                                mTimesList.add("11:58 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:38 a.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("8:52 p.m.");
                                mTimesList.add("10:51 p.m.");
                                mTimesList.add("12:13 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:52 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("3:16 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("11:00 p.m.");
                                mTimesList.add("12:23 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:35 a.m.");
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
