package config;

public class EnvironmentConfig {

    private static final String ENV = "test";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "foo";
    public static final String URI_LOGIN = "https://" + USERNAME + ":" + PASSWORD + "@" + ENV + ".grinfer.com/";
    public static final String URI_API_LOGIN = "https://" + USERNAME + ":" + PASSWORD + "@" + ENV + ".grinfer.com/api/";
}
