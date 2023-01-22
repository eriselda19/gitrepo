package src.Project;

public class Developer {
    public String appName;
    public String devName;

    public Developer(String appName, String devName){
        this.appName=appName;
        this.devName=devName;

    }

    public String getAppName() {
        return appName;
    }
    public String getDevName() {
        return devName;
    }

    public void setAppName(){
        this.appName=appName;
    }
    public void setDevName(){
        this.devName=devName;
    }
}
