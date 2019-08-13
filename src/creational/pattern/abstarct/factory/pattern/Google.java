package creational.pattern.abstarct.factory.pattern;

public class Google implements GoogleFactory{
    HttpHelper mHttpHelper;
    Google(GoogleProject pGoogleProject) {
        if (pGoogleProject == GoogleProject.FACEBOOK) {
            mHttpHelper = new Facebook("Application/Jason", "Anywhere-AccessToken");
        } else if (pGoogleProject == GoogleProject.WHATSAPP) {
            mHttpHelper = new WhatsApp("Application/Jason", "Setmore-AccessToken");
        }
    }

    public HttpHelper getHttpHelper(){
        return mHttpHelper;
    }
}
