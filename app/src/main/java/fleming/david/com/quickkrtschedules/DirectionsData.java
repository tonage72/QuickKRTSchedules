package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class DirectionsData {

    protected String[] getDirections(String mRouteSelected) {

        ArrayList<String> mTempDirections = new ArrayList<>();

        if ("19 Charleston Loop/Trolley".equals(mRouteSelected)) {
            mTempDirections.add("Loop");
        } else {
            mTempDirections.add("Inbound");
            mTempDirections.add("Outbound");
        }

        String[] mDirections = new String[mTempDirections.size()];

        for (int i = 0; i < mDirections.length; i++)
            mDirections[i] = mTempDirections.get(i);

        return mDirections;
    }

}
