package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class DaysData {

    protected String[] getDays(String mRouteSelected) {

        ArrayList<String> mTempDays = new ArrayList<>();

        switch (mRouteSelected) {
            case "5 Tyler Mtn/Cross Lanes":
            case "6 Elkview":
            case "8 Sissonville":
            case "13 Beech Avenue":
            case "14 City Park":
            case "15 South Hills":
            case "16 South Park":
            case "17 South Side":
            case "18 Fort Hill/Montrose":
            case "23 Clendenin":
            case "19 Charleston Loop/Trolley":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "7 Campbells Creek":
            case "10 Northgate/Hillcrest Drive":
                mTempDays.add("Monday-Friday");
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
