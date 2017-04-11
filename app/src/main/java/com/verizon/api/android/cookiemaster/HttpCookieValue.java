package com.verizon.api.android.cookiemaster;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.net.HttpCookie;

/**
 * Created by v128477 on 4/11/17.
 */

public class HttpCookieValue {

    private HttpCookie httpCookie;

    public HttpCookieValue(HttpCookie httpCookie) {
        this.httpCookie = httpCookie;
    }

    @JsonGetter("comment")
    public String getComment() {
        return httpCookie.getComment();
    }

    @JsonGetter("commentURL")
    public String getCommentURL() {
        return httpCookie.getCommentURL();
    }

    @JsonGetter("domain")
    public String getDomain() {
        return httpCookie.getDomain();
    }

    @JsonGetter("maxAge")
    public long getMaxAge() {
        return httpCookie.getMaxAge();
    }

    @JsonGetter("name")
    public String getName() {
        return httpCookie.getName();
    }

    @JsonGetter("path")
    public String getPath() {
        return httpCookie.getPath();
    }

    @JsonGetter("secure")
    public boolean getSecure() {
        return httpCookie.getSecure();
    }

    @JsonGetter("value")
    public String getValue() {
        return httpCookie.getValue();
    }

    @JsonGetter("HTTPOnly")
    public boolean isHttpOnly() {
        return httpCookie.isHttpOnly();
    }

    @JsonGetter("version")
    public int getVersion() {
        return httpCookie.getVersion();
    }
}
