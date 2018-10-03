package org.mosip.registration.service;

import java.util.List;
import java.util.Map;

import org.mosip.registration.dto.RegistrationCenterDetailDTO;
import org.mosip.registration.dto.ResponseDTO;
import org.mosip.registration.exception.RegBaseCheckedException;

/**
 * Service Class for Login
 * 
 * @author Sravya Surampalli
 * @since 1.0.0
 *
 */
public interface LoginService {
	
	/**
	 * get login modes
	 * 
	 * @return Map of login modes along with sequence
	 */
	Map<String, Object> getModesOfLogin();

	/**
	 * validating user credentials
	 * 
	 * @param userId
	 * 		  entered userId
	 * @param hashPassword
	 * 		  entered password with hashing		
	 * @return boolean true or false
	 */
	boolean validateUserPassword(String userId, String hashPassword);

	/**
	 * fetching user details
	 * 
	 * @param userId
	 * 		  entered userId 		
	 * @return map with user details
	 */
	Map<String, String> getUserDetail(String userId);

	/**
	 * fetching registration center name
	 * 
	 * @param centerId
	 * 		  centerId corresponding to entered userId
	 * @return String center name
	 */
	String getCenterName(String centerId);

	/**
	 * fetching registration center details
	 * 
	 * @param centerId
	 * 		  centerId corresponding to entered userId
	 * @return RegistrationCenterDetailDTO center details
	 */
	RegistrationCenterDetailDTO getRegistrationCenterDetails(String centerId);

	/**
	 * fetching registration user roles
	 * 
	 * @param userId
	 * 		  entered userId 		
	 * @return List of user roles
	 */
	List<String> getRoles(String userId);

	/**
	 * get otp
	 * 
	 * @param key
	 *            eoUserName to generate OTP
	 * @return Response success or Error
	 */
	public ResponseDTO getOTP(String key);


	/**
	 * OTP validation entered by user
	 * 
	 * @param key
	 *            is eoUsername
	 * @param otp
	 *            user entered
	 * @return Response success or error
	 */

	public ResponseDTO validateOTP(String key, String otp);

}
