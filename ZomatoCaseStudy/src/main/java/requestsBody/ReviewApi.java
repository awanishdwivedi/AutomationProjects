/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package requestsBody;

import exception.ApiException;
import org.testng.annotations.Test;
import response.LocationResponse;
import response.ReviewResponse;
import rest.Rest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Awanish Dwivedi
 * @version $Id: ReviewResponse.java, v 0.1 2020-07-25 10:33 pm Awanish Dwivedi Exp $$
 */
public class ReviewApi {

    public ReviewResponse getReview(Integer res_id,Integer start, Integer count) throws ApiException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("res_id",res_id); //18837140
        map.put("start",start); //0
        map.put("count",count); //10

       return   Rest.get(map, response.ReviewResponse.class,"reviews");
       /*
        System.out.println(reviewResponse.getReviews_count());
        System.out.println(reviewResponse.getUser_reviews().size());
        System.out.println(reviewResponse.getUser_reviews().get(0).getReview().getUser().getName());
*/
    }

}