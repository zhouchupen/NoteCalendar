# NoteCalendar
Android自定义日历，带有标注功能

![](http://upload-images.jianshu.io/upload_images/2746415-74dfcd11dd191e15.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## Installing

Users of your library will need add the jitpack.io repository:

```gradle
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

and:

```gradle
dependencies {
    compile 'com.github.zhouchupen:NoteCalendar:v1.0'
}
```

Note: do not add the jitpack.io repository under `buildscript` 

## Adding a sample app 

If you add a sample app to the same repo then your app needs to depend on the library. To do this in your app/build.gradle add a dependency in the form:

```gradle
dependencies {
    compile project(':library')
}
```

where 'library' is the name of your library module.

## Using

You may need this to use the calendar.  Put this into your xml file:
```xml
<com.scnu.zhou.widget.NoteCalendar
      android:layout_width="match_parent"
      android:layout_height="wrap_content">
        
</com.scnu.zhou.widget.NoteCalendar>
```
And put this into your activity file:
```java
NoteCalendar nc_calendar = (NoteCalendar) findViewById(R.id.nc_calendar);
Map<String, Boolean> note01 = new HashMap<>();   // the first group of notes
Map<String, Boolean> note02 = new HashMap<>();   // the second group of notes
note01.put("2016-12-01", true);
note01.put("2016-12-11", true);
note01.put("2016-12-21", true);
note02.put("2016-12-08", true);
nc_calendar.setNote01(note01);
nc_calendar.setNote02(note02);

nc_calendar.setOnItemClickListener(new NoteCalendar.OnItemClickListener() {
     @Override
     public void onClick(int year, int month, int day) {

        // TODO something here when you click the item in Calendar.
     }
});
```
