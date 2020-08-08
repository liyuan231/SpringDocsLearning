package com.liyuan.scope;

public class UserManager {
    private DefaultUserPreferencesImpl defaultUserPreferences;

    public void setDefaultUserPreferences(DefaultUserPreferencesImpl defaultUserPreferences) {
        this.defaultUserPreferences = defaultUserPreferences;
    }

    public DefaultUserPreferencesImpl getDefaultUserPreferences() {
        return defaultUserPreferences;
    }
}
