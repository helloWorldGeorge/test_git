package cn.hero.dao.impl.dbutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取配置属性
 * 
 * @author Fans.Lei[FansUnion@qq.com]
 * 
 */
public class PropertyReader {
	private static final String JDBC_PROPERTIES = "jdbc.properties";
	private static Properties ps;

	static {
		ps = new Properties();
		InputStream in = null;
		try {
			// PropertyReader.class所在位置
			in = PropertyReader.class.getResourceAsStream(JDBC_PROPERTIES);
			if (in == null) {
				// classpath路径下
				in = PropertyReader.class.getClassLoader().getResourceAsStream(
						JDBC_PROPERTIES);
			}
			ps.load(in);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String get(String key) {
		return (String) ps.get(key);
	}

}
