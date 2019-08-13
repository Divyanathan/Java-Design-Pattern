package creational.pattern.abstarct.factory.pattern;

import java.util.HashMap;

public class WhatsApp extends HttpHelper {
    public WhatsApp(String pContentType, String pAccessToken) {
        super(pContentType, pAccessToken);
    }

    @Override
    String getBaseUrl() {
        return "www.WhatsApp.com";
    }

    @Override
    HashMap<String, String> getHeader() {
        return super.getmHeaderValue();
    }
}