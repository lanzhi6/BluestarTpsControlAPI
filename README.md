# BluestarTpsControlAPI[![](https://jitpack.io/v/lanzhi6/BluestarTpsControlAPI.svg)](https://jitpack.io/#lanzhi6/BluestarTpsControlAPI)


使用方法

maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.lanzhi6</groupId>
        <artifactId>BluestarTpsControlAPI</artifactId>
        <version>1.6</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
gradle
```
	allprojects 
	{
		repositories 
		{
			maven { url 'https://jitpack.io' }
		}
	}
	dependencies 
	{
	    implementation 'com.github.lanzhi6:BluestarTpsControlAPI:-SNAPSHOT'
	}
```

使用
```java
import me.lanzhi.bluestartpscontrol.BluestarControlAPI;

class XXXPlugin extends JavaPlugin
{
    private BluestarControlAPI bluestarControlAPI;
    
    @Override
    public void onEnable()
    {
        bluestarControlAPI=
                Bukkit.getServicesManager().load(BluestarControlAPI.class);
        if (bluestarControlAPI==null)
        {
            System.out.println("为找到BluestarTpsControl");
        }
        //获取tick之间的等待时间
        long time=bluestarControlAPI.getmspt();
        //设置tick之间的等待时间
        bluestarControlAPI.setmspt(time);
        //为tps附上对应颜色(例如tps低于18是黄色,低于16是红色)
        String message=bluestarControlAPI.tpsFormat(tps);
    }
}
```