/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package requestsBody;

import exception.ApiException;
import io.restassured.RestAssured;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static javafx.scene.input.KeyCode.T;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import pojos.Location;
import pojos.RestaurantRes;
import response.LocationResponse;
import rest.Rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Awanish Dwivedi
 * @version $Id: LocationsApi.java, v 0.1 2020-07-25 7:28 pm Awanish Dwivedi Exp $$
 */
public class LocationsApi {

    public LocationResponse getLocation(String suggestionName,Double lat,Double lon,Integer count  ) throws ApiException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("query",suggestionName);//lucknow
        map.put("lat",lat);//26.8467
        map.put("lon",lon);//80.9462
        map.put("count",count);//1

       return  Rest.get(map, LocationResponse.class,"locations");
    }
}