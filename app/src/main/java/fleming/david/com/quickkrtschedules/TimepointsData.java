package fleming.david.com.quickkrtschedules;

import java.util.ArrayList;

public class TimepointsData {

    protected String[] getTimepoints(String mRouteSelected,String mDaySelected,String mDirectionSelected) {

        ArrayList<String> mTimepointsList = new ArrayList<>();

        switch (mRouteSelected) {
            case "1SA St Albans":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("4th at Stockton");
                        mTimepointsList.add("Thomas Hospital");
                        mTimepointsList.add("St Albans Station");
                        mTimepointsList.add("Route 60/35");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Route 60/35");
                        mTimepointsList.add("St Albans Station");
                        mTimepointsList.add("Thomas Hospital");
                        mTimepointsList.add("4th at Stockton");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "1WC West Charleston":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("4th at Stockton");
                        mTimepointsList.add("Patrick Street Plaza");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Patrick Street Plaza");
                        mTimepointsList.add("4th at Stockton");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "2CC Cabin Creek":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("Marmet Junction");
                        mTimepointsList.add("Cabin Creek Turnaround");
                        mTimepointsList.add("Quincy Walmart");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Quincy Walmart");
                        mTimepointsList.add("Cabin Creek Turnaround");
                        mTimepointsList.add("Marmet Junction");
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "2KC Kanawha City":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("57th at MacCorkle");
                        break;
                    case "Inbound":
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "3N Nitro":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("7th Ave and 26th St");
                        mTimepointsList.add("12th and Dunbar Ave");
                        mTimepointsList.add("WV State University");
                        mTimepointsList.add("St Albans Station");
                        mTimepointsList.add("40th St and Route 25");
                        mTimepointsList.add("Nitro Marketplace");
                        mTimepointsList.add("Mardi Gras Casino & Resort");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Mardi Gras Casino & Resort");
                        mTimepointsList.add("Nitro Marketplace");
                        mTimepointsList.add("40th St and Route 25");
                        mTimepointsList.add("St Albans Station");
                        mTimepointsList.add("WV State University");
                        mTimepointsList.add("12th and Dunbar Ave");
                        mTimepointsList.add("7th Ave and 26th St");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        break;
                }
                break;

            case "3I Institute/WVSU": //Needs 2 switches to remove Stockton and Washington from all but M-F inbound
                if ("Monday-Friday".equals(mDaySelected)) {
                    switch (mDirectionSelected) {
                        case "Outbound":
                            mTimepointsList.add("Capitol Complex");
                            mTimepointsList.add("Laidley Transit Mall");
                            mTimepointsList.add("7th Ave and 26th St");
                            mTimepointsList.add("12th and Dunbar Ave");
                            mTimepointsList.add("WV State University");
                            break;
                        case "Inbound":
                            mTimepointsList.add("WV State University");
                            mTimepointsList.add("12th and Dunbar Ave");
                            mTimepointsList.add("7th Ave and 26th St");
                            mTimepointsList.add("Stockton and W Washington");
                            mTimepointsList.add("Laidley Transit Mall");
                            mTimepointsList.add("Capitol Complex");
                            break;
                    }
                } else {
                    switch (mDirectionSelected) {
                        case "Outbound":
                            mTimepointsList.add("Capitol Complex");
                            mTimepointsList.add("Laidley Transit Mall");
                            mTimepointsList.add("7th Ave and 26th St");
                            mTimepointsList.add("12th and Dunbar Ave");
                            mTimepointsList.add("WV State University");
                            break;
                        case "Inbound":
                            mTimepointsList.add("WV State University");
                            mTimepointsList.add("12th and Dunbar Ave");
                            mTimepointsList.add("7th Ave and 26th St");
                            mTimepointsList.add("Laidley Transit Mall");
                            mTimepointsList.add("Capitol Complex");
                            break;
                    }
                }
                break;

            case "5 Tyler Mtn/Cross Lanes":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("7th Ave and 26th St");
                        mTimepointsList.add("Top of Tyler Mountain");
                        mTimepointsList.add("Andrew Jackson Middle School");
                        mTimepointsList.add("Nitro Marketplace");
                        mTimepointsList.add("Mardi Gras Casino & Resort");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Mardi Gras Casino & Resort");
                        mTimepointsList.add("Nitro Marketplace");
                        mTimepointsList.add("Andrew Jackson Middle School");
                        mTimepointsList.add("Top of Tyler Mountain");
                        mTimepointsList.add("7th Ave and 26th St");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        break;
                }
                break;

