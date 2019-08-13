package creational.pattern.abstarct.factory.pattern;

interface  AbstarctFactory {
    HttpHelper getHttpHelper(CompanyType pCompanyType);
    void  setGoogleProject(GoogleProject pGoogleProject);
    void  setFullCreativeProject(FullCreativeProject pFullCreativeProject);
}
