/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package response;

import pojos.Collection;
import pojos.CollectionRes;

import java.util.List;

/**
 * @author Awanish Dwivedi
 * @version $Id: CollectionResponse.java, v 0.1 2020-07-25 10:20 pm Awanish Dwivedi Exp $$
 */
public class CollectionResponse {

    private List<CollectionRes> collections;
    private Integer has_more;
    private String share_url;
    private String display_text;
    private Integer has_total;
    private Boolean user_has_addresses;

    public List<CollectionRes> getCollections() {
        return collections;
    }

    public void setCollections(List<CollectionRes> collections) {
        this.collections = collections;
    }

    public Integer getHas_more() {
        return has_more;
    }

    public void setHas_more(Integer has_more) {
        this.has_more = has_more;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getDisplay_text() {
        return display_text;
    }

    public void setDisplay_text(String display_text) {
        this.display_text = display_text;
    }

    public Integer getHas_total() {
        return has_total;
    }

    public void setHas_total(Integer has_total) {
        this.has_total = has_total;
    }

    public Boolean getUser_has_addresses() {
        return user_has_addresses;
    }

    public void setUser_has_addresses(Boolean user_has_addresses) {
        this.user_has_addresses = user_has_addresses;
    }
}