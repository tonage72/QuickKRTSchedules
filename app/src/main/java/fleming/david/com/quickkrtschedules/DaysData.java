package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class DaysData {

    protected static String[] getDays(String mRouteSelected) {

        ArrayList<String> mTempDays = new ArrayList<>();

        switch (mRouteSelected) {
            case "5 Tyler Mtn/Cross Lanes":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "6 Elkview":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "7 Campbells Creek":
                mTempDays.add("Monday-Friday");
                break;
            case "8 Sissonville":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "10 Northgate/Hillcrest Drive":
                mTempDays.add("Monday-Friday");
                break;
            case "13 Beech Avenue":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "14 City Park":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "15 South Hills":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "16 South Park":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "17 South Side":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "18 Fort Hill/Montrose":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "23 Clendenin":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "19 Charleston Loop/Trolley":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            default:
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                mTempDays.add("Sunday");
                break;
        }

        String[] mDays = new String[mTempDays.size()];

        for (int i = 0; i < mDays.length; i++)
            mDays[i] = mTempDays.get(i);

        return mDays;
    }
}
