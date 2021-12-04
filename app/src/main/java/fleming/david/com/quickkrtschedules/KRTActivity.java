package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class KRTActivity extends Activity {

        private String[] listOfTimes;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        TextView separatorText = findViewById(R.id.seperatorMessage);

        Button buttonRoute = findViewById(R.id.buttonRoute);
        Button buttonDay = findViewById(R.id.buttonDay);
        Button buttonDirection = findViewById(R.id.buttonDirection);
        Button buttonTimepoint = findViewById(R.id.buttonTimepoint);

        //Set up route button.
        if (intent.hasExtra("routeSelected")) {
            buttonRoute.setText(intent.getStringExtra("routeSelected"));
        } else {
            buttonRoute.setText(getString(R.string.no_route));
            currentSelectButton(buttonRoute);
        }

        buttonRoute.setOnClickListener(v -> {
            Intent intentRouteSelect = new Intent(KRTActivity.this, RouteSelectActivity.class);
            startActivity(intentRouteSelect);
        });

        //Set up day button
        if (intent.hasExtra("routeSelected")) {

            if (intent.hasExtra("daySelected")) {
                buttonDay.setText(intent.getStringExtra("daySelected"));
            } else {
                buttonDay.setText(getString(R.string.no_day));
                currentSelectButton(buttonDay);
            }

            buttonDay.setOnClickListener(v -> {

                final String mRoute = intent.getStringExtra("routeSelected");

                Intent intent12 = new Intent(KRTActivity.this, DaySelectActivity.class);
                intent12.putExtra("routeSelected", mRoute);
                startActivity(intent12);
            });

        } else {
            buttonDay.setEnabled(false);
            buttonDay.setText(getString(R.string.route_first));
            selectPreviousFirst(buttonDay);
        }

        //Set up direction button
        if (intent.hasExtra("daySelected")) {

            if (intent.hasExtra("directionSelected")) {
                buttonDirection.setText(intent.getStringExtra("directionSelected"));
            } else {
                buttonDirection.setText(getString(R.string.no_direction));
                currentSelectButton(buttonDirection);
            }

            buttonDirection.setOnClickListener(v -> {

                final String mRoute = intent.getStringExtra("routeSelected");
                final String mDay = intent.getStringExtra("daySelected");

                Intent intent14 = new Intent(KRTActivity.this, DirectionSelectActivity.class);
                intent14.putExtra("routeSelected", mRoute);
                intent14.putExtra("daySelected", mDay);
                startActivity(intent14);
            });

        } else {
            buttonDirection.setEnabled(false);
            buttonDirection.setText(getString(R.string.day_first));
            selectPreviousFirst(buttonDirection);
        }

        //Set up timepoint button
        if (intent.hasExtra("directionSelected")) {

            if (intent.hasExtra("timepointSelected")) {
                buttonTimepoint.setText(intent.getStringExtra("timepointSelected"));
            } else {
                buttonTimepoint.setText(getString(R.string.no_timepoint));
                currentSelectButton(buttonTimepoint);
            }

            buttonTimepoint.setOnClickListener(v -> {

                final String mRoute = intent.getStringExtra("routeSelected");
                final String mDay = intent.getStringExtra("daySelected");
                final String mDirection = intent.getStringExtra("directionSelected");

                Intent intent13 = new Intent(KRTActivity.this, TimepointSelectActivity.class);
                intent13.putExtra("routeSelected", mRoute);
                intent13.putExtra("daySelected", mDay);
                intent13.putExtra("directionSelected", mDirection);
                startActivity(intent13);
            });
        } else {
            buttonTimepoint.setEnabled(false);
            buttonTimepoint.setText(getString(R.string.direction_first));
            selectPreviousFirst(buttonTimepoint);
        }

        if (intent.hasExtra("timepointSelected")) {

            final String mRoute = intent.getStringExtra("routeSelected");
            final String mDay = intent.getStringExtra("daySelected");
            final String mDirection = intent.getStringExtra("directionSelected");
            final String mTimepoint = intent.getStringExtra("timepointSelected");

            switch (mRoute) {
                case "1SA St Albans":
                    Rt1SAData rt1SAData = new Rt1SAData();
                    listOfTimes = rt1SAData.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "1WC West Charleston":
                    Rt1WCData rt1WCData = new Rt1WCData();
                    listOfTimes = rt1WCData.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "2CC Cabin Creek":
                    Rt2CCData rt2CCData = new Rt2CCData();
                    listOfTimes = rt2CCData.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "2KC Kanawha City":
                    Rt2KCData rt2KCData = new Rt2KCData();
                    listOfTimes = rt2KCData.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "3N Nitro":
                    Rt3NData rt3NData = new Rt3NData();
                    listOfTimes = rt3NData.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "3I Institute/WVSU":
                    Rt3IData rt3IData = new Rt3IData();
                    listOfTimes = rt3IData.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "5 Tyler Mtn/Cross Lanes":
                    Rt5Data rt5Data = new Rt5Data();
                    listOfTimes = rt5Data.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "6 Elkview":
                    Rt6Data rt6Data = new Rt6Data();
                    listOfTimes = rt6Data.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "7 Campbells Creek":
                    Rt7Data rt7Data = new Rt7Data();
                    listOfTimes = rt7Data.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "8 Sissonville":
                    Rt8Data rt8Data = new Rt8Data();
                    listOfTimes = rt8Data.getTimes(mDay, mDirection, mTimepoint);
                    break;
                case "10 Northgate/Hillcrest Drive":
                    listOfTimes = ItemLoader.getTimes10(mDay, mDirection, mTimepoint);
                    break;
                case "11 Wertz Avenue":
                    listOfTimes = ItemLoader.getTimes11(mDay, mDirection, mTimepoint);
                    break;
                case "13 Beech Avenue":
                    listOfTimes = ItemLoader.getTimes13(mDay, mDirection, mTimepoint);
                    break;
                case "14 City Park":
                    listOfTimes = ItemLoader.getTimes14(mDay, mDirection, mTimepoint);
                    break;
                case "15 South Hills":
                    listOfTimes = ItemLoader.getTimes15(mDay, mDirection, mTimepoint);
                    break;
                case "16 South Park":
                    listOfTimes = ItemLoader.getTimes16(mDay, mDirection, mTimepoint);
                    break;
                case "17 South Side":
                    listOfTimes = ItemLoader.getTimes17(mDay, mDirection, mTimepoint);
                    break;
                case "18 Fort Hill/Montrose":
                    listOfTimes = ItemLoader.getTimes18(mDay, mDirection, mTimepoint);
                    break;
                case "19 Charleston Loop/Trolley":
                    listOfTimes = ItemLoader.getTimes19(mDay, mDirection, mTimepoint);
                    break;
                case "20 Virginia St/Capitol Complex":
                    listOfTimes = ItemLoader.getTimes20(mDay, mDirection, mTimepoint);
                    break;
                case "21 Southridge/Trace Fork/Dudley Farms":
                    listOfTimes = ItemLoader.getTimes21(mDay, mDirection, mTimepoint);
                    break;
                case "22M Montgomery":
                    listOfTimes = ItemLoader.getTimes22M(mDay, mDirection, mTimepoint);
                    break;
                case "22Q Quincy Mall":
                    listOfTimes = ItemLoader.getTimes22Q(mDay, mDirection, mTimepoint);
                    break;
                case "23 Clendenin":
                    listOfTimes = ItemLoader.getTimes23(mDay, mDirection, mTimepoint);
                    break;
            }

            separatorText.setText(getString(R.string.select_timepoint));

            String mDash = "-";
            Boolean stringCompare;

            LinearLayout layout = findViewById(R.id.mainLayout);

            int i = -1;

            for (final String desc : listOfTimes) {
                i = i + 1;
                stringCompare = desc.equals(mDash);
                if (!stringCompare) {
                    Button newBtn = new Button(this);
                    newBtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                    newBtn.setText(desc);
                    layout.addView(newBtn);

                    final int timeSlotSelected = i;

                    newBtn.setOnClickListener(v -> {
                        Intent intent15 = new Intent(KRTActivity.this, ListEntireTripActivity.class);
                        intent15.putExtra("routeSelected", mRoute);
                        intent15.putExtra("daySelected", mDay);
                        intent15.putExtra("directionSelected", mDirection);
                        intent15.putExtra("timeSlotSelected", timeSlotSelected);
                        intent15.putExtra("timepointSelected", mTimepoint);
                        startActivity(intent15);
                    });
                }
            }
        } else {
            separatorText.setText(getString(R.string.select_all));
        }
    }
    private void currentSelectButton(Button mButton){
        mButton.setBackgroundColor(Color.YELLOW);
        mButton.setTextColor(Color.BLACK);
    }
    private void selectPreviousFirst(Button mButton){
        mButton.setTextColor(Color.RED);
    }
}