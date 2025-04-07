package app;

public class User {
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAddress() {
        return address.getAddress();
    }
}
