/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */

import exception.ApiException;
import org.testng.annotations.Test;
import pojos.Collection;
import requestsBody.CollectionsApi;
import requestsBody.CuisinesApi;
import requestsBody.EstablismentsApi;
import requestsBody.LocationsApi;
import requestsBody.ReviewApi;
import requestsBody.SearchApi;
import response.ReviewResponse;

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

    @Test
    public void test1() throws ApiException {
        reviewApi = new ReviewApi();
        ReviewResponse resp =  reviewApi.getReview(18837140,0,10);
        System.out.println(resp.getUser_reviews().get(0).getReview().getUser().getName());
    }

    @Test
    public void test2(){
// I added New Testcase now
    }
}