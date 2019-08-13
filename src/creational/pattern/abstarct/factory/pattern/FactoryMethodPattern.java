package creational.pattern.abstarct.factory.pattern;

public class FactoryMethodPattern {

    public HttpHelper getHttHelper(String pProject) {
        HttpHelper lHttpHelper = null;
        if (pProject.equalsIgnoreCase("setmore")) {
            lHttpHelper = new Setmore("Application/Json", "setmore-access-token");
            System.out.println("Http helper for Setmore project");
        } else if (pProject.equalsIgnoreCase("anywhere")) {
            lHttpHelper = new AnyWhereWorks("Application/x-www-form-urlencoded ", "anywhere-access-token");
            System.out.println("Http helper for Anywhere works project");
        }

        if (lHttpHelper==null){
            System.out.println("Project not found " +
                               "\nPlease Enter anyone of the following project name"+"\n" +
                                "--> setmore"+"\n"+
                                "--> anywhere"+"\n");
        }else {
            System.out.println("--------------------Values are-------------------");
            System.out.println(lHttpHelper.toString());
        }
        return lHttpHelper;
    }

}
