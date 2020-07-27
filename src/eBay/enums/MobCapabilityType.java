package eBay.enums;

public enum MobCapabilityType {

    APP("app"),
    APP_ACTIVITY("appActivity"),
    APP_PACKAGE("appPackage"),
    APP_WAIT_ACTIVITY("appWaitActivity"),
    APP_WAIT_PACKAGE("appWaitPackage"),
    AUTOMATION_NAME("automationName"),
    DEVICE_NAME("deviceName"),
    DEVICE_READY_TIMEOUT("deviceReadyTimeout"),
    LAUNCH_TIMEOUT("launchTimeout"),
    NEW_COMMAND_TIMEOUT("newCommandTimeout"),
    PLATFORM_NAME("platformName"),
    PLATFORM_VERSION("platformVersion"),
    BROWSER_NAME("browserName"),
    SELENDROID_PORT("selendroidPort"),
	AUTOGRANT_PERMISSSION("autoGrantPermissions"),
	FULL_RESET_APP("full-reset");
    

    public String value;

    MobCapabilityType(String value) {
        this.value = value;

    }

    public String getValue() {
        return value;
    }

}
