# 底部导航栏BottomNavigation
> Android常用的底部导航栏,无需编写布局,一行代码添加即可
## 效果图
<div align=center><img width="150" height="150" src="https://github.com/keyejxptwn/BottomNavigation/blob/master/BottomNavigation.jpg"/></div>
## 使用方法
> 依赖
- maven
```maven
   <dependency>
	<groupId>com.keyejxptwn</groupId>
	<artifactId>BottomNavigation</artifactId>
	<version>1.0.0</version>
	<type>pom</type>
   </dependency>
```
- gradle
```gradle
   compile 'com.keyejxptwn:BottomNavigation:1.0.0'
```
> 代码使用
```java
    private void initBottomNavigation() {
        bottomBar.setOnCheckedChangeListener(this);
        bottomBar.setTextColor(R.color.colorPrimaryDark, R.color.colorAccent);
        bottomBar.addItem(getString(R.string.text_label1),R.drawable.icon_index_normal,R.drawable.icon_index_choose,"label1");
        bottomBar.addItem(getString(R.string.text_label2),R.drawable.icon_index_normal,R.drawable.icon_index_choose,"label1");
        bottomBar.addItem(getString(R.string.text_label3),R.drawable.icon_index_normal,R.drawable.icon_index_choose,"label1");
        bottomBar.addItem(getString(R.string.text_label4),R.drawable.icon_index_normal,R.drawable.icon_index_choose,"label1");
        bottomBar.setCurrentItem(currentPos);
    }

    @Override
    public void onChange(int index, String key) {
        currentPos = index;
    }
```
