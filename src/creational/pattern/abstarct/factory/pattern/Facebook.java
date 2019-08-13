package creational.pattern.abstarct.factory.pattern;

import java.util.HashMap;

public class Facebook extends HttpHelper {
    public Facebook(String pContentType, String pAccessToken) {
        super(pContentType, pAccessToken);
    }

    @Override
    String getBaseUrl() {
        return "www.facebook.com";
    }

    @Override
    HashMap<String, String> getHeader() {
        return super.getmHeaderValue();
    }
}