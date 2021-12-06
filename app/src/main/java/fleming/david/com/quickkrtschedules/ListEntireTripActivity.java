package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ListEntireTripActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        setContentView(R.layout.activity_trip_select);

        Intent intent = getIntent();

        TextView textView = findViewById(R.id.TripTextView);

        Button buttonBack = findViewById(R.id.buttonBack);

        final String mRoute = intent.getStringExtra("routeSelected");
        final String mDay = intent.getStringExtra("daySelected");
        final String mDirection = intent.getStringExtra("directionSelected");
        final String mTimepointToReturn = intent.getStringExtra("timepointSelected");
        final int mTimeSlotSelected = intent.getIntExtra("timeSlotSelected", 0);


        buttonBack.setText(getString(R.string.go_back));
        buttonBack.setOnClickListener(v -> {
            Intent intent1 = new Intent(ListEntireTripActivity.this, KRTActivity.class);
            intent1.putExtra("routeSelected", mRoute);
            intent1.putExtra("daySelected", mDay);
            intent1.putExtra("directionSelected", mDirection);
            intent1.putExtra("timepointSelected", mTimepointToReturn);
            startActivity(intent1);
        });

        TimepointsData timepointsData = new TimepointsData();
        final String[] timepointsArray = timepointsData.getTimepoints(mRoute,mDay,mDirection);

        String[] listOfTimes;

        textView.setText("");

        for (String mTimepoint:timepointsArray) {
            textView.append(mTimepoint+"\n");
            switch (mRoute) {
                case "1SA St Albans":
                    Rt1SAData rt1SAData = new Rt1SAData();
                    listOfTimes = rt1SAData.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "1WC West Charleston":
                    Rt1WCData rt1WCData = new Rt1WCData();
                    listOfTimes = rt1WCData.getTimes (mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "2CC Cabin Creek":
                    Rt2CCData rt2CCData = new Rt2CCData();
                    listOfTimes = rt2CCData.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "2KC Kanawha City":
                    Rt2KCData rt2KCData = new Rt2KCData();
                    listOfTimes = rt2KCData.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "3N Nitro":
                    Rt3NData rt3NData = new Rt3NData();
                    listOfTimes = rt3NData.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "3I Institute/WVSU":
                    Rt3IData rt3IData = new Rt3IData();
                    listOfTimes = rt3IData.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "5 Tyler Mtn/Cross Lanes":
                    Rt5Data rt5Data = new Rt5Data();
                    listOfTimes = rt5Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "6 Elkview":
                    Rt6Data rt6Data = new Rt6Data();
                    listOfTimes = rt6Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "7 Campbells Creek":
                    Rt7Data rt7Data = new Rt7Data();
                    listOfTimes = rt7Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "8 Sissonville":
                    Rt8Data rt8Data = new Rt8Data();
                    listOfTimes = rt8Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "10 Northgate/Hillcrest Drive":
                    Rt10Data rt10Data = new Rt10Data();
                    listOfTimes = rt10Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "11 Wertz Avenue":
                    Rt11Data rt11Data = new Rt11Data();
                    listOfTimes = rt11Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "13 Beech Avenue":
                    Rt13Data rt13Data = new Rt13Data();
                    listOfTimes = rt13Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "14 City Park":
                    Rt14Data rt14Data = new Rt14Data();
                    listOfTimes = rt14Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "15 South Hills":
                    Rt15Data rt15Data = new Rt15Data();
                    listOfTimes = rt15Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "16 South Park":
                    Rt16Data rt16Data = new Rt16Data();
                    listOfTimes = rt16Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "17 South Side":
                    Rt17Data rt17Data = new Rt17Data();
                    listOfTimes = rt17Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "18 Fort Hill/Montrose":
                    Rt18Data rt18Data = new Rt18Data();
                    listOfTimes = rt18Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "19 Charleston Loop/Trolley":
                    Rt19Data rt19Data = new Rt19Data();
                    listOfTimes = rt19Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "20 Virginia St/Capitol Complex":
                    Rt20Data rt20Data = new Rt20Data();
                    listOfTimes = rt20Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "21 Southridge/Trace Fork/Dudley Farms":
                    Rt21Data rt21Data = new Rt21Data();
                    listOfTimes = rt21Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "22M Montgomery":
                    Rt22MData rt22MData = new Rt22MData();
                    listOfTimes = rt22MData.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "22Q Quincy Mall":
                    Rt22QData rt22QData = new Rt22QData();
                    listOfTimes = rt22QData.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "23 Clendenin":
                    Rt23Data rt23Data = new Rt23Data();
                    listOfTimes = rt23Data.getTimes(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
            }
        }
    }
}
