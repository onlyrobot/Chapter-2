package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * 2019-07-12 15:29:55.864 10084-10084/chapter.android.aweme.ss.com.homework.new D/ActivityLifeCircle: onPause() called
 * 2019-07-12 15:29:55.867 10084-10084/chapter.android.aweme.ss.com.homework.new D/ActivityLifeCircle: onStop() called
 * 2019-07-12 15:29:55.868 10084-10084/chapter.android.aweme.ss.com.homework.new D/ActivityLifeCircle: onDestroy() called
 * 2019-07-12 15:29:55.905 10084-10084/chapter.android.aweme.ss.com.homework.new D/ActivityLifeCircle: onStart() called
 * 2019-07-12 15:29:55.915 10084-10084/chapter.android.aweme.ss.com.homework.new D/ActivityLifeCircle: onResume() called
 */
public class Exercises1 extends AppCompatActivity {

    private static final String TAG = "ActivityLifeCircle";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart() called");
    }
}
