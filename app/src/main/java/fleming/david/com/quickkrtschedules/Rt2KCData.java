package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class Rt2KCData {

    protected String[] getTimes(String mDay, String mDirection, String mTimepoint) {

        ArrayList<String> mTimesList = new ArrayList<>();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:30 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:30 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:30 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:30 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:30 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:15 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:20 p.m.\n(To Cabin Creek)");
                                mTimesList.add("10:30 p.m.\n(To capitol only Mon-Thu)");
                                mTimesList.add("11:15 p.m.\n(To Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:42 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:42 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:42 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:42 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:42 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:27 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:32 p.m.\n(To Cabin Creek)");
                                mTimesList.add("10:42 p.m.\n(End route Mon-Thu)");
                                mTimesList.add("11:26 p.m.\n(To Cabin Creek)");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("6:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:53 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:53 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:53 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:53 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:53 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:38 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:43 p.m.\n(To Cabin Creek)");
                                mTimesList.add("-");
                                mTimesList.add("11:34 p.m.\n(To Cabin Creek)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "57th at MacCorkle":
                                mTimesList.add("5:40 a.m.\n(Starts at Mall)");
                                mTimesList.add("6:22 a.m.\n(From Cabin Creek)");
                                mTimesList.add("7:07 a.m.\n(From Cabin Creek)");
                                mTimesList.add("7:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("8:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("8:07 a.m.\n(From Cabin Creek)");
                                mTimesList.add("8:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("9:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("9:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("10:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("10:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("11:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("11:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("12:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("12:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("1:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("1:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("2:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("2:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("3:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("3:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("4:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("4:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("5:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("5:50 p.m.\n(Starts at Mall)");
                                mTimesList.add("6:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("7:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("8:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("10:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("12:23 a.m.\n(From Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:52 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:16 a.m.");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:16 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:16 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:16 a.m.");
                                mTimesList.add("11:48 p.m.");
                                mTimesList.add("12:16 p.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:16 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:16 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:16 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("6:01 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:31 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
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
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:15 p.m.");
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
                                mTimesList.add("5:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("4:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("5:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("6:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("7:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:20 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:15 p.m.\n(To Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("4:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("5:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("6:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("7:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:32 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:27 p.m.\n(To Cabin Creek)");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("5:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("4:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("5:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("6:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("7:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:43 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:38 p.m.\n(To Cabin Creek)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "57th at MacCorkle":
                                mTimesList.add("6:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("6:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("7:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("8:00 a.m.\n(Starts at Mall)");
                                mTimesList.add("8:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("9:00 a.m.\n(Starts at Mall)");
                                mTimesList.add("9:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("10:00 a.m.\n(Starts at Mall)");
                                mTimesList.add("10:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("11:00 a.m.\n(Starts at Mall)");
                                mTimesList.add("11:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("12:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("12:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("1:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("1:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("2:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("2:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("3:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("3:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("4:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("4:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("5:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("5:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("6:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("6:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("7:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("7:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("8:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("10:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("12:29 a.m.\n(From Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:16 a.m.");
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:11 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:11 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:11 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:11 p.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:11 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:11 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:11 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:11 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:11 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("6:11 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("7:11 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:37 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("7:25 p.m.");
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
                                mTimesList.add("5:15 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:15 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:15 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:15 a.m.\n(To Cabin Creek)");
                                mTimesList.add("1:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:15 p.m.\n(To Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:27 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:27 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:27 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:27 a.m.\n(To Cabin Creek)");
                                mTimesList.add("1:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:27 p.m.\n(To Cabin Creek)");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("5:38 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:38 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:38 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:38 a.m.\n(To Cabin Creek)");
                                mTimesList.add("1:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:38 p.m.\n(To Cabin Creek)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "57th at MacCorkle":
                                mTimesList.add("6:52 a.m.\n(From Cabin Creek)");
                                mTimesList.add("8:52 a.m.\n(From Cabin Creek)");
                                mTimesList.add("10:52 a.m.\n(From Cabin Creek)");
                                mTimesList.add("12:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("2:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("4:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("6:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("8:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("10:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("12:38 a.m.\n(From Cabin Creek)");
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
