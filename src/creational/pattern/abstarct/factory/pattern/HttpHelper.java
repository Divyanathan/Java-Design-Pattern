package creational.pattern.abstarct.factory.pattern;

import java.util.HashMap;

public abstract class HttpHelper {
    HashMap<String, String> mHeader;

    public HttpHelper(String pContentType, String pAccessToken) {
        mHeader = new HashMap<>();
        mHeader.put("ContentType", pContentType);
        mHeader.put("Authorization", "Bearer " + pAccessToken);
    }

    public HashMap<String, String> getmHeaderValue() {
        return mHeader;
    }

    abstract String getBaseUrl();

    abstract HashMap<String, String> getHeader();

    @Override
    public String toString() {
        return "Url "+this.getBaseUrl()+"\n"+
                "ContentType "+mHeader.get("ContentType")+"\n"+
                "Authorization "+mHeader.get("Authorization")+"\n";

    }
}
