/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package response;

import pojos.Review;
import pojos.ReviewRes;

import java.util.List;

/**
 * @author Awanish Dwivedi
 * @version $Id: ReviewResponse.java, v 0.1 2020-07-25 10:41 pm Awanish Dwivedi Exp $$
 */
public class ReviewResponse {

    private Integer reviews_count;
    private Integer reviews_start;
    private Integer reviews_shown;
    private List<ReviewRes> user_reviews;

    public Integer getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(Integer reviews_count) {
        this.reviews_count = reviews_count;
    }

    public Integer getReviews_start() {
        return reviews_start;
    }

    public void setReviews_start(Integer reviews_start) {
        this.reviews_start = reviews_start;
    }

    public Integer getReviews_shown() {
        return reviews_shown;
    }

    public void setReviews_shown(Integer reviews_shown) {
        this.reviews_shown = reviews_shown;
    }

    public List<ReviewRes> getUser_reviews() {
        return user_reviews;
    }

    public void setUser_reviews(List<ReviewRes> user_reviews) {
        this.user_reviews = user_reviews;
    }
}