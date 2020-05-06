package org.techtown.addcustomerinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, dayEditText, phoneEditText;
    Button addButton;
    ListView listView;
    CustomerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        dayEditText = (EditText) findViewById(R.id.dayEditText);
        phoneEditText = (EditText) findViewById(R.id.phoneEditText);
        addButton = (Button) findViewById(R.id.addButton);
        listView = (ListView) findViewById(R.id.listView);

        adapter = new CustomerAdapter();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                adapter.addItem(new CustomerItem(nameEditText.getText().toString(),
                        dayEditText.getText().toString(), phoneEditText.getText().toString()));

                listView.setAdapter(adapter);

                adapter.notifyDataSetChanged();
            }
        });
    }

    class CustomerAdapter extends BaseAdapter {
        ArrayList<CustomerItem> items = new ArrayList<CustomerItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(CustomerItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            CustomerItemView view = new CustomerItemView(getApplicationContext());
            CustomerItem item = items.get(position);
            view.setName(item.getName());
            view.setDay(item.getDay());
            view.setPhone(item.getPhone());

            return view;
        }
    }
}
