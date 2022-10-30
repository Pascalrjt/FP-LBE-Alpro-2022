# FP LBE Alpro 2022

- Pascal Roger Junior Tauran 5025211072
  - *inheritance*
  - enkapsulasi
  - abstraksi
  - *polymorphism*
- Perlihatkan implementasi konsep diatas pada README ini.
- Gunakan nama *class* yang sudah ada sebagai tema dari project ini.

Catatan: Program tidak harus dapat dijalankan, cukup ditunjukkan implementasi konsepnya saja.

Inheritance;<br/>
  public class UserA extends PhoneDetail { 
  -> refer to UserA.java: line 1

Encapsulation;<br/>
    public String getPhoneNum() {
        return this.phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    } 
   -> refer to PhoneDetail.java: line 14-20
    
 Abstraction:<br/>
  abstract public class PhoneDetail { 
  -> refer to PhoneDetail.java: line 1
 
Polymorphism:<br/>
  PhoneDetail userDetail1, userDetail2;
          userDetail1 = new UserA();
          userDetail2 = new UserB();
          userDetail1.makeCall();
          userDetail2.makeCall(); 
  -> refer to Telephone.java: line 4-7
        
  public class UserA extends PhoneDetail { 
  -> refer to UserA.java: line 1
  public class UserB extends PhoneDetail {
  -> refer to UserB.java: line 1
