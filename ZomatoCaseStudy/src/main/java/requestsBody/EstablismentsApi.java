/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package requestsBody;

import exception.ApiException;
import org.testng.annotations.Test;
import response.EstablishmentResponse;
import rest.Rest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Awanish Dwivedi
 * @version $Id: EstablismentsApi.java, v 0.1 2020-07-25 7:29 pm Awanish Dwivedi Exp $$
 */
public class EstablismentsApi {

    @Test
    public EstablishmentResponse getEstablishment(String cityId, Double lat, Double lon) throws ApiException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("city_id",cityId);//8
        map.put("lat",lat);//26.8467
        map.put("lon",lon);//80.9462


        return Rest.get(map, EstablishmentResponse.class,"establishments");
    }

}