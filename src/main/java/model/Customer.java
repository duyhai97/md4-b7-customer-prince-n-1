package model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table()
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty(message = "Khong de trong ten")
    @Size(min = 2, max = 30, message = "bao gom 2 den 30 ki tu")
    private String name;

    @Pattern(regexp = "(\\d{3}-)?\\d{2}-\\d{7}", message = "bat dau bang 0 va gom 12 ki tu")
    private String phone;

    @ManyToOne
    Province province;

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }



    public Customer() {
    }

    public Customer(Long id, @NotEmpty @Size(min = 2, max = 30) String name, @Pattern(regexp = "(\\d{3}-)?\\d{2}-\\d{7}") String phone, Province province) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.province = province;
    }

    public Customer(@NotEmpty @Size(min = 2, max = 30) String name, @Pattern(regexp = "(\\d{3}-)?\\d{2}-\\d{7}") String phone, Province province) {
        this.name = name;
        this.phone = phone;
        this.province = province;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