            case "6 Elkview":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Greenbrier St at Washington St");
                        mTimepointsList.add("Northgate Business Park");
                        mTimepointsList.add("Capital High School");
                        mTimepointsList.add("Quick Road");
                        mTimepointsList.add("Crossings Mall");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Crossings Mall");
                        mTimepointsList.add("Quick Road");
                        mTimepointsList.add("Capital High School");
                        mTimepointsList.add("Northgate Business Park");
                        mTimepointsList.add("Greenbrier St at Washington St");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "7 Campbells Creek":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("CAMC Memorial");
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("Cambronne Lane");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Cambronne Lane");
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("CAMC Memorial");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "8 Sissonville":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Casdorph Road");
                        mTimepointsList.add("Fishers Branch");
                        mTimepointsList.add("Sissonville High School");
                        mTimepointsList.add("Sissonville");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Sissonville");
                        mTimepointsList.add("Sissonville High School");
                        mTimepointsList.add("Fishers Branch");
                        mTimepointsList.add("Casdorph Road");
                        mTimepointsList.add("Littlepage Terrace");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "10 Northgate/Hillcrest Drive":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Greenbrier at Washington");
                        mTimepointsList.add("YMCA");
                        mTimepointsList.add("Hillcrest Apartments");
                        mTimepointsList.add("Northgate Business Park");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Northgate Business Park");
                        mTimepointsList.add("Greenbrier at Washington");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "11 Wertz Avenue":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Piedmont at Morris");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Oakridge at Serene");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Oakridge at Serene");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Piedmont at Morris");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "13 Beech Avenue":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("McQueen at Beech");
                        mTimepointsList.add("Patrick Street Plaza");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Patrick Street Plaza");
                        mTimepointsList.add("McQueen at Beech");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "14 City Park":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Market");
                        mTimepointsList.add("City Park/Vista View Apartments");
                        break;
                    case "Inbound":
                        mTimepointsList.add("City Park/Vista View Apartments");
                        mTimepointsList.add("Capitol Market");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "15 South Hills":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Bridge Rd and Walnut Rd");
                        mTimepointsList.add("Ashton Place Shopping Center");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Ashton Place Shopping Center");
                        mTimepointsList.add("Bridge Rd and Walnut Rd");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "16 South Park":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Alcoa Dr/South Park");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Alcoa Dr/South Park");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "17 South Side":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("CAMC Memorial");
                        mTimepointsList.add("Shops at Kanawha Mall");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Shops at Kanawha Mall");
                        mTimepointsList.add("CAMC Memorial");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "18 Fort Hill/Montrose":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Wilkie Dr at Churchill Dr");
                        mTimepointsList.add("Daverton Rd at Thorne Rd");
                        mTimepointsList.add("Montrose Dr at Glendale Ave");
                        mTimepointsList.add("SC Tech Center");
                        mTimepointsList.add("E St at 6th Ave");
                        mTimepointsList.add("Riverwalk");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Riverwalk");
                        mTimepointsList.add("E St at 6th Ave");
                        mTimepointsList.add("SC Tech Center");
                        mTimepointsList.add("Montrose Dr at Glendale Ave");
                        mTimepointsList.add("Daverton Rd at Thorne Rd");
                        mTimepointsList.add("Wilkie Dr at Churchill Dr");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "20 Virginia St/Capitol Complex":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "21 Southridge/Trace Fork/Dudley Farms":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Oakwood at Oakhurst");
                        mTimepointsList.add("Davis Creek");
                        mTimepointsList.add("Trace Fork (Ice Rink)");
                        mTimepointsList.add("Walmart/Southridge Center");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Walmart/Southridge Center");
                        mTimepointsList.add("South Central Regional Jail");
                        mTimepointsList.add("Cross Terrace Blvd at Parkway Rd");
                        mTimepointsList.add("Trace Fork (Ice Rink)");
                        mTimepointsList.add("Davis Creek");
                        mTimepointsList.add("Oakwood at Oakhurst");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "22Q Quincy Mall": //Needs 2 switches because Walmart and Quincy Mall are reversed on Sunday in and out.
                if ("Sunday".equals(mDaySelected)) {
                    switch (mDirectionSelected) {
                        case "Outbound":
                            mTimepointsList.add("Laidley Transit Mall");
                            mTimepointsList.add("Capitol Complex");
                            mTimepointsList.add("Malden Underpass");
                            mTimepointsList.add("Quincy Walmart");
                            mTimepointsList.add("Quincy Mall");
                            break;
                        case "Inbound":
                            mTimepointsList.add("Quincy Mall");
                            mTimepointsList.add("Quincy Walmart");
                            mTimepointsList.add("Malden Underpass");
                            mTimepointsList.add("Capitol Complex");
                            mTimepointsList.add("Laidley Transit Mall");
                            break;
                    }
                } else {
                    switch (mDirectionSelected) {
                        case "Outbound":
                            mTimepointsList.add("Laidley Transit Mall");
                            mTimepointsList.add("Capitol Complex");
                            mTimepointsList.add("Malden Underpass");
                            mTimepointsList.add("Quincy Mall");
                            mTimepointsList.add("Quincy Walmart");
                            break;
                        case "Inbound":
                            mTimepointsList.add("Quincy Walmart");
                            mTimepointsList.add("Quincy Mall");
                            mTimepointsList.add("Malden Underpass");
                            mTimepointsList.add("Capitol Complex");
                            mTimepointsList.add("Laidley Transit Mall");
                            break;
                    }
                }
                break;

            case "22M Montgomery":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Malden Underpass");
                        mTimepointsList.add("Quincy Walmart");
                        mTimepointsList.add("Quincy Mall");
                        mTimepointsList.add("Cedar Grove");
                        mTimepointsList.add("Montgomery");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Montgomery");
                        mTimepointsList.add("Cedar Grove");
                        mTimepointsList.add("Quincy Mall");
                        mTimepointsList.add("Quincy Walmart");
                        mTimepointsList.add("Malden Underpass");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "23 Clendenin":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Lilly St");
                        mTimepointsList.add("Dutch Rd");
                        mTimepointsList.add("Coopers Creek");
                        mTimepointsList.add("Frame Rd to Crossings Mall");
                        mTimepointsList.add("Crossings Mall");
                        mTimepointsList.add("Frame Rd from Crossings Mall");
                        mTimepointsList.add("Jordan Creek");
                        mTimepointsList.add("Clendenin");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Clendenin");
                        mTimepointsList.add("Jordan Creek");
                        mTimepointsList.add("Frame Rd to Crossings Mall");
                        mTimepointsList.add("Crossings Mall");
                        mTimepointsList.add("Frame Rd from Crossings Mall");
                        mTimepointsList.add("Coopers Creek");
                        mTimepointsList.add("Dutch Rd");
                        mTimepointsList.add("Lilly St");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "19 Charleston Loop/Trolley":
                mTimepointsList.add("Lee St at Maryland Ave (start route)");
                mTimepointsList.add("Laidley Transit Mall");
                mTimepointsList.add("Capitol Market (eastbound)");
                mTimepointsList.add("California Ave at Washington St");
                mTimepointsList.add("Quarrier St at Capitol St");
                mTimepointsList.add("Capitol Market (westbound)");
                mTimepointsList.add("Bigley Ave at Ash St");
                mTimepointsList.add("Lee St at Maryland Ave (end route)");
                break;

            default: mTimepointsList.add("Route data not complete");
        }

        String[] mTimepoints = new String[mTimepointsList.size()];

        for (int i = 0; i < mTimepoints.length; i++)
            mTimepoints[i] = mTimepointsList.get(i);

        return mTimepoints;
    }

}
