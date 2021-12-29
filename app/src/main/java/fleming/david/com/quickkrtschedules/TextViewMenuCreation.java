package fleming.david.com.quickkrtschedules;

import static fleming.david.com.quickkrtschedules.R.*;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextViewMenuCreation extends Activity {

    protected TextView createMenu(Context context, String desc) {

        int paddingLeft = context.getResources().getDimensionPixelSize(dimen.menuItemsPadStart);
        int paddingRight = context.getResources().getDimensionPixelSize(dimen.menuItemsPadEnd);
        int paddingTop = context.getResources().getDimensionPixelSize(dimen.menuItemsPadTop);
        int paddingBottom = context.getResources().getDimensionPixelSize(dimen.menuItemsPadBottom);
        int marginTop = context.getResources().getDimensionPixelSize(dimen.menuitemsmarginabove);
        int marginStart = context.getResources().getDimensionPixelSize(dimen.menuItemsMarginStart);
        int marginEnd = context.getResources().getDimensionPixelSize(dimen.menuItemsMarginEnd);
        String textColor = context.getString(color.teal_200);

            TextView textView = new TextView(context);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(marginStart, marginTop, marginEnd,0);
            textView.setLayoutParams(params);
            textView.setBackgroundResource(drawable.rounded_corner_menu_items);
            textView.setTextColor(Color.parseColor(textColor));
            textView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimensionPixelSize(dimen.menutextsize));
            textView.setText(desc);

            return textView;
      }
}
