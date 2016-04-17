package com.pandawork.service;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *StudentService
 * @author: mayuan
 * @time: 2015/3/26 19:25
 */
public interface StudentService {


        /**
         * 判断登录
         * @param studentNumber
         * @param password
         * @return
         * @throws SSException
         */
        public boolean checkLogin(int studentNumber,String password) throws SSException;


        /**
         * 数一数学生个数
         * @param studentNumber
         * @param password
         * @return
         * @throws Exception
         */
        public int countByStudentNumberAndPassword(@Param("studentNumber")int studentNumber,
                                                      @Param("password")String password) throws Exception;

        /**
         *
         * @param studentNumber
         * @param indew
         * @return
         * @throws SSException
         */
        public boolean checkIndepw(int studentNumber,String indew) throws  SSException;

        /**
         * 根据学号查询学生
         * @return
         * @throws SSException
         */
        public Student queryByStudentNumber(int studentNumber) throws SSException;
}
