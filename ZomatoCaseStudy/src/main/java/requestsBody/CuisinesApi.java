/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package requestsBody;

import exception.ApiException;
import org.testng.annotations.Test;
import response.CuisinesResponse;
import response.EstablishmentResponse;
import rest.Rest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Awanish Dwivedi
 * @version $Id: CuisinesApi.java, v 0.1 2020-07-25 7:29 pm Awanish Dwivedi Exp $$
 */
public class CuisinesApi {

    @Test
    public void getCuisine(String cityId,Double lat,Double lon) throws ApiException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("city_id",cityId);
        map.put("lat",lat);
        map.put("lon",lon);


        CuisinesResponse cuisinesResponse = Rest.get(map, CuisinesResponse.class,"cuisines");
        System.out.println(cuisinesResponse.getCuisines().get(0).getCuisine().getCuisine_id());
        System.out.println(cuisinesResponse.getCuisines().get(0).getCuisine().getCuisine_name());
    }
}