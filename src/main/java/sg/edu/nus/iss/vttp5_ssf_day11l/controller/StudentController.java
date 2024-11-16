package sg.edu.nus.iss.vttp5_ssf_day11l.controller;

import java.util.Date;
import java.util.List;
import java.text.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import sg.edu.nus.iss.vttp5_ssf_day11l.model.Student;

@RestController
@RequestMapping(path = "/student", method = RequestMethod.GET)
public class StudentController {
    
    private List<Student> studentList;

    
    public StudentController(List<Student> studentList) {
        this.studentList = studentList;
    }


    @RequestMapping(path = "/allStudents", method = RequestMethod.GET)
    public List<Student> listAllStudents() throws ParseException{

        //impt method to convert from Date() to String or Long
        Date date = new Date();
        //SimpleDateFormat dateformatter = new SimpleDateFormat("dd MM yyyy HH:mm:ss:SSSS zzz");
        //String stringDate = dateformatter.format(date);
        Long longDate = date.getTime();


        /* String dob = "18 Dec 1975 10:25:00.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob = sdf.parse(dob);
        Long longDate = dDob.getTime(); */

        Student s1 = new Student(1, "Damien", "Mee", longDate, "damienj@nus.edu.sg", "25 HMKT 123456");
        studentList.add(s1);
        Student s2 = new Student(2, "Ramien", "Rae", longDate, "ramienj@nus.edu.sg", "25 HMKT 123234");
        studentList.add(s2);
        Student s3 = new Student(3, "Lamien", "Doe", longDate, "lamienj@nus.edu.sg", "25 HMKT 123750");
        studentList.add(s3);

        return studentList;
    }
    
}
