package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;

public class DirectionSelectActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    protected void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_direction_select);

        Intent intent = getIntent();

        final String routeSelected = intent.getStringExtra("routeSelected");
        final String daySelected = intent.getStringExtra("daySelected");

        DirectionsData directionsData = new DirectionsData();

        String[] directionsArray = directionsData.getDirections(routeSelected);

        LinearLayout layout = findViewById(R.id.DirectionLayout);

        for (final String desc : directionsArray) {
            TextView textView = new TextView(this);
            textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setText(desc);
            layout.addView(textView);

            textView.setOnClickListener(v -> {
                Intent intent1 = new Intent(DirectionSelectActivity.this, KRTActivity.class);
                intent1.putExtra("routeSelected", routeSelected);
                intent1.putExtra("daySelected", daySelected);
                intent1.putExtra("directionSelected", desc);
                startActivity(intent1);
            });
        }
    }
}
