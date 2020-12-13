package test14;

public class Adress {
    private String country;
    private String provincial;
    private String city;
    private String street;
    private String zipcode;
    public Adress(String country,String provincial,String city,String street,String zipcode){
        this.country=country;
        this.provincial=provincial;
        this.city=city;
        this.street=street;
        this.zipcode=zipcode;
    }
    public String toString(){
        return "country is"+country+"procincial is"+provincial+"city is"+city+"street is"+street+"zipcode is"+zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvincial() {
        return provincial;
    }

    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
