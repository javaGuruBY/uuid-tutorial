package by.jrr.uuidtutorial.repository;

import by.jrr.uuidtutorial.bean.Student;
import by.jrr.uuidtutorial.util.UuidUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void createStudentWithGeneratedUuid() {
        Student student = new Student();
        student.setName("Max");
        studentRepository.save(student);
    }

    @Test
    public void createStudentWithStringUuid() {
        Student student = new Student(UuidUtil.getBytes("4bcb2796-5af6-476e-befb-d56db038873f"), "Bax");
        Student stored = studentRepository.save(student);
        assertEquals(student, stored);
        stored.setName("updated");
        Student updated = studentRepository.save(stored);
        assertEquals(stored, updated);
    }

    @Test
    public void findById() {
        Student student = studentRepository.findById(UuidUtil.getBytes("4bcb2796-5af6-476e-befb-d56db038873f")).get();
    }
}
