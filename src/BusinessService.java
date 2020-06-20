import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.jboss.logging.Logger;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class BusinessService {
	
	@Interceptors(SecurityInterceptor.class)
	public void startService() {
		//Business logic
		Logger.getLogger("AppLog").info("done...");
	}
	
	public void startAnotherService() {
		//Business Logic
		Logger.getLogger("AppLog").info("Done again...");
	}

}
