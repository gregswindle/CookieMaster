package com.verizon.api.android.cookiemaster;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.HttpCookie;
import java.util.List;

/**
 * Created by v128477 on 4/11/17.
 */

public class HttpCookieJson {

    public static void fromHttpCookie(HttpCookie httpCookie) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writeValueAsString(httpCookie));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public static void fromString(String cookieHeaderValue) throws JsonProcessingException {
        List<HttpCookie> httpCookies = HttpCookie.parse(cookieHeaderValue);
        if (!httpCookies.isEmpty()) {
            ObjectMapper mapper = new ObjectMapper();
            for (HttpCookie httpCookie: httpCookies) {
                //HttpCookieValue value = new HttpCookieValue(httpCookie);

                System.out.println(mapper.writeValueAsString(httpCookie));
            }
        }

        // return httpCookieValue;
    }

}
