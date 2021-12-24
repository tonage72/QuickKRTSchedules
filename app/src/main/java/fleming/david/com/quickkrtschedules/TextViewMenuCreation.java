package fleming.david.com.quickkrtschedules;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextViewMenuCreation extends Activity {

    protected void createMenu(String[] menuItems, LinearLayout linearLayout, Context context) {

        int textSizePixels = 20;
        int paddingLeft = context.getResources().getDimensionPixelSize(R.dimen.menuItemsPadStart);
        int paddingRight = context.getResources().getDimensionPixelSize(R.dimen.menuItemsPadEnd);
        int marginTop = context.getResources().getDimensionPixelSize(R.dimen.menuitemsmarginabove);

        for (final String desc : menuItems) {
            TextView textView = new TextView(context);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(0,marginTop,0,0);
            textView.setLayoutParams(params);
            textView.setBackgroundResource(R.drawable.rounded_corner_menu_items);
            textView.setTextColor(Color.parseColor("#FF03DAC5"));
            textView.setPadding(paddingLeft,0, paddingRight,0);
            textView.setTextSize(textSizePixels);
            textView.setText(desc);
            linearLayout.addView(textView);

            textView.setOnClickListener(v -> {
                Intent intent = new Intent(context, KRTActivity.class);
                intent.putExtra("routeSelected", desc);
                context.startActivity(intent);
            });
        }
    }

}
