<img src="https://github.com/dyazincahya/DTM-helper-java/raw/main/icon.png" width="250" />

# Date Time Manipulation (DTM) Helper for JAVA
Date Time Manipulation (DTM) Helper for JAVA, compatible for Spring Boot too.

### Features
  - Manipulation day
  - Manipulation Month
  - Manipulation Year
  - Manipulation Hour
  - Manipulation Minute
  - Manipulation Second
  - Manipulation Milisecond
  - Re-format Date _(convert date to string)_
  - Convert String To Date/Date

### Has Tested
  - Java 11
  - Spring Boot 2.4.2

### Installation
  - Download/copy file [DTM.java](https://github.com/dyazincahya/DTM-helper-java/blob/main/DTM.java) to your own project
  - Adjust ```Package Path``` in line 2 on file [DTM.java](https://github.com/dyazincahya/DTM-helper-java/blob/main/DTM.java)
  - Done.

### Usage

##### Manipulation Day

> dtm.day(param).getTime();

Fill positive numbers on the ```Param``` to add days (1,2,3, etc), and;
fill negative numbers on the ```Param``` to subtract days (-1, -2, -3, etc)

###### Example
``` java
DTM dtm = new DTM();
dtm.day(-1).getTime();
```

##### Manipulation Month

> dtm.month(param).getTime();

Fill positive numbers on the ```Param``` to add month (1,2,3, etc), and;
fill negative numbers on the ```Param``` to subtract month (-1, -2, -3, etc)

###### Example
``` java
DTM dtm = new DTM();
dtm.month(-1).getTime();
```

##### Manipulation Year

> dtm.year(param).getTime();

Fill positive numbers on the ```Param``` to add year (1,2,3, etc), and;
fill negative numbers on the ```Param``` to subtract year (-1, -2, -3, etc)

###### Example
``` java
DTM dtm = new DTM();
dtm.year(-1).getTime();
```

##### Manipulation Hour

> dtm.hour(param).getTime();

Fill positive numbers on the ```Param``` to add hour (1,2,3, etc), and;
fill negative numbers on the ```Param``` to subtract hour (-1, -2, -3, etc)

###### Example
``` java
DTM dtm = new DTM();
dtm.hour(-1).getTime();
```

##### Manipulation Minute

> dtm.minute(param).getTime();

Fill positive numbers on the ```Param``` to add minute (1,2,3, etc), and;
fill negative numbers on the ```Param``` to subtract minute (-1, -2, -3, etc)

###### Example
``` java
DTM dtm = new DTM();
dtm.minute(-1).getTime();
```

##### Manipulation Second

> dtm.second(param).getTime();

Fill positive numbers on the ```Param``` to add second (1,2,3, etc), and;
fill negative numbers on the ```Param``` to subtract second (-1, -2, -3, etc)

###### Example
``` java
DTM dtm = new DTM();
dtm.second(-1).getTime();
```

##### Manipulation Milisecond

> dtm.milisecond(param).getTime();

Fill positive numbers on the ```Param``` to add milisecond (1,2,3, etc), and;
fill negative numbers on the ```Param``` to subtract milisecond (-1, -2, -3, etc)

###### Example
``` java
DTM dtm = new DTM();
dtm.milisecond(-1).getTime();
```

##### Re-format Date _(convert date to string)_

> dtm.reFormat(param1, param2);

Fill the ```Param1``` with Date data type value, and; 
fill the ```Param2``` with Date string pattern 

###### Example
``` java
DTM dtm = new DTM();
dtm.reFormat(new Date(),"ddMMyyyy");
dtm.reFormat(dtm.day(-7).getTime(),"ddMMyyyy");
```

##### String To Date

> dtm.stringToDate(param1, param2);

Fill the ```Param1``` with String Date, and; 
fill the ```Param2``` with Date string pattern, but the pattern date must be the same with String Date on ```Param1``` (Ex: String Date ```"31/12/1998"```, Pattern from the string date is ```"dd/MM/yyyy"```)

###### Example
``` java
DTM dtm = new DTM();
dtm.stringToDate("31/12/1998","dd/MM/yyyy");
```

### Author
[kang-cahya.com](https://www.kang-cahya.com)

### License
[MIT License](https://github.com/dyazincahya/DTM-helper-java/blob/main/LICENSE)
