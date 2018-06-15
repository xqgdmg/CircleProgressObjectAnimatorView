package dmg.xqg.com.myapplication;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CircleProgressObjectAnimatorView circleProgressObjectAnimatorView01 = (CircleProgressObjectAnimatorView) findViewById(R.id.circleProgressObjectAnimatorView01);
        final CircleProgressObjectAnimatorView circleProgressObjectAnimatorView02 = (CircleProgressObjectAnimatorView) findViewById(R.id.circleProgressObjectAnimatorView02);
        final TextView textView = (TextView) findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animator1(circleProgressObjectAnimatorView01);
                animator2(circleProgressObjectAnimatorView02);

            }
        });
    }

    private void animator2(CircleProgressObjectAnimatorView circleProgressObjectAnimatorView) {
        // 在 0% 处开始
        Keyframe keyframe1 = Keyframe.ofFloat(0, 0);
        // 时间经过 50% 的时候，动画完成度 100%
        Keyframe keyframe2 = Keyframe.ofFloat(0.5f, 100);
        // 时间见过 100% 的时候，动画完成度倒退到 80%，即反弹 20%
        Keyframe keyframe3 = Keyframe.ofFloat(1, 80);
        PropertyValuesHolder holder = PropertyValuesHolder.ofKeyframe("progress", keyframe1, keyframe2, keyframe3);

        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(circleProgressObjectAnimatorView, holder);
        animator.start();
    }

    private void animator1(CircleProgressObjectAnimatorView circleProgressObjectAnimatorView) {
        // 创建 ObjectAnimator 对象
        // circleProgressObjectAnimatorView 的 progress 属性从 0 变化到 65
        ObjectAnimator animator = ObjectAnimator.ofFloat(circleProgressObjectAnimatorView, "progress", 0, 65);
        // 执行动画
        animator.start();
    }
}
