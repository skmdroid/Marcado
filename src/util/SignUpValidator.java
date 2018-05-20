package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.Constants;
import dao.SignUpValidateDao;
import dto.UserDetailsDto;

public class SignUpValidator {
	
	//Logger log = Logger.getLogger(SignUpValidator.class.getName());
	
	public String signUpValidate(HttpServletRequest request, HttpServletResponse response)
	{
		
		SignUpValidateDao signUpValidateDaoObj = new SignUpValidateDao();
		
		//log.debug("***** Inside doPost SignUpServlet *****");
		
		if((signUpValidateDaoObj.checkIfValidUser(request.getParameter("username")) == 1) && isPwdMatch(request) 
				&& allFieldsPresent(request))
		{
			UserDetailsDto usrDetails = insertUserDetails(request);
			signUpValidateDaoObj.insertUserDetails(usrDetails);
			
			return Constants.SUCCESS;
		}
		else
		{
			return Constants.ERROR;
		}
					
	}
	
	public UserDetailsDto insertUserDetails(HttpServletRequest request)
	{
		System.out.println("*** inside insertUserDetails ****");
		UserDetailsDto userDetailsDtoObj = new UserDetailsDto();
		
		userDetailsDtoObj.setU_ID(request.getParameter("username"));
		userDetailsDtoObj.setPassword(request.getParameter("password"));
		userDetailsDtoObj.setU_Fname(request.getParameter("firstname"));
		userDetailsDtoObj.setU_Lname(request.getParameter("lastname"));
		userDetailsDtoObj.setContact(request.getParameter("mobile"));
		userDetailsDtoObj.seteMail(request.getParameter("emailid"));
		userDetailsDtoObj.setGender(request.getParameter("gender"));
		userDetailsDtoObj.setInstitution(request.getParameter("institution"));
		userDetailsDtoObj.setCourse(request.getParameter("course"));
		userDetailsDtoObj.setStartYear(request.getParameter("startyear"));
		userDetailsDtoObj.setLastYear(request.getParameter("endyear"));
		userDetailsDtoObj.setAddr(request.getParameter("address"));
				
		return userDetailsDtoObj;
	}
	
	public boolean isPwdMatch(HttpServletRequest request)
	{
		
		System.out.println("inside isPwdMatch************");
		
		if(request.getParameter("password").equals(request.getParameter("confirmpassword")))
			return true;
		
		return false;
	}
	
	public boolean allFieldsPresent(HttpServletRequest request)
	{
		
		System.out.println("inside allFieldsPresent************");
		if(request.getParameter("username") != null && request.getParameter("password") != null 
				&& request.getParameter("confirmpassword") != null && request.getParameter("firstname") != null
				&& request.getParameter("lastname") != null && request.getParameter("mobile") != null
				&& request.getParameter("emailid") != null && request.getParameter("gender") != null
				&& request.getParameter("institution") != null && request.getParameter("course") != null
				&& request.getParameter("startyear") != null && request.getParameter("endyear") != null
				&& request.getParameter("address") != null && request.getParameter("course") != null)
			return true;
		
		return false;
	}

}
