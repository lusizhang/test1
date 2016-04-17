package com.pandawork.web.controller;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.web.spring.AbstractController;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.ObjectUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * StudentController
 *
 * @author: mayuan
 * @time: 2015/8/26 16:57
 */
@Controller
@RequestMapping(value = " ")
@SessionAttributes("student")
public class StudentController extends AbstractController {

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String toIndex(Model model) {
        return "form";
    }




    @RequestMapping(value = "/personalInfo", method = RequestMethod.GET)
    public String ShowPersonalInfo(@RequestParam ("studentNumber")int studentNumber,Model model) {
        try {
            Student student = new Student();
            student = studentService.queryByStudentNumber(studentNumber);
            model.addAttribute("personalInfo", student);
            return "personalInfo";
        } catch (SSException ee) {
            LogClerk.errLog.error(ee);
            sendErrMsg(ee.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam ("stuNum")String stuNum,@RequestParam ("password")String password,Model model){
        try{
        Student student=new Student();
        if() {
            model.addAttribute("message","登录成功！");
            return "message";
        }
        }catch(SSException ee){
            LogClerk.errLog.error(ee);
            sendErrMsg(ee.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

}