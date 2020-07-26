/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package response;

import pojos.Location;

import java.util.List;

/**
 * @author Awanish Dwivedi
 * @version $Id: LocationResponse.java, v 0.1 2020-07-25 10:03 pm Awanish Dwivedi Exp $$
 */
public class LocationResponse {

    private List<Location> location_suggestions;
    private String status;
    private Integer has_more;
    private Integer has_total;
    private Boolean user_has_addresses;

    public List<Location> getLocation_suggestions() {
        return location_suggestions;
    }

    public void setLocation_suggestions(List<Location> location_suggestions) {
        this.location_suggestions = location_suggestions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getHas_more() {
        return has_more;
    }

    public void setHas_more(Integer has_more) {
        this.has_more = has_more;
    }

    public Integer getHas_total() {
        return has_total;
    }

    public void setHas_total(Integer has_total) {
        this.has_total = has_total;
    }

    public Boolean getUser_has_addresses() {
        return user_has_addresses;
    }

    public void setUser_has_addresses(Boolean user_has_addresses) {
        this.user_has_addresses = user_has_addresses;
    }
}