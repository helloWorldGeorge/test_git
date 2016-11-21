package cn.hero.dao.impl.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.DbUtils;


/**
 * DbUtils例子的父类，包含了一些常用的方法，获得连接、关闭连接、打印对象。
 * 
 * @author Fans.Lei[FansUnion@qq.com]
 * 
 *         2012-8-27 下午2:12:06
 */
public class DbUtilsExampleBase {

	// 数据源
	protected DataSource dataSource;

	// 数据库链接
	protected Connection connection;

	public DbUtilsExampleBase() {
		dataSource = new MyDataSource();
		try {
			connection = ConnectionProvider.getConnection();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用DbUtils工具方法关闭 数据库连接，不再处理null和异常情况
	 */
	public void close() {
		DbUtils.closeQuietly(connection);
	}

	protected static void print(Object[] result) {
		if (result == null) {
			System.out.println("null");
			return;
		}

		for (Object obj : result) {
			System.out.println(obj);
		}

	}

	protected static void print(Object result) {
		System.out.println(result);
	}

}
