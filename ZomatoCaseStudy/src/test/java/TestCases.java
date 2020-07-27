/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */

import exception.ApiException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.RestaurantRes;
import requestsBody.CollectionsApi;
import requestsBody.CuisinesApi;
import requestsBody.EstablismentsApi;
import requestsBody.LocationsApi;
import requestsBody.ReviewApi;
import requestsBody.SearchApi;
import response.CollectionResponse;
import response.CuisinesResponse;
import response.EstablishmentResponse;
import response.LocationResponse;
import response.RestaurantResponse;

/**
 * @author Awanish Dwivedi
 * @version $Id: TestCases.java, v 0.1 2020-07-25 7:34 pm Awanish Dwivedi Exp $$
 */

public class TestCases {
    CollectionsApi collectionsApi = new CollectionsApi();
    CuisinesApi cuisinesApi = new CuisinesApi();
    EstablismentsApi establismentsApi = new EstablismentsApi();
    LocationsApi locationsApi = new LocationsApi();
    ReviewApi reviewApi = new ReviewApi();
    SearchApi searchApi = new SearchApi();
        /**
         *  Testcase Scenarios 1 : Search Restaurant on basis of collection
         */

    /**
     *      Testcase 001 : rest-count in given collection must be equal to num of restaurant found in search
     */

    @Test
    public void test1() throws ApiException {
        LocationResponse locationResponse =  locationsApi.getLocation("Lucknow",26.8467,26.8467,10);
        int cityId = locationResponse.getLocation_suggestions().get(0).getCity_id();

        CollectionResponse collectionResponse = collectionsApi.getCollection(cityId,26.8467,26.8467,null);
        //get collection Id and rest count for a collection
        Integer collectionId = collectionResponse.getCollections().get(0).getCollection().getCollection_id();
        int res_count = collectionResponse.getCollections().get(0).getCollection().getRes_count();

        RestaurantResponse restaurantResponse =  searchApi.searchByCollection("city",cityId,collectionId,res_count);
        int size = restaurantResponse.getRestaurants().size();
        Assert.assertEquals(res_count,size);

    }
    /**
     *      Testcase 002 : List Restaurant in given collections who are delivering now
     */

    @Test
    public void test2() throws ApiException {
        LocationResponse locationResponse = locationsApi.getLocation("Lucknow", 26.8467, 26.8467, 10);
        int cityId = locationResponse.getLocation_suggestions().get(0).getCity_id();

        CollectionResponse collectionResponse = collectionsApi.getCollection(cityId, 26.8467, 26.8467, null);
        //get collection Id and rest count for a collection
        Integer collectionId = collectionResponse.getCollections().get(0).getCollection().getCollection_id();

        RestaurantResponse restaurantResponse = searchApi.searchByCollection("city", cityId, collectionId, 10);
        int size = restaurantResponse.getRestaurants().size();

        for (int i = 0; i < size; i++) {
            //restaurant who are delivering now
            Assert.assertTrue(restaurantResponse.getRestaurants().get(i).getRestaurant().getIs_delivering_now());
                restaurantResponse.getRestaurants().get(i).getRestaurant().getId();
                restaurantResponse.getRestaurants().get(i).getRestaurant().getName();
                restaurantResponse.getRestaurants().get(i).getRestaurant().getAll_reviews_count();
                restaurantResponse.getRestaurants().get(i).getRestaurant().getAverage_cost_for_two();
                restaurantResponse.getRestaurants().get(i).getRestaurant().getHas_online_delivery();

        }
    }

    /**
     *  Testcase Scenarios 2 : Search Restaurant on basis of cuisines
     */

    /**
     *      Testcase 003 : List Restaurant in given Location for requested cuisines and check restaurant in response have that
     *      cuisine
     */

    @Test
    public void test3() throws ApiException {
        LocationResponse locationResponse = locationsApi.getLocation("Lucknow", 26.8467, 26.8467, 10);
        int cityId = locationResponse.getLocation_suggestions().get(0).getCity_id();

        CuisinesResponse cuisinesResponse = cuisinesApi.getCuisine(cityId,26.8467,26.8467);
        int id = cuisinesResponse.getCuisines().get(0).getCuisine().getCuisine_id();
        String cuisine_name = cuisinesResponse.getCuisines().get(0).getCuisine().getCuisine_name();

        RestaurantResponse restaurantResponse = searchApi.searchByCuisines("city",cityId,String.valueOf(id));

        for (RestaurantRes res :restaurantResponse.getRestaurants()) {
            Assert.assertTrue(res.getRestaurant().getCuisines().contains(cuisine_name));
        }

    }

