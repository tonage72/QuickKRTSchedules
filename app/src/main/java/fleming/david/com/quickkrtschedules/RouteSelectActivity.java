package fleming.david.com.quickkrtschedules;

import static fleming.david.com.quickkrtschedules.R.*;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout.LayoutParams;
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
        setContentView(layout.activity_route_select);

        final String[] routeItems = getResources().getStringArray(array.routes_arrays);

        //convert resources to programmable values
        int textSizePixels = 20;
        int paddingLeft = getResources().getDimensionPixelSize(dimen.menuItemsPadStart);
        int paddingRight = getResources().getDimensionPixelSize(dimen.menuItemsPadEnd);
        int marginTop = getResources().getDimensionPixelSize(dimen.menuitemsmarginabove);

        LinearLayout layout = findViewById(id.RoutesLayout);

        for (final String desc : routeItems) {
            TextView textView = new TextView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            params.setMargins(0,marginTop,0,0);
            textView.setLayoutParams(params);
            textView.setBackgroundResource(drawable.rounded_corner_menu_items);
            textView.setTextColor(Color.parseColor("#FF03DAC5"));
            textView.setPadding(paddingLeft,0, paddingRight,0);
            textView.setTextSize(textSizePixels);
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
