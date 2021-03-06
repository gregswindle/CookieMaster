package com.verizon.api.android.cookiemaster;

import android.webkit.CookieManager;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.HttpCookie;
import java.util.List;

/**
 * Created by v128477 on 4/11/17.
 */
public class CookieMaster {

    /**
     * Gets cookie value.
     *
     * @param url        the url
     * @param cookieName the cookie name
     * @return the cookie value
     */
    public static String getCookieValue(String url, String cookieName) {
        CookieManager cookieManager = CookieManager.getInstance();
        String[] cookies = cookieManager.getCookie(url).split("; ");
        String cookieEntry = "";

        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].contains(cookieName + "=")) {
                cookieEntry = cookies[i].split("=")[1].trim();
                break;
            }
        }

        JSONObject json = null;
        if (cookieEntry != "") {
            try {
                json = new JSONObject("{cookieValue:\"" + cookieEntry + "\"}");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return cookieEntry;
    }

    /**
     * Create or update an `HttpCookie` with a `Set-Cookie` directive's value by URL.
     *
     * @param url               the url
     * @param cookieHeaderValue the cookie header value
     */
    public static void setCookieValue(String url, String cookieHeaderValue) {
        CookieManager cookieManager = CookieManager.getInstance();
        List<HttpCookie> httpCookies = HttpCookie.parse(cookieHeaderValue);

    }

    /**
     * Sets cookie value.
     *
     * @param url         the url
     * @param cookieName  the cookie name
     * @param cookieValue the cookie value
     */
    public static void setCookieValue(String url, String cookieName, String cookieValue) {

    }



}

