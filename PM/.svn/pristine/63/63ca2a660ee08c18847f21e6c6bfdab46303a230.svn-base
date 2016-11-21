package help;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//������
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected ServletContext application;
	private SuperService implSuperService;
	
	public SuperService getImplSuperService() {
		return implSuperService;
	}
	@Resource
	public void setImplSuperService(SuperService implSuperService) {
		this.implSuperService = implSuperService;
	}

	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
		this.application = application;
	}

	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	public List find(String queryString)
//   Execute an HQL query.
	 {
		 return implSuperService.find(queryString);
	 }
 
	public List find(String queryString, Object... values) 
	//Execute an HQL query, binding a number of values to "?" parameters in the query string.
	{
		 return implSuperService.find(queryString, values);
	}
 
	public <T> T  get(Class<T> entityClass, Serializable id)
//	Return the persistent instance of the given entity class with the given identifier, or null if not found.
	{
		 return implSuperService.get(entityClass, id);
	}
 
	public int getMaxResults() 
//    Return the maximum number of rows specified for this HibernateTemplate.
	{
		return implSuperService.getMaxResults();
	}
	
	public boolean save(Object entity) 
//    Persist the given transient instance. 
	{
		return implSuperService.save(entity);
	}
	
	public void update(Object entity)
//    Update the given persistent instance, associating it with the current Hibernate Session. 
	{
		this.implSuperService.update(entity);
	}
	
	public void delete(Object entity) 
//    Delete the given persistent instance.
	{
		this.implSuperService.delete(entity);
	}
	
	public List findListBySQL(final String sql, final Object[] params)
	{
		return this.implSuperService.findListBySQL(sql, params);
	}
}
