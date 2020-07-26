/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package pojos;

/**
 * @author Awanish Dwivedi
 * @version $Id: Collection.java, v 0.1 2020-07-25 10:20 pm Awanish Dwivedi Exp $$
 */
public class Collection {
    private Integer collection_id;
    private Integer res_count;
    private String image_url;
    private String title;
    private String description;
    private String share_url;

    public Integer getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(Integer collection_id) {
        this.collection_id = collection_id;
    }

    public Integer getRes_count() {
        return res_count;
    }

    public void setRes_count(Integer res_count) {
        this.res_count = res_count;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }
}