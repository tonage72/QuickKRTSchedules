package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Context;
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
        Intent importedIntent = getIntent();
        final String routeSelected = importedIntent.getStringExtra("routeSelected");
        DaysData daysData = new DaysData();
        String[] menuItems = daysData.getDays(routeSelected);
        LinearLayout linearLayout = findViewById(R.id.DaysLayout);
        Context context = getApplicationContext();
        TextViewMenuCreation textViewMenuCreation = new TextViewMenuCreation();

        for (final String desc : menuItems) {
            TextView textView = textViewMenuCreation.createMenu(context, desc);
            linearLayout.addView(textView);

            textView.setOnClickListener(v -> {
                Intent intent = new Intent(DaySelectActivity.this, KRTActivity.class);
                intent.putExtra("routeSelected", routeSelected);
                intent.putExtra("daySelected", desc);
                startActivity(intent);
            });
        }
    }
}