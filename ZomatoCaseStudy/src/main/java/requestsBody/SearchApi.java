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

    public RestaurantResponse search() throws ApiException {
        Map<String,Object> map = new HashMap<String, Object>();

        return Rest.get(map,RestaurantResponse.class,"search");

    }
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

    public RestaurantResponse searchByEstablishment(String entityType, Integer entityId,String establishmentType,Double lat, Double lon,String sort,String order) throws ApiException {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("entity_type",entityType);//city
        map.put("entity_id",entityId);//28
        map.put("establishment_type",establishmentType);
        map.put("lat",lat);
        map.put("lon",lon);
        map.put("sort",sort);
        map.put("order",order);


        return Rest.get(map,RestaurantResponse.class,"search");
    }
}