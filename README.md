# CircleProgressObjectAnimatorView
1.自定义View绘制圆弧进度条，通过ObjectAnimator对自定义View的progress从0-65增加<br/><br/>
2.使用PropertyValuesHolders.ofKeyframe() 把同一个属性拆分<br/><br/>

private void animator2(CircleProgressObjectAnimatorView circleProgressObjectAnimatorView) {<br/>
    // 在 0% 处开始<br/>
    Keyframe keyframe1 = Keyframe.ofFloat(0, 0);<br/>
    // 时间经过 50% 的时候，动画完成度 100%<br/>
    Keyframe keyframe2 = Keyframe.ofFloat(0.5f, 100);<br/>
    // 时间见过 100% 的时候，动画完成度倒退到 80%，即反弹 20%<br/>
    Keyframe keyframe3 = Keyframe.ofFloat(1, 80);<br/>
    PropertyValuesHolder holder = PropertyValuesHolder.ofKeyframe("progress", keyframe1, keyframe2, keyframe3);<br/>
    ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(circleProgressObjectAnimatorView, holder);<br/>
    animator.start();<br/>
}<br/><br/>

<!-- ![Image text](https://raw.githubusercontent.com/xqgdmg/CircleProgressObjectAnimatorView/master/img/Screenshot_20180615-110310.png) -->
<img src="https://raw.githubusercontent.com/xqgdmg/CircleProgressObjectAnimatorView/master/img/Screenshot_20180615-110310.png" width="320" height="480" alt="图片描述文字"/>
