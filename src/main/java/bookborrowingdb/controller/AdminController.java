package bookborrowingdb.controller;

import bookborrowingdb.pojo.AdminInfo;
import bookborrowingdb.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")

public class AdminController {

    @Autowired
    private IAdminService adminService;

    @RequestMapping("adminLogin")
    public String AdminLogin(AdminInfo adminInfo, Model model, HttpSession session){
         if(adminService.adminLogin(adminInfo)){
             AdminInfo Info = adminService.findAdminByLoginName(adminInfo);
             session.setAttribute("adminInfo",Info);
             return "/admin/adminHome";
         }else{
             model.addAttribute("error","登陆失败");
             return "/error";
         }
    }

    @RequestMapping("/login")
    public String Login(){
        return "/adminLogin";
    }

    @RequestMapping("/findAllAdmin")
    public String findAllAdmin(AdminInfo adminInfo,Model model){
        List<AdminInfo> adminInfoList = adminService.findAll();
        model.addAttribute("adminList",adminInfoList);
        return "/adminList";
    }

    @RequestMapping("/addAdmin")
    public String addAdmin(AdminInfo adminInfo,Model model){
        if(adminService.addAdmin(adminInfo)){
            return "redirect:/admin/findAllAdmin";
        }else{
            model.addAttribute("error","注册失败");
            return "/error";
        }
    }

    @RequestMapping("/showAdd")
    public String showAdd(){
        return "/admin/admin_add";
    }

    @RequestMapping("/findById")
    public String findById(AdminInfo adminInfo,Model model){
        AdminInfo Info = adminService.findAdminById(adminInfo);
        model.addAttribute("adminInfo",Info);
        return "/admin/admin_update";
    }

    @RequestMapping("/updateAdmin")
    public String updateAdmin(AdminInfo adminInfo,Model model){
        if(adminService.updateAdmin(adminInfo)){
            return "redirect:/admin/findAllAdmin";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }

    @RequestMapping("deleteAdmin")
    public String deleteAdmin(AdminInfo adminInfo,Model model){
        if(adminService.deleteAdmin(adminInfo)){
            return "redirect:/admin/findAllAdmin";
        }else{
            model.addAttribute("error","删除失败");
            return "/error";
        }
    }
}
