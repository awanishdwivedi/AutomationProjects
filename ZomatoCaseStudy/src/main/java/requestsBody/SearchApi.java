/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package requestsBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import exception.ApiException;
import org.testng.annotations.Test;
import response.RestaurantResponse;
import rest.Rest;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * @author Awanish Dwivedi
 * @version $Id: searchApi.java, v 0.1 2020-07-25 12:20 pm Awanish Dwivedi Exp $$
 */
public class SearchApi {

    public RestaurantResponse searchByEntity(String entityType, String entityId) throws ApiException {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("entity_type",entityType);//city
        map.put("entity_id",entityId);//28

        return Rest.get(map,RestaurantResponse.class,"search");

    }

    public RestaurantResponse searchByCollection(String entityType, Integer entityId, Integer collectionId,Integer count) throws ApiException {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("entity_type",entityType);//city
        map.put("entity_id",entityId);//28
        map.put("collection_id",collectionId);//1
        map.put("collection_id",count);//1

        return Rest.get(map,RestaurantResponse.class,"search");
    }

    public RestaurantResponse searchByCuisines(String entityType, Integer entityId,String cuisines) throws ApiException {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("entity_type",entityType);//city
        map.put("entity_id",entityId);//28
        map.put("cuisines",cuisines);//Chinese

        return Rest.get(map,RestaurantResponse.class,"search");
    }

    public RestaurantResponse searchByEstablishment(String entityType, String entityId,String stablishmentType,Long lat, Long lon) throws ApiException {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("entity_type",entityType);//city
        map.put("entity_id",entityId);//28
        map.put("establishment_type","20");
        map.put("lat",lat);
        map.put("lon",lon);

        return Rest.get(map,RestaurantResponse.class,"search");
    }
}