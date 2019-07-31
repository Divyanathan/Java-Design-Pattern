package creational.pattern.factory.method.pattern;

import java.util.HashMap;

public class Setmore extends HttpHelper {
    public Setmore(String pContentType, String pAccessToken) {
        super(pContentType, pAccessToken);
    }

    @Override
    String getBaseUrl() {
        return "https://my.setmore.com";
    }

    @Override
    HashMap<String, String> getHeader() {
        return super.getmHeaderValue();
    }
}
