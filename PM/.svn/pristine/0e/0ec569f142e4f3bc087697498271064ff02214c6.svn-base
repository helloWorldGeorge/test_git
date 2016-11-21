package cn.hero.dao.impl.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库连接的提供类
 * 
 * @author leiwen198962@qq.com
 * 
 */
public class ConnectionProvider {

	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		String driver = PropertyReader.get("driver");
		String url = PropertyReader.get("url");
		String user = PropertyReader.get("user");
		String password = PropertyReader.get("password");
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}

	public static Connection getConnection(String driver, String url,
			String user, String password) throws ClassNotFoundException,
			SQLException {
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}

}
