package com.uniquestudio.materialcheckbox;

/**
 * Created by mohsen on 1/17/2017.
 */

    import android.app.Activity;
    import android.content.Context;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.BaseAdapter;
    import android.widget.TextView;

    import com.uniquestudio.library.CircleCheckBox;

    import java.util.List;

public class CustomAdapter extends BaseAdapter {
        private Activity activity;
        private LayoutInflater inflater;
        private List<String> movieItems;

        public CustomAdapter(Activity activity, List<String> movieItems) {
            this.activity = activity;
            this.movieItems = movieItems;
        }

        @Override
        public int getCount() {
            return movieItems.size();
        }

        @Override
        public Object getItem(int location) {
            return movieItems.get(location);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (inflater == null)
                inflater = (LayoutInflater) activity
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (convertView == null)
                convertView = inflater.inflate(R.layout.row, null);

            TextView title = (TextView) convertView.findViewById(R.id.tv);
            String m = movieItems.get(position);
            final CircleCheckBox checkBox = (CircleCheckBox) convertView.findViewById(R.id.circle_check_box);
            // title
            title.setText(m);
            checkBox.setListener(new CircleCheckBox.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(boolean isChecked) {
                    // do something
                    checkBox.setChecked(true);
                }
            });


            return convertView;
        }

    }