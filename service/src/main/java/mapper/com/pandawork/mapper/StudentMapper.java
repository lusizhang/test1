package com.pandawork.mapper;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentMapper {

    /**
     * 数一数学号和密码
     * @param studentNumber
     * @param password
     * @return
     * @throws Exception
     */
    public int countByStudentNumberAndPassword(@Param("studentNumber")int studentNumber,
                                               @Param("password")String password) throws Exception;

    /**
     * 根据学号查询学生
     * @param studentNumber
     * @return
     * @throws Exception
     */
   public Student queryByStudentNumber(@Param("studentNumber")int studentNumber) throws Exception;

    /**
     *
     * @param studentNumber
     * @return
     * @throws Exception
     */
    public String queryIndepw(@Param("studentNumber")int studentNumber)  throws Exception;

}


