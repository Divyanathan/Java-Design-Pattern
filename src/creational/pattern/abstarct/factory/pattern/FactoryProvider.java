package creational.pattern.abstarct.factory.pattern;

public class FactoryProvider implements AbstarctFactory {

    GoogleProject mGoogleProject;
    FullCreativeProject  mFullCreativeProject;
    HttpHelper mHttpHelper;

    FactoryProvider() {
        mGoogleProject = GoogleProject.FACEBOOK;
        mFullCreativeProject = FullCreativeProject.ANYWHERE;
    }

    @Override
    public HttpHelper getHttpHelper(CompanyType pCompanyType) {
        if (pCompanyType == CompanyType.FULL_CREATIVE) {
            if (mFullCreativeProject == FullCreativeProject.ANYWHERE)
                mHttpHelper = new FullCreative(FullCreativeProject.ANYWHERE).getHttpHelper();
            else if (mFullCreativeProject == FullCreativeProject.SETMORE)
                mHttpHelper = new FullCreative(FullCreativeProject.SETMORE).getHttpHelper();
        } else if (pCompanyType == CompanyType.GOOGLE) {
            if (mGoogleProject == GoogleProject.FACEBOOK)
                mHttpHelper = new Google(GoogleProject.FACEBOOK).getHttpHelper();
            else if (mGoogleProject == GoogleProject.WHATSAPP)
                mHttpHelper = new Google(GoogleProject.WHATSAPP).getHttpHelper();

        }
        return mHttpHelper;
    }

    @Override
    public void setGoogleProject(GoogleProject pGoogleProject) {
        mGoogleProject = pGoogleProject;
    }

    @Override
    public void setFullCreativeProject(FullCreativeProject pFullCreativeProject) {
        mFullCreativeProject =pFullCreativeProject;
    }


}
