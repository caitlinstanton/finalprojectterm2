public class extPersonType extends personType{
    addressType address;
    dateType dob;
    String phoneNumber;
    String personStatus;

    public extPersonType(String theFirst, String theLast, addressType newAddress, dateType newDob, String newPhoneNumber, String newPersonStatus){
        super(theFirst, theLast);
        address = newAddress;
        dob = newDob;
        phoneNumber = newPhoneNumber;
        personStatus = newPersonStatus;
    }
    public String toString(){
        return (this.getFirst() + " " + this.getLast() + "," + " " + address + " " + dob + " " + phoneNumber + " " + personStatus);
    }
}
