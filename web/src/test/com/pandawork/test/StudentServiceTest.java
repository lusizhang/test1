package test;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * StudentServiceTest
 *
 * @author: mayuan
 * @time: 2015/8/24 20:02
 */
public class StudentServiceTest extends AbstractTestCase {

    @Autowired
    private StudentService studentService;


    @Test
    public  void checkLogin() throws SSException{
        Student student = new Student();
        student .setStudentNumber(2014012172);
        student.setPassword("123456");
        if(studentService .checkLogin(student.getStudentNumber(),student.getPassword()))
       System.out.print("登录成功！");
    }





}
