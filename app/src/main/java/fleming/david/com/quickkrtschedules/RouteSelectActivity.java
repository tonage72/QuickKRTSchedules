package fleming.david.com.quickkrtschedules;

import static fleming.david.com.quickkrtschedules.R.*;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RouteSelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(layout.activity_route_select);
        final String[] menuItems = getResources().getStringArray(array.routes_arrays);
        LinearLayout linearLayout = findViewById(id.routesLayout);
        Context context = getApplicationContext();
        TextViewMenuCreation textViewMenuCreation = new TextViewMenuCreation();

        for (final String desc : menuItems) {
            TextView textView = textViewMenuCreation.createMenu(context, desc);
            linearLayout.addView(textView);
            textView.setOnClickListener(v -> {
                Intent intent = new Intent(this, KRTActivity.class);
                intent.putExtra("routeSelected", desc);
                startActivity(intent);
            });
        }
    }
}
