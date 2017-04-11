package com.verizon.api.android.cookiemaster

import spock.lang.Specification


/**
 * Created by v128477 on 4/11/17.
 */
class HttpCookieJsonSpec extends Specification {
    def setup() {

    }

    def cleanup() {

    }

    def setupSpec() {

    }

    def cleanupSpec() {

    }

    def "serializes an HttpCookie to JSON"() {
        HttpCookie httpCookie = new HttpCookie("SMSESSION", "1234")
        HttpCookieJson.fromHttpCookie(httpCookie)
    }
}