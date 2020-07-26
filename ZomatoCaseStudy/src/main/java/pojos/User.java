/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package pojos;

/**
 * @author Awanish Dwivedi
 * @version $Id: User.java, v 0.1 2020-07-25 10:38 pm Awanish Dwivedi Exp $$
 */
public class User {
    private String name;
    private String foodie_color;
    private String profile_url;
    private String profile_image;
    private String profile_deeplink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodie_color() {
        return foodie_color;
    }

    public void setFoodie_color(String foodie_color) {
        this.foodie_color = foodie_color;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getProfile_deeplink() {
        return profile_deeplink;
    }

    public void setProfile_deeplink(String profile_deeplink) {
        this.profile_deeplink = profile_deeplink;
    }
}