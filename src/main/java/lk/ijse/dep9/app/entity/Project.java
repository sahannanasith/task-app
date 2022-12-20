package lk.ijse.dep9.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project implements SuperEntity {
    private int id;
    private String name;
    private String username;

    public Project(String name, String username) {
        this.name = name;
        this.username = username;
    }
}