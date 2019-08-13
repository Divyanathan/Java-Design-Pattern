package creational.pattern.abstarct.factory.pattern;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        FactoryProvider lProvider = new FactoryProvider();
        System.out.println(lProvider.getHttpHelper(CompanyType.FULL_CREATIVE).toString());
        lProvider.setFullCreativeProject(FullCreativeProject.SETMORE);
        System.out.println(lProvider.getHttpHelper(CompanyType.FULL_CREATIVE).toString());
        System.out.println(lProvider.getHttpHelper(CompanyType.GOOGLE).toString());
        lProvider.setGoogleProject(GoogleProject.WHATSAPP);
        System.out.println(lProvider.getHttpHelper(CompanyType.GOOGLE).toString());

    }
}
