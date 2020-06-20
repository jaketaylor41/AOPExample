import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.sun.istack.internal.logging.Logger;

@Interceptor
public class SecurityInterceptor {
	
	

	@AroundInvoke
	public Object doSecurityCheck(InvocationContext context) throws Exception{
		
		
		//Do security check
		Logger.getLogger("SecurityLog", null)
		
		.info(context.getMethod().getName() + "is accessed!");
		
		return context.proceed();
		
		
		
		
	}
	
	
	
	
	
	
	
}