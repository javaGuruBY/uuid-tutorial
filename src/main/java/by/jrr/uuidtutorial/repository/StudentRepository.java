package by.jrr.uuidtutorial.repository;

import by.jrr.uuidtutorial.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, byte[]> {

}
