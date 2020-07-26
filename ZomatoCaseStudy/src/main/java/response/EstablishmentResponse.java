/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package response;

import pojos.Establishment;
import pojos.EstablishmentRes;

import java.util.List;

/**
 * @author Awanish Dwivedi
 * @version $Id: EstablishmentResponse.java, v 0.1 2020-07-25 10:10 pm Awanish Dwivedi Exp $$
 */
public class EstablishmentResponse {
    private List <EstablishmentRes> establishments;

    public List<EstablishmentRes> getEstablishments() {
        return establishments;
    }

    public void setEstablishments(List<EstablishmentRes> establishments) {
        this.establishments = establishments;
    }
}