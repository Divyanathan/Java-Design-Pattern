package creational.pattern.abstarct.factory.pattern;

public class FullCreative implements FullCreativeFactory{
    HttpHelper lHttpHelper;
    FullCreative(FullCreativeProject pProjectType){
        if (pProjectType == FullCreativeProject.ANYWHERE){
            lHttpHelper = new AnyWhereWorks("Application/Jason","Anywhere-AccessToken");
        }else if (pProjectType == FullCreativeProject.SETMORE){
            lHttpHelper = new Setmore("Application/Jason","Setmore-AccessToken");
        }
    }
    public HttpHelper getHttpHelper(){
        return lHttpHelper;
    }

}
