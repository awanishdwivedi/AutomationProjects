/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package pojos;

/**
 * @author Awanish Dwivedi
 * @version $Id: Cuisines.java, v 0.1 2020-07-25 10:16 pm Awanish Dwivedi Exp $$
 */
public class Cuisine {
    private Integer cuisine_id;
    private String cuisine_name;

    public String getCuisine_name() {
        return cuisine_name;
    }

    public void setCuisine_name(String cuisine_name) {
        this.cuisine_name = cuisine_name;
    }

    public Integer getCuisine_id() {
        return cuisine_id;
    }

    public void setCuisine_id(Integer cuisine_id) {
        this.cuisine_id = cuisine_id;
    }
}