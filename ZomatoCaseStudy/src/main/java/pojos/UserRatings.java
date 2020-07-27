/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package pojos;

/**
 * @author Awanish Dwivedi
 * @version $Id: UserRatings.java, v 0.1 2020-07-25 1:33 pm Awanish Dwivedi Exp $$
 */
public class UserRatings {
        private Integer rating;
        private String review_text;
        private Integer id;
        private String rating_color;
        private String review_time_friendly;
        private String rating_text;
        private Long timestamp;
        private Integer likes;
        private Integer comments_count;
        private Double aggregate_rating;

        public Double getAggregate_rating() {
                return aggregate_rating;
        }

        public void setAggregate_rating(Double aggregate_rating) {
                this.aggregate_rating = aggregate_rating;
        }

        public Integer getRating() {
                return rating;
        }

        public void setRating(Integer rating) {
                this.rating = rating;
        }

        public String getReview_text() {
                return review_text;
        }

        public void setReview_text(String review_text) {
                this.review_text = review_text;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getRating_color() {
                return rating_color;
        }

        public void setRating_color(String rating_color) {
                this.rating_color = rating_color;
        }

        public String getReview_time_friendly() {
                return review_time_friendly;
        }

        public void setReview_time_friendly(String review_time_friendly) {
                this.review_time_friendly = review_time_friendly;
        }

        public String getRating_text() {
                return rating_text;
        }

        public void setRating_text(String rating_text) {
                this.rating_text = rating_text;
        }

        public Long getTimestamp() {
                return timestamp;
        }

        public void setTimestamp(Long timestamp) {
                this.timestamp = timestamp;
        }

        public Integer getLikes() {
                return likes;
        }

        public void setLikes(Integer likes) {
                this.likes = likes;
        }

        public Integer getComments_count() {
                return comments_count;
        }

        public void setComments_count(Integer comments_count) {
                this.comments_count = comments_count;
        }
}