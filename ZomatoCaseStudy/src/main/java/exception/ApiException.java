/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package exception;

/**
 * @author Awanish Dwivedi
 * @version $Id: ApiException.java, v 0.1 2020-07-25 9:37 pm Awanish Dwivedi Exp $$
 */
public class ApiException extends Exception{

    public ApiException(String message){
        super(message);
    }
    ApiException(String message,Throwable t){
        super(message,t);
    }
}