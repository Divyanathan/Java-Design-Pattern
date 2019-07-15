package creational.pattern.factory.method.pattern;

public class FactoryMethodPattern {

    public HttpHelper getHttHelper(String pProject) {
        HttpHelper lHttpHelper = null;
        if (pProject.equalsIgnoreCase("setmore")) {
            lHttpHelper = new Setmore("Application/Json", "setmore-access-token");
            System.out.println("Http helper for Setmore project");
        } else if (pProject.equalsIgnoreCase("anywhere")) {
            lHttpHelper = new Setmore("Application/x-www-form-urlencoded ", "anywhere-access-token");
            System.out.println("Http helper for Anywhere works project");
        } else if (pProject.equalsIgnoreCase("yoco")){
            lHttpHelper = new Setmore("Application/Json", "yoco-access-token");
            System.out.println("Http helper for YoCo project");
        }

        if (lHttpHelper==null){
            System.out.println("Project not found " +
                               "\nPlease Enter anyone of the following project name"+"\n" +
                                "--> setmore"+"\n"+
                                "--> anywhere"+"\n"+
                                "--> anywhere" );
        }else {
            System.out.println("--------------------Values are-------------------");
            System.out.println(lHttpHelper.toString());
        }
        return lHttpHelper;
    }

}