    /**
     *  Testcase Scenarios 3 : Search Restaurant on basis of establishments
     */

    /**
     * Testcase 004 : check if all restaurant in response contains same establishment or not
     */
    @Test
    public void test4() throws ApiException {
        LocationResponse locationResponse = locationsApi.getLocation("Lucknow", 26.8467, 26.8467, 10);
        int cityId = locationResponse.getLocation_suggestions().get(0).getCity_id();

        EstablishmentResponse establishmentResponse =  establismentsApi.getEstablishment(cityId,26.8467, 26.8467);
        int id = establishmentResponse.getEstablishments().get(0).getEstablishment().getId();
        String name = establishmentResponse.getEstablishments().get(0).getEstablishment().getName();

        RestaurantResponse restaurantResponse = searchApi.searchByEstablishment("city",cityId,String.valueOf(id),26.8467, 26.8467,null,null);
        for (RestaurantRes rest: restaurantResponse.getRestaurants()) {
            System.out.println("Name : "+name);
            System.out.println(rest.getRestaurant().getEstablishment());
            Assert.assertTrue(rest.getRestaurant().getEstablishment().contains(name));
//            Assert.assertEquals(name,rest.getRestaurant().getEstablishment().get(0));
        }
    }

    /**
     * Testcase 005 : EstablishmentId passed and sort in order of rating
     */
    @Test
    public void test5() throws ApiException {
        LocationResponse locationResponse = locationsApi.getLocation("Lucknow", 26.8467, 26.8467, 10);
        int cityId = locationResponse.getLocation_suggestions().get(0).getCity_id();

        EstablishmentResponse establishmentResponse =  establismentsApi.getEstablishment(cityId,26.8467, 26.8467);
        int id = establishmentResponse.getEstablishments().get(0).getEstablishment().getId();
        String name = establishmentResponse.getEstablishments().get(0).getEstablishment().getName();

        RestaurantResponse restaurantSorted = searchApi.searchByEstablishment("city",cityId,String.valueOf(id),26.8467, 26.8467,"rating","desc");
        int  size = restaurantSorted.getRestaurants().size();
        for (int i=0;i<size-1;i++)
        {
            System.out.println(" First : "+restaurantSorted.getRestaurants().get(i).getRestaurant().getUser_rating().getAggregate_rating() +" Next : "+restaurantSorted.getRestaurants().get(i+1).getRestaurant().getUser_rating().getAggregate_rating());
                Assert.assertTrue(restaurantSorted.getRestaurants().get(i).getRestaurant().getUser_rating().getAggregate_rating()>= restaurantSorted.getRestaurants().get(i+1).getRestaurant().getUser_rating().getAggregate_rating());
        }

    }
    /**
     * Testcase 006 : EstablishmentId passed and sort in order of cost
     */
    @Test
    public void test6() throws ApiException {
        LocationResponse locationResponse = locationsApi.getLocation("Lucknow", 26.8467, 26.8467, 10);
        int cityId = locationResponse.getLocation_suggestions().get(0).getCity_id();

        EstablishmentResponse establishmentResponse =  establismentsApi.getEstablishment(cityId,26.8467, 26.8467);
        int id = establishmentResponse.getEstablishments().get(0).getEstablishment().getId();
        String name = establishmentResponse.getEstablishments().get(0).getEstablishment().getName();

        RestaurantResponse restaurantSorted = searchApi.searchByEstablishment("city",cityId,String.valueOf(id),26.8467, 26.8467,"cost","desc");
        int  size = restaurantSorted.getRestaurants().size();
        for (int i=0;i<size-1;i++)
        {
            System.out.println(" First : "+restaurantSorted.getRestaurants().get(i).getRestaurant().getAverage_cost_for_two() +" Next : "+restaurantSorted.getRestaurants().get(i+1).getRestaurant().getAverage_cost_for_two());
            Assert.assertTrue(restaurantSorted.getRestaurants().get(i).getRestaurant().getAverage_cost_for_two()>= restaurantSorted.getRestaurants().get(i+1).getRestaurant().getAverage_cost_for_two());
        }

    }

    /**
     * Testcase 006 : Search is working without any filters
     */
    @Test
    public void test7() throws ApiException {

            RestaurantResponse restaurantResponse = searchApi.search();
            restaurantResponse.getResults_found();
            if (restaurantResponse.getResults_found()>1)
            {Assert.assertTrue(true);}
            else
            {        Assert.assertTrue(false);}
    }


}