package chapter.android.aweme.ss.com.homework;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import chapter.android.aweme.ss.com.homework.model.Message;
import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

import static chapter.android.aweme.ss.com.homework.model.PullParser.getMessage;

public class ListAdapter extends BaseAdapter {

    private List<Message> messages = new ArrayList<>();

    private Context mContext;

    public ListAdapter(Context context) {
        mContext = context;
        try {
            messages = getMessage((Activity) context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override public int getCount() {
        return messages.size();
    }

    @Override public Object getItem(int i) {
        return null;
    }

    @Override public long getItemId(int i) {
        return 0;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
//        TextView textView;
//        if (convertView == null) {
//            textView = new TextView(mContext);
//        } else {
//            textView = (TextView) convertView;
//        }
//
//        textView.setText(" " + args[position]);
//        textView.setTextSize(18);
//        return textView;

        View view;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.im_list_item, null);
            //Log.d("ListViewAdapter",
            //        "getView() called with: position = [" + position + "], convertView = [" + convertView + "], parent = [" +
            //                parent + "]");
        } else {
            //!=null
            view = convertView;
        }

        CircleImageView avatar = view.findViewById(R.id.iv_avatar);
        ImageView notice = view.findViewById(R.id.robot_notice);
        TextView title = view.findViewById(R.id.tv_title);
        TextView description = view.findViewById(R.id.tv_description);
        TextView time = view.findViewById(R.id.tv_time);

        title.setText(messages.get(position).getTitle());
        description.setText(messages.get(position).getDescription());
        time.setText(messages.get(position).getTime());
        if(messages.get(position).isOfficial()){
            notice.setVisibility(View.VISIBLE);
        }
        int icon_id = 0;
        switch (messages.get(position).getIcon()){
            case "TYPE_ROBOT": icon_id = R.drawable.session_robot; break;
            case "TYPE_GAME": icon_id = R.drawable.icon_micro_game_comment; break;
            case "TYPE_SYSTEM": icon_id = R.drawable.session_system_notice; break;
            case "TYPE_STRANGER": icon_id = R.drawable.session_stranger; break;
            case "TYPE_USER": icon_id = R.drawable.icon_girl; break;
            default: break;
        }
        avatar.setImageResource(icon_id);
        return view;
    }
}
