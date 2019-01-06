package com.abb.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.abb.model.User;

public class MybatisFirst {
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {  
        // mybatis配置文件  
        String resource = "SqlMappingConfig.xml";  
        // 得到配置文件流  
        InputStream inputStream = Resources.getResourceAsStream(resource);  
        // 创建会话工厂，传入mybatis的配置文件信息  
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);  
        return sqlSessionFactory;  
    }  
  
    // 根据id查询用户信息，得到一条记录结果  
    @Test  
    public void findUserByIdTest() throws IOException {  
  
        // 通过工厂得到SqlSession  
        SqlSession sqlSession = this.getSqlSessionFactory().openSession();  
  
        // 通过SqlSession操作数据库  
        // 第一个参数：映射文件中statement的id，等于=namespace+"."+statement的id  
        // 第二个参数：指定和映射文件中所匹配的parameterType类型的参数  
        // sqlSession.selectOne结果 是与映射文件中所匹配的resultType类型的对象  
          
                // selectOne查询出一条记录（这种很麻烦的！！！往后看看）  
        User user = sqlSession.selectOne("test.findUserById", 1);  
        System.out.println(user);  
        // 释放资源  
        sqlSession.close();  
    }  
}
