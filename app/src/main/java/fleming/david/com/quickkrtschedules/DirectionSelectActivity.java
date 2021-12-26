package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Context;
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
        Intent importedIntent = getIntent();
        final String routeSelected = importedIntent.getStringExtra("routeSelected");
        final String daySelected = importedIntent.getStringExtra("daySelected");
        DirectionsData directionsData = new DirectionsData();
        String[] menuItems = directionsData.getDirections(routeSelected);
        LinearLayout linearLayout = findViewById(R.id.DirectionLayout);
        Context context = getApplicationContext();
        TextViewMenuCreation textViewMenuCreation = new TextViewMenuCreation();


        for (final String desc : menuItems) {
            TextView textView = textViewMenuCreation.createMenu(context, desc);
            linearLayout.addView(textView);

            textView.setOnClickListener(v -> {
                Intent intent = new Intent(DirectionSelectActivity.this, KRTActivity.class);
                intent.putExtra("routeSelected", routeSelected);
                intent.putExtra("daySelected", daySelected);
                intent.putExtra("directionSelected", desc);
                startActivity(intent);
            });
        }
    }
}
