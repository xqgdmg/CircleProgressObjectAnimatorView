package dmg.xqg.com.myapplication;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CircleProgressObjectAnimatorView circleProgressObjectAnimatorView = (CircleProgressObjectAnimatorView) findViewById(R.id.circleProgressObjectAnimatorView);
        final TextView textView = (TextView) findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建 ObjectAnimator 对象
                // circleProgressObjectAnimatorView 的 progress 属性从 0 变化到 65
                ObjectAnimator animator = ObjectAnimator.ofFloat(circleProgressObjectAnimatorView, "progress", 0, 65);
                // 执行动画
                animator.start();
            }
        });
    }
}
