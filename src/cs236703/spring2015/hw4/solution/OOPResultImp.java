/**
 * 
 */
package cs236703.spring2015.hw4.solution;

import cs236703.spring2015.hw4.provided.OOPResult;

/**
 * @author SAMEH
 *
 */
public class OOPResultImp implements OOPResult {
	public OOPTestResult _result;
	String _message;
	@Override
	public OOPTestResult getResultType() {
		return _result;
	}

	@Override
	public String getMessage() {
		return _message;
	}
	
	@Override
	public boolean equals(Object obj){
	       if (!(obj instanceof OOPResult))
	            return false;
	        if (obj == this)
	            return true;

	        OOPResult oopRes = (OOPResult) obj;	        
	        if(oopRes.getResultType().equals(_result) && oopRes.getMessage().equals(_message)){
	        	return true;
	        }else{
	        	return false;
	        }
	}

}
