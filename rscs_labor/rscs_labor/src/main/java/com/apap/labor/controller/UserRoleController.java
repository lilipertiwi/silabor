//package com.apap.labor.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.apap.labor.model.UserRoleModel;
//import com.apap.labor.service.UserRoleService;
//
//@Controller
//@RequestMapping("/user")
//
//public class UserRoleController {
//	@Autowired
//	private UserRoleService userService;
//	
////	@RequestMapping(value ="/addUser", method=RequestMethod.POST)
////	private String addUserSubmit(@ModelAttribute UserRoleModel user) {
////		userService.addUser(user);
////		return "home";
////	}
//	
//	@RequestMapping(value ="/addUser", method=RequestMethod.POST)
//	private String addUserSubmit(@ModelAttribute UserRoleModel user, Model model) {
//        if (user.getPassword().length() < 8) {
//            model.addAttribute("warningmessage", "Password cannot be less than 8 characters!");
//            return "home";
//        } 
//        else {
//            if (user.getPassword().matches(".[a-zA-Z].") && user.getPassword().matches(".[0-9].")) {
//                userService.addUser(user);
//                model.addAttribute("warningmessage", "new user added successfull!");
//                return "home";
//            } else {
//                model.addAttribute("warningmessage", "Password must contain alphabet and number!");
//                return "home";
//            }
//        }
//    }
//	
//	@RequestMapping(value="/updatePassword", method=RequestMethod.POST)
//    private String updatePasswordSubmit(String newPassword, 
//    		String confirmPassword,
//    		Model model, String oldPassword, String username) {
//    	UserRoleModel user = userService.findUserByUsername(username);
//    	
//    	if (userService.validateOldPassword(user, oldPassword)) {
//    		if (newPassword.equals(confirmPassword)) {
//    				user.setPassword(newPassword);
//    				userService.addUser(user);
//    				model.addAttribute("message", "password has been updated!");
//    		} else {
//    				model.addAttribute("message", "you have "
//    						+ "inputted the wrong new password");
//    		}
//    	} else {
//    		model.addAttribute("message", "wrong old password");
//    	}
//    	return "home";
//    }
//
//}