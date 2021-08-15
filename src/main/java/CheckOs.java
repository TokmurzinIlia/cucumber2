

public class CheckOs {

public static String checkOs(){
    String str = System.getProperty("os.name");
    return str;
}
public static String getFeaturesWay(){
    String feature = null;

    if(checkOs().contains("Windows")){
        feature = "src/test/resources/features";
    } else if (checkOs().contains("Linux")){feature = "src/test/resources/features";}
return feature;}
}
