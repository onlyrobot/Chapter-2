package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises2);
        TextView textView = findViewById(R.id.textView);
        View view = LayoutInflater.from(this)
                .inflate(R.layout.im_list_item, null, false);
        textView.setText(getViewCount(view) + "");
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        if (!(view instanceof ViewGroup)) return 0;
        int child_count;
        int total_count = 0;
        total_count = child_count = ((ViewGroup) view).getChildCount();
        for (int i = 0; i < child_count; ++i)
        {
            total_count += getViewCount(((ViewGroup)view).getChildAt(i));
        }
        return total_count;
    }
}
