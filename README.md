# 底部导航栏BottomNavigation
> Android常用的底部导航栏,无需编写布局,一行代码添加即可
## 效果图
<div align=center><img width="216" height="444" src="https://github.com/keyejxptwn/BottomNavigation/blob/master/BottomNavigation.jpg"/></div>

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
   implementation 'com.keyejxptwn:BottomNavigation:1.0.0'
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
## License
>  Copyright [keyejxptwn]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
