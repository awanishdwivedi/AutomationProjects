/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package requestsBody;

import exception.ApiException;
import org.testng.annotations.Test;
import pojos.Collection;
import pojos.CollectionRes;
import response.CollectionResponse;
import response.EstablishmentResponse;
import rest.Rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Awanish Dwivedi
 * @version $Id: CollectionsApi.java, v 0.1 2020-07-25 7:29 pm Awanish Dwivedi Exp $$
 */
public class CollectionsApi {

    public CollectionResponse getCollection(String cityId,Double lat, Double lon, Integer count) throws ApiException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("city_id",cityId);
        map.put("lat",26.8467);
        map.put("lon",80.9462);
        map.put("count",count);


        return Rest.get(map, CollectionResponse.class,"collections");
    }
}