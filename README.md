# important（重要修改）
maven 地址修改为：
url "https://pandaq.bintray.com/maven"
``` gradle
allprojects {
    repositories {
        jcenter()
        maven{
            url  "http://dl.bintray.com/huxinyu/maven"
        }
    }
}
```
# LoopScale
This is a loop scale view like this:

![sample][1]
-------------------
## FixBugs
1.0.1 版本修复了 1.0.0 版本中快速滑动 value 更新出错的 bug
## import/引入

**if your network is terrible，maybe you cannot download this lib**

project's build.gradle (工程的 build.gradle)

``` gradle
allprojects {
    repositories {
        jcenter()
        maven{
            url  "http://dl.bintray.com/huxinyu/maven"
        }
    }
}
```

module's build.gradle (模块的build.gradle)

``` gradle
dependencies {
    compile 'com.pandaq:loopscale:1.0.1'
}
```

## Usage/用法

you can use it like this：
``` xml
    <com.pandaq.loopscaleview.LoopScaleView
        android:id="@+id/lsv_4"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_margin="8dp"
        android:background="@drawable/loopscaleview_bg"
        android:padding="8dp"
        app:cursorColor="@color/colorAccent"
        app:maxShowItem="4"
        app:maxValue="1000"
        app:oneItemValue="5"
        app:scaleTextColor="@color/colorPrimary"/>
```
you can set attributes in both xml file and java file

-----------------------


##License

```
Copyright 2017 PandaQ.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


  [1]: http://oddbiem8l.bkt.clouddn.com/scale.gif
