
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Divyanshu
 */
@Entity
@Table(name="PLACIO")
public class placio  {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
     int id;
    
    @Column(name="Name")
     String name;
    
    @Column(name="NAME2")
     String name2;
   
    @Column(name="EMAIL")   
     String email;
     
     @Column(name="PHONE")
     int  phone;
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

  
}
