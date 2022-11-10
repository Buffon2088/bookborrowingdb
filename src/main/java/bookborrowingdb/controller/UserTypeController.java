package bookborrowingdb.controller;

import bookborrowingdb.pojo.UserTypeInfo;
import bookborrowingdb.service.IUserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/userType")
public class UserTypeController {

    @Autowired
    private IUserTypeService userTypeService;

    @RequestMapping("/findAllUserType")
    public String findAllUserType(Model model){
        List<UserTypeInfo> userTypeInfoList = userTypeService.findAll();
        model.addAttribute("userTypeList",userTypeInfoList);
        return "/userType/userType_list";
    }

    @RequestMapping("/showAdd")
    public String showAdd(){
        return "/userType/userType_add";
    }

    @RequestMapping("/addUserType")
    public String addUserType(UserTypeInfo userTypeInfo,Model model){
        if (userTypeService.addUserType(userTypeInfo)){
            return "redirect:/userType/findAllUserType";
        }else{
            model.addAttribute("error","添加错误");
            return "/error";
        }
    }

    @RequestMapping("/findById")
    public String findById(UserTypeInfo userTypeInfo,Model model){
        UserTypeInfo Info = userTypeService.findUserType(userTypeInfo);
        model.addAttribute("userTypeList",Info);
        return "/userType/userType_update";
    }

    @RequestMapping("/updateUserType")
    public String updateUserType(UserTypeInfo userTypeInfo,Model model){
        if (userTypeService.updateUserType(userTypeInfo)){
            return "redirect:/userType/findAllUserType";
        }else{
            model.addAttribute("error","修改错误");
            return "/error";
        }
    }

    @RequestMapping("/deleteUserType")
    public String deleteUserType(UserTypeInfo userTypeInfo,Model model){
        if (userTypeService.deleteUserType(userTypeInfo)){
            return "redirect:/userType/findAllUserType";
        }else{
            model.addAttribute("error","删除失败");
            return "/error";
        }
    }
}
