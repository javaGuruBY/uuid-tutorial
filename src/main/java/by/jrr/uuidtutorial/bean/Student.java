package by.jrr.uuidtutorial.bean;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.nio.ByteBuffer;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Student {

    @Id @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)", length = 16, updatable = false)
    private byte[] uuid;
    private String name;

    @Override
    public String toString() {
        ByteBuffer bb = ByteBuffer.wrap(uuid);
        return "Student{" +
                "uuid=" + new UUID(bb.getLong(), bb.getLong())+
                ", name='" + name + '\'' +
                '}';
    }
}
