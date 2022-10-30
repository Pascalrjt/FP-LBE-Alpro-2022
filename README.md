# FP LBE Alpro 2022

- Pascal Roger Junior Tauran 5025211072
  - *inheritance*
  - enkapsulasi
  - abstraksi
  - *polymorphism*
- Perlihatkan implementasi konsep diatas pada README ini.
- Gunakan nama *class* yang sudah ada sebagai tema dari project ini.

Catatan: Program tidak harus dapat dijalankan, cukup ditunjukkan implementasi konsepnya saja.

Inheritance:<br/>
  public class UserA extends PhoneDetail { <br/>
  -> refer to UserA.java: line 1<br/>

Encapsulation:<br/>
    public String getPhoneNum() {<br/>
        return this.phoneNum;<br/>
    }
    public void setPhoneNum(String phoneNum) {<br/>
        this.phoneNum = phoneNum;<br/>
    } 
   -> refer to PhoneDetail.java: line 14-20<br/>
    
 Abstraction:<br/>
  abstract public class PhoneDetail { <br/>
  -> refer to PhoneDetail.java: line 1<br/>
 
Polymorphism:<br/>
  PhoneDetail userDetail1, userDetail2;<br/>
          userDetail1 = new UserA();<br/>
          userDetail2 = new UserB();<br/>
          userDetail1.makeCall();<br/>
          userDetail2.makeCall(); <br/>
  -> refer to Telephone.java: line 4-7<br/>
        
  public class UserA extends PhoneDetail { <br/>
  -> refer to UserA.java: line 1<br/>
  public class UserB extends PhoneDetail {<br/>
  -> refer to UserB.java: line 1<br/>
