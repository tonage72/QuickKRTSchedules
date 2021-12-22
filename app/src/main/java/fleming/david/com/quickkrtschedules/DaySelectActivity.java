package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;

public class DaySelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_day_select);

        Intent intent = getIntent();

        final String routeSelected = intent.getStringExtra("routeSelected");

        DaysData daysData = new DaysData();

        String[] daysArray = daysData.getDays(routeSelected);

        LinearLayout layout = findViewById(R.id.DaysLayout);

        for (final String desc : daysArray) {
            TextView textView = new TextView(this);
            textView.setText(desc);
            layout.addView(textView);

            textView.setOnClickListener(v -> {
                Intent intent1 = new Intent(DaySelectActivity.this, KRTActivity.class);
                intent1.putExtra("routeSelected", routeSelected);
                intent1.putExtra("daySelected", desc);
                startActivity(intent1);
            });
        }
    }
}