package com.keyejxptwn.bottomnavigationlib;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;


/**
 * 导航条ITEM
 *
 * @author keyejxptwn
 */
public class BottomBarItem extends LinearLayout {

    private ImageView iv_icon;
    private ImageView iv_hint;
    private TextView tv_name;
    private String key;

    private boolean mChecked = false;
    private int defaultTextColor;
    private int checkedTextColor;
    private int defaultImageRes;
    private int checkedImageRes;
    private TextView tv_hint;
    private View tv_sp;

    public BottomBarItem(Context context) {
        super(context);
        init();
    }

    private void init() {
        View.inflate(getContext(), R.layout.view_bottom_bar_item, this);
        iv_icon = (ImageView) findViewById(R.id.iv_icon);
        iv_hint = (ImageView) findViewById(R.id.iv_hint);
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_hint = (TextView) findViewById(R.id.tv_hint);
        tv_sp = (View) findViewById(R.id.tv_sp);
        hideHint();
    }

    public void setIcon(int resId) {
        iv_icon.setImageResource(resId);
    }

    public void setText(String text) {
        tv_name.setText(text);
    }

    public void setTextColor(int color) {
        tv_name.setTextColor(color);
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    /**
     * 显示提示数量
     *
     * @param number
     */
    public void setHintNum(int number) {
        String hint = String.valueOf(number);
        if (number <= 0) {
            tv_hint.setVisibility(View.INVISIBLE);
            return;
        } else if (number > 99) {
            hint = "99+";
        }
        tv_hint.setVisibility(View.VISIBLE);
        tv_hint.setText(hint);
    }

    /**
     * 显示红点
     */
    public void showHintPoint() {
        iv_hint.setVisibility(View.VISIBLE);
    }

    /**
     * 隐藏红点
     */
    public void hideHint() {
        tv_hint.setVisibility(View.INVISIBLE);
        iv_hint.setVisibility(View.INVISIBLE);
    }

    /**
     * 设置资源
     *
     * @param defaultTextColor
     * @param checkedTextColor
     * @param defaultImageRes
     * @param checkedImageRes
     */
    public void setRes(@ColorInt int defaultTextColor, @ColorInt int checkedTextColor,
                       @DrawableRes int defaultImageRes, @DrawableRes int checkedImageRes) {
        this.defaultTextColor = defaultTextColor;
        this.checkedTextColor = checkedTextColor;
        this.defaultImageRes = defaultImageRes;
        this.checkedImageRes = checkedImageRes;
        freshView();
    }

    private void freshView() {
        if (mChecked) {
            setTextColor(checkedTextColor);
            setIcon(checkedImageRes);
        } else {
            setTextColor(defaultTextColor);
            setIcon(defaultImageRes);
        }
    }

    /**
     * 设置是否选中
     *
     * @param check
     */
    public void setChecked(boolean check) {
        mChecked = check;
        freshView();
    }

    /**
     * 设置分割线是否显示
     *
     * @param isShow
     */
    public void isShowSplitLine(Boolean isShow) {
        tv_sp.setVisibility(isShow ? View.VISIBLE : View.INVISIBLE);
    }


}
