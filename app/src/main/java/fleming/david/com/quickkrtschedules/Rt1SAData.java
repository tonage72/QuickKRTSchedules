package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt1SAData {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.\n(Ordinance Park)");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:15 p.m.\n(Ordinance Park)");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("4:40 a.m.");
                                mTimesList.add("5:10 a.m.");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("6:42 a.m.\n(Ordinance Park)");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("8:42 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("5:27 p.m.\n(Ordinance Park)");
                                mTimesList.add("6:12 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("4:50 a.m.");
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("5:40 a.m.");
                                mTimesList.add("6:09 a.m.");
                                mTimesList.add("6:24 a.m.");
                                mTimesList.add("6:54 a.m.\n(Ordinance Park)");
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("8:54 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("9:54 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("10:54 a.m.");
                                mTimesList.add("11:24 a.m.");
                                mTimesList.add("11:54 a.m.");
                                mTimesList.add("12:24 p.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("1:24 p.m.");
                                mTimesList.add("1:54 p.m.");
                                mTimesList.add("2:24 p.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("3:24 p.m.");
                                mTimesList.add("3:54 p.m.");
                                mTimesList.add("4:24 p.m.");
                                mTimesList.add("4:54 p.m.");
                                mTimesList.add("5:24 p.m.");
                                mTimesList.add("5:39 p.m.\n(Ordinance Park)");
                                mTimesList.add("6:24 p.m.");
                                mTimesList.add("7:39 p.m.");
                                mTimesList.add("9:44 p.m.");
                                mTimesList.add("11:39 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("5:10 a.m.");
                                mTimesList.add("5:40 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:29 a.m.");
                                mTimesList.add("6:44 a.m.");
                                mTimesList.add("7:14 a.m.");
                                mTimesList.add("7:44 a.m.");
                                mTimesList.add("8:14 a.m.");
                                mTimesList.add("8:44 a.m.");
                                mTimesList.add("9:14 a.m.");
                                mTimesList.add("9:44 a.m.");
                                mTimesList.add("10:14 a.m.");
                                mTimesList.add("10:44 a.m.");
                                mTimesList.add("11:14 a.m.");
                                mTimesList.add("11:44 a.m.");
                                mTimesList.add("12:14 p.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:14 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("2:14 p.m.");
                                mTimesList.add("2:44 p.m.");
                                mTimesList.add("3:14 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:14 p.m.");
                                mTimesList.add("4:44 p.m.");
                                mTimesList.add("5:14 p.m.");
                                mTimesList.add("5:44 p.m.");
                                mTimesList.add("5:59 p.m.");
                                mTimesList.add("6:44 p.m.");
                                mTimesList.add("7:59 p.m.");
                                mTimesList.add("10:05 p.m.");
                                mTimesList.add("11:59 p.m.");
                                break;
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:04 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:01 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:54 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:04 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:01 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("5:10 a.m.");
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:30 a.m.\n(Ordinance Park)");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:00 p.m.\n(Ordinance Park)");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:30 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:05 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("10:50 p.m.");
                                mTimesList.add("12:11 a.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:43 a.m.");
                                mTimesList.add("6:18 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:03 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:03 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:03 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("7:18 p.m.");
                                mTimesList.add("8:58 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:20 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("5:55 a.m.");
                                mTimesList.add("6:30 a.m.");
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
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("7:30 p.m.");
                                mTimesList.add("9:10 p.m.");
                                mTimesList.add("11:15 p.m.");
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
                            case "4th at Stockton":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("6:13 a.m.");
                                mTimesList.add("7:13 a.m.");
                                mTimesList.add("8:13 a.m.");
                                mTimesList.add("9:13 a.m.");
                                mTimesList.add("10:13 a.m.");
                                mTimesList.add("11:13 a.m.");
                                mTimesList.add("12:13 p.m.");
                                mTimesList.add("1:13 p.m.");
                                mTimesList.add("2:13 p.m.");
                                mTimesList.add("3:13 p.m.");
                                mTimesList.add("4:13 p.m.");
                                mTimesList.add("5:13 p.m.");
                                mTimesList.add("6:13 p.m.");
                                mTimesList.add("7:28 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:28 p.m.");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:28 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("12:28 p.m.");
                                mTimesList.add("1:28 p.m.");
                                mTimesList.add("2:28 p.m.");
                                mTimesList.add("3:28 p.m.");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("5:28 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("7:43 p.m.");
                                mTimesList.add("9:44 p.m.");
                                mTimesList.add("11:43 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("5:52 a.m.");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("8:05 p.m.");
                                mTimesList.add("10:05 p.m.");
                                mTimesList.add("12:05 a.m.");
                                break;
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:10 p.m.");
                                mTimesList.add("12:10 p.m.");
                                break;
                        }
                        break;
                    case "Inbound" :
                        switch (mTimepoint) {
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:10 p.m.");
                                mTimesList.add("12:10 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:10 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:30 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("6:34 a.m.");
                                mTimesList.add("7:32 a.m.");
                                mTimesList.add("8:32 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("3:32 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:32 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:47 p.m.");
                                mTimesList.add("10:50 p.m.");
                                mTimesList.add("12:20 a.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("7:47 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("10:47 a.m.");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("12:47 p.m.");
                                mTimesList.add("1:47 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("9:02 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:35 a.m.");
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
                                mTimesList.add("-");
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
                                mTimesList.add("-");
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
                            case "4th at Stockton":
                                mTimesList.add("5:28 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("1:28 p.m.");
                                mTimesList.add("3:28 p.m.");
                                mTimesList.add("5:28 p.m.");
                                mTimesList.add("7:28 p.m.");
                                mTimesList.add("9:28 p.m.");
                                mTimesList.add("11:28 p.m.");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("5:43 a.m.");
                                mTimesList.add("7:43 a.m.");
                                mTimesList.add("9:43 a.m.");
                                mTimesList.add("11:43 a.m.");
                                mTimesList.add("1:43 p.m.");
                                mTimesList.add("3:43 p.m.");
                                mTimesList.add("5:43 p.m.");
                                mTimesList.add("7:43 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:43 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("12:05 p.m.");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("4:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("8:05 p.m.");
                                mTimesList.add("10:05 p.m.");
                                mTimesList.add("12:05 a.m.");
                                break;
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:10 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:10 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("-");
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("-");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("10:47 a.m.");
                                mTimesList.add("12:47 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("8:47 p.m.");
                                mTimesList.add("10:47 p.m.");
                                mTimesList.add("12:32 a.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("7:02 a.m.");
                                mTimesList.add("9:02 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("9:02 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:47 a.m.");
                                break;
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
