abstract public class PhoneDetail {

    public String phoneNum;
    private String userName;
    private String userAddress;

    public PhoneDetail(String phonenum, String username, String useradress) {
        this.phoneNum = phonenum;
        this.userAddress = username;
        this.userAddress = useradress;

    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void makeCall() {

    }

}
