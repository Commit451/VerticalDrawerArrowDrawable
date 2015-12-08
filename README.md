# VerticalDrawerArrowDrawable
DrawerArrowDrawable, but vertical up and down instead of left and right.

[![Build Status](https://travis-ci.org/Commit451/VerticalDrawerArrowDrawable.svg?branch=master)](https://travis-ci.org/Commit451/VerticalDrawerArrowDrawable)

# Gradle Dependency
Easily reference the library in your Android projects using this dependency in your module's `build.gradle` file:

```Gradle
dependencies {
    compile 'com.commit451:verticaldrawerarrowdrawable:1.0.0’
}
```

# Usage
See sample project for usage. The documentation and source is mostly copied from [DrawerArrowDrawable](http://developer.android.com/reference/android/support/v7/graphics/drawable/DrawerArrowDrawable.html) from AppCompat:
```java
Toolbar toolbar = findViewById(R.id.toolbar);
VerticalDrawerArrowDrawable drawerArrowDrawable = new VerticalDrawerArrowDrawable(this);
toolbar.setNavigationIcon(drawerArrowDrawable);
```

License
--------

    Copyright 2014 The Android Open Source Project, 2015 Commit 451

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
