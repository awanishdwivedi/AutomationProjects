/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package response;

import pojos.RestaurantRes;

import java.util.List;

/**
 * @author Awanish Dwivedi
 * @version $Id: RestaurantResponse.java, v 0.1 2020-07-25 8:48 pm Awanish Dwivedi Exp $$
 */
public class RestaurantResponse {
    private Integer results_found;
    private Integer results_start;
    private Integer results_shown;
    private List<RestaurantRes> restaurants;

    public Integer getResults_found() {
        return results_found;
    }

    public void setResults_found(Integer results_found) {
        this.results_found = results_found;
    }

    public Integer getResults_start() {
        return results_start;
    }

    public void setResults_start(Integer results_start) {
        this.results_start = results_start;
    }

    public Integer getResults_shown() {
        return results_shown;
    }

    public void setResults_shown(Integer results_shown) {
        this.results_shown = results_shown;
    }

    public List<RestaurantRes> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<RestaurantRes> restaurants) {
        this.restaurants = restaurants;
    }
}