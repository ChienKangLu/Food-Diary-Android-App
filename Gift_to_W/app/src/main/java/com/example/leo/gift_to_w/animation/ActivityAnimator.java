package com.example.leo.gift_to_w.animation;



import android.app.Activity;

import com.example.leo.gift_to_w.R;


public class ActivityAnimator
{
	public void flipHorizontalAnimation(Activity a)
	{
		a.overridePendingTransition(R.anim.flip_horizontal_in, R.anim.flip_horizontal_out);
	}
	
	public void flipVerticalAnimation(Activity a)
	{
		a.overridePendingTransition(R.anim.flip_vertical_in, R.anim.flip_vertical_out);
	}
	
	public void fadeAnimation(Activity a)
	{
		a.overridePendingTransition(R.anim.fade_in_l, R.anim.fade_out);
	}
	
	public void disappearTopLeftAnimation(Activity a)
	{
		a.overridePendingTransition(R.anim.disappear_top_left_in, R.anim.disappear_top_left_out);
	}
	
	public void appearTopLeftAnimation(Activity a)
	{
		a.overridePendingTransition(R.anim.appear_top_left_in, R.anim.appear_top_left_out);
	}
	
	public void disappearBottomRightAnimation(Activity a)
	{
		a.overridePendingTransition(R.anim.disappear_bottom_right_in, R.anim.disappear_bottom_right_out);
	}
	
	public void appearBottomRightAnimation(Activity a)
	{
		a.overridePendingTransition(R.anim.appear_bottom_right_in, R.anim.appear_bottom_right_out);
	}
	
	public void unzoomAnimation(Activity a)
	{
		a.overridePendingTransition(R.anim.unzoom_in, R.anim.unzoom_out);
	}
    
    public void PullRightPushLeft(Activity a)
    {
        a.overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
    }

	public void down_to_top(Activity a)
	{
		a.overridePendingTransition(R.anim.slide_in_up, R.anim.fade_out_noaction);
	}

	public void top_to_down(Activity a)
	{
		a.overridePendingTransition(R.anim.fade_out_noaction,R.anim.slide_down);//R.anim.fade_in
	}
	public void myPullRightPushLeft(Activity a)
	{
		a.overridePendingTransition(R.anim.pull_in_right, R.anim.fade_out_noaction);
	}

}
