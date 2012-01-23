package org.example.spring;

/**
 * @author zutherb
 */
public class MyProfileService {

    private String profileName;

    public MyProfileService(String profileName){
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
