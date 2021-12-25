package fleming.david.com.quickkrtschedules;

import static fleming.david.com.quickkrtschedules.R.*;

import android.app.Activity;
import android.content.Context;
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

        final String[] routeItems = getResources().getStringArray(array.routes_arrays);

        LinearLayout linearLayout = findViewById(id.routesLayout);
        Context context = getApplicationContext();

        TextViewMenuCreation textViewMenuCreation = new TextViewMenuCreation();
        textViewMenuCreation.createMenu(routeItems, linearLayout, context);
    }
}
