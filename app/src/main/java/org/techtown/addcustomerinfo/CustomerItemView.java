package org.techtown.addcustomerinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomerItemView extends LinearLayout {
    TextView nameTextView, dayTextView, phoneTextView;

    public CustomerItemView(Context context) {
        super(context);
        init(context);
    }

    public CustomerItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.customer_item, this, true);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        dayTextView = (TextView) findViewById(R.id.dayTextView);
        phoneTextView = (TextView) findViewById(R.id.phoneTextView);
    }

    public void setName(String name) {
        nameTextView.setText(name);
    }

    public void setDay(String day) {
        dayTextView.setText(day);
    }

    public void setPhone(String phone) {
        phoneTextView.setText(phone);
    }
}
