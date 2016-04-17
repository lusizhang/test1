package com.pandawork.service.impl;

import com.pandawork.common.entity.Student;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.common.util.CommonUtil;
import com.pandawork.mapper.StudentMapper;
import com.pandawork.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * StudentServiceImpl
 * Created by chant on 2016/3/23.
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public int countByStudentNumberAndPassword(int studentNumber,String password) throws SSException{
           int count = 0;
        try {
//             if(Assert.isNull(studentNumber)&& Assert.isNull(password)){
//                 return false;
//             }else{
                 count++;
           //  }
        } catch (Exception e) {
           LogClerk.errLog.error(e);
           throw SSException.get(NFException.SystemException, e);
        }

       return count;
    }

        @Override
        public boolean checkLogin(int studentNumber, String password) throws SSException {
            if (Assert.isNull(studentNumber)&&Assert.isNull(password)){
                return false;
            }
            try {
                password = CommonUtil.md5(password);
                return studentMapper.countByStudentNumberAndPassword(studentNumber,password) >= 1?true:false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

    @Override
    public Student queryByStudentNumber(@Param("studentNumber") int studentNumber) throws SSException {
//       if(Assert.isNull(studentNumber)){
//           return false;
//       }
        try {
            return studentMapper.queryByStudentNumber(studentNumber) ;
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }


    @Override
    public boolean checkIndepw(int studentNumber,String indepw) throws SSException {
        try {
            if(studentMapper.queryIndepw(studentNumber).equals(indepw)){
                return true;
            }
            else{return false;}
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

}
