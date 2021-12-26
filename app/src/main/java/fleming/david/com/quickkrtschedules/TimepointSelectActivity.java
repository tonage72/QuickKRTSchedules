package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Context;
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
        Intent Importedintent = getIntent();
        final String routeSelected = Importedintent.getStringExtra("routeSelected");
        final String daySelected = Importedintent.getStringExtra("daySelected");
        final String directionSelected = Importedintent.getStringExtra("directionSelected");
        TimepointsData timepointsData = new TimepointsData();
        String[] timepointsArray = timepointsData.getTimepoints(routeSelected,daySelected,directionSelected);
        LinearLayout linearLayout = findViewById(R.id.TimepointLayout);
        Context context = getApplicationContext();
        TextViewMenuCreation textViewMenuCreation = new TextViewMenuCreation();

        for (final String desc : timepointsArray) {
            TextView textView = textViewMenuCreation.createMenu(context, desc);
            linearLayout.addView(textView);

            textView.setOnClickListener(v -> {
                Intent intent = new Intent(TimepointSelectActivity.this, KRTActivity.class);
                intent.putExtra("routeSelected", routeSelected);
                intent.putExtra("daySelected", daySelected);
                intent.putExtra("directionSelected", directionSelected);
                intent.putExtra("timepointSelected", desc);
                startActivity(intent);
            });
        }
    }
}
