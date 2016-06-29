package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by I322233 on 6/23/2016.
 */
@Entity(name = "user")
public class User implements Serializable {
    private int id;
    private String username;
    private Role userrole;

    @Id
    @Column(name="id",length = 32,nullable = true)
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator",strategy = "increment")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="username",nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "userrole",nullable = false)
    @Enumerated(EnumType.STRING)
    public Role getUserrole(){
        return userrole;
    }
    public void setUserrole(Role userrole){
        this.userrole = userrole;
    }
}
