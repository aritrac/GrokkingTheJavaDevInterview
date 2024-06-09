/*
This is a mutable class which will be present within Employee object and
When the class contains a mutable object reference,
    1.While initializing the field in constructor, perform a deep copy
    2.While returning the object from its getter method, make sure to return a copy
    rather than the actual object reference
 */
public class Address {
    private String city;
    private String state;

    public Address(String city, String state){
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString(){
        return "Address [city=" + city + ", state=" + state + "]";
    }
}
