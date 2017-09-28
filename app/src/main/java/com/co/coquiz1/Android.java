package com.co.coquiz1;

/**
 * Created by Patrick Ian Co on 9/28/2017.
 */

public class Android {
    private String version;
    private int logo;

    public Android(String version, int logo) {
        this.version = version;
        this.logo = logo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
