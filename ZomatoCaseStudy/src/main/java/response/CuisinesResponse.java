/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package response;

import pojos.Cuisine;
import pojos.CuisineRes;

import java.util.List;

/**
 * @author Awanish Dwivedi
 * @version $Id: CuisinesResponse.java, v 0.1 2020-07-25 10:16 pm Awanish Dwivedi Exp $$
 */
public class CuisinesResponse {
    private List<CuisineRes> cuisines;

    public List<CuisineRes> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<CuisineRes> cuisines) {
        this.cuisines = cuisines;
    }
}