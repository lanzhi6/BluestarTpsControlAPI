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
import me.lanzhi.bluestartpscontrol.BluestarTpsControlAPI;

class XXXPlugin extends JavaPlugin
{
    private BluestarTpsControlAPI bluestarTpsControlAPI;

    @Override
    public void onEnable()
    {
        bluestarTpsControlAPI=Bukkit.getServicesManager().load(BluestarTpsControlAPI.class);
        if (bluestarTpsControlAPI==null)
        {
            System.out.println("未找到BluestarTpsControl");
        }
        //获取tick之间的等待时间
        long time=bluestarTpsControlAPI.getmspt();
        //设置tick之间的等待时间
        bluestarTpsControlAPI.setmspt(time);
        //为tps附上对应颜色(例如tps低于18是黄色,低于16是红色)
        String message=bluestarTpsControlAPI.tpsFormat(tps);
    }
}
```