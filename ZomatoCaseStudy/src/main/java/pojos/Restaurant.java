/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package pojos;

import java.util.List;

/**
 * @author Awanish Dwivedi
 * @version $Id: restaurant.java, v 0.1 2020-07-25 1:18 pm Awanish Dwivedi Exp $$
 */
public class Restaurant {

    private String apikey;
    private String id;
    private String name;
    private String url;
    private String cuisines;
    private String timings;
    private Integer average_cost_for_two;
    private Integer all_reviews_count;
    private String photos_url;
    private String menu_url;
    private String events_url;
    private Integer photo_count;
    private Boolean is_delivering_now;
    private Boolean has_online_delivery;
    private String phone_numbers;
    private Location location;
    private UserRatings userRatings;
    private List<String> highlights;
    private List<String> establishment;

    public UserRatings getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(UserRatings userRatings) {
        this.userRatings = userRatings;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    public List<String> getEstablishment() {
        return establishment;
    }

    public void setEstablishment(List<String> establishment) {
        this.establishment = establishment;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public Integer getAverage_cost_for_two() {
        return average_cost_for_two;
    }

    public void setAverage_cost_for_two(Integer average_cost_for_two) {
        this.average_cost_for_two = average_cost_for_two;
    }

    public Integer getAll_reviews_count() {
        return all_reviews_count;
    }

    public void setAll_reviews_count(Integer all_reviews_count) {
        this.all_reviews_count = all_reviews_count;
    }

    public String getPhotos_url() {
        return photos_url;
    }

    public void setPhotos_url(String photos_url) {
        this.photos_url = photos_url;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public Integer getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(Integer photo_count) {
        this.photo_count = photo_count;
    }

    public Boolean getIs_delivering_now() {
        return is_delivering_now;
    }

    public void setIs_delivering_now(Boolean is_delivering_now) {
        this.is_delivering_now = is_delivering_now;
    }

    public Boolean getHas_online_delivery() {
        return has_online_delivery;
    }

    public void setHas_online_delivery(Boolean has_online_delivery) {
        this.has_online_delivery = has_online_delivery;
    }

    public String getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(String phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "apikey='" + apikey + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", cuisines='" + cuisines + '\'' +
                ", timings='" + timings + '\'' +
                ", average_cost_for_two=" + average_cost_for_two +
                ", all_reviews_count=" + all_reviews_count +
                ", photos_url='" + photos_url + '\'' +
                ", menu_url='" + menu_url + '\'' +
                ", events_url='" + events_url + '\'' +
                ", photo_count=" + photo_count +
                ", is_delivering_now=" + is_delivering_now +
                ", has_online_delivery=" + has_online_delivery +
                ", phone_numbers='" + phone_numbers + '\'' +
                ", locations=" + location +
                ", userRatings=" + userRatings +
                ", highlights=" + highlights +
                '}';
    }
}