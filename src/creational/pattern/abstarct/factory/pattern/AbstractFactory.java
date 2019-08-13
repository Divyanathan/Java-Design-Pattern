package creational.pattern.abstarct.factory.pattern;

public interface AbstractFactory {
    HttpHelper getHttpHelper(CompanyType pCompanyType);
}
