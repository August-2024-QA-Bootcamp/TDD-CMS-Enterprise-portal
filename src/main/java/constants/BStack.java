package constants;

public enum BStack
{
    BS_OPTIONS("bstack:options"),
    DEVICE_NAME("deviceName"),
    OS("os"),
    OS_VER("osVersion"),
    BROWSER_NAME("browserName"),
    BROWSER_VER("browserVersion"),
    DEVICE_ORIENTATION("deviceOrientation"),

    ;

    String name;

    BStack(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
