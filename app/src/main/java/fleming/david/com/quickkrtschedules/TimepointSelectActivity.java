package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;

public class TimepointSelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_timepoint_select);

        Intent intent = getIntent();

        final String routeSelected = intent.getStringExtra("routeSelected");
        final String daySelected = intent.getStringExtra("daySelected");
        final String directionSelected = intent.getStringExtra("directionSelected");

        TimepointsData timepointsData = new TimepointsData();

        String[] timepointsArray = timepointsData.getTimepoints(routeSelected,daySelected,directionSelected);

        LinearLayout layout = findViewById(R.id.TimepointLayout);

        for (final String desc : timepointsArray) {
            TextView textView = new TextView(this);
            textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setText(desc);
            layout.addView(textView);

            textView.setOnClickListener(v -> {
                Intent intent1 = new Intent(TimepointSelectActivity.this, KRTActivity.class);
                intent1.putExtra("routeSelected", routeSelected);
                intent1.putExtra("daySelected", daySelected);
                intent1.putExtra("directionSelected", directionSelected);
                intent1.putExtra("timepointSelected", desc);
                startActivity(intent1);
            });
        }
    }
}
