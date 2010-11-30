package com.live.webmail.base;

import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 10-11-29
 * Time: 下午1:18
 */
public abstract class BaseTestCase extends TestCase {
    private static final String resource = "org/mybatis/example/Configuration.xml";
    public static SqlSessionFactory factory = null;

    @Override
    public void setUp() throws Exception {
        Reader reader = Resources.getResourceAsReader(resource);
        factory = new SqlSessionFactoryBuilder().build(reader);
        super.setUp();
    }
}
