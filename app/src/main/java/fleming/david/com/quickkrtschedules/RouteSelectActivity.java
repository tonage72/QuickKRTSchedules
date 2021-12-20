package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;

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
        setContentView(R.layout.activity_route_select);

        final String[] routeItems = getResources().getStringArray(R.array.routes_arrays);

        LinearLayout layout = findViewById(R.id.RoutesLayout);

        for (final String desc : routeItems) {
            TextView textView = new TextView(this);
            textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setText(desc);
            layout.addView(textView);

            textView.setOnClickListener(v -> {
                Intent intent = new Intent(RouteSelectActivity.this, KRTActivity.class);
                intent.putExtra("routeSelected", desc);
                startActivity(intent);
            });
        }
    }
}
