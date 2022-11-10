package bookborrowingdb.controller;


import bookborrowingdb.pojo.BookTypeInfo;
import bookborrowingdb.service.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bookType")
public class BookTypeController {

    @Autowired
    private IBookTypeService bookTypeService;

    @RequestMapping("/findAllBookType")
    public String findAllBookType(BookTypeInfo bookTypeInfo, Model model){
        List<BookTypeInfo> bookTypeList = bookTypeService.findAll();
        model.addAttribute("bookTypeInfo",bookTypeList);
        return "/bookType/bookType_list";
    }

    @RequestMapping("showAdd")
    public String showAdd(){
        return "/bookType/bookType_add";
    }

    @RequestMapping("/addBookType")
    public String addBookType(BookTypeInfo bookTypeInfo,Model model){
        if(bookTypeService.addBookType(bookTypeInfo)){
            return "redirect:/bookType/findAllBookType";
        }else{
           model.addAttribute("error","添加错误");
           return "/error";
        }
    }

    @RequestMapping("/showById")
    public String showById(BookTypeInfo bookTypeInfo,Model model){
        BookTypeInfo Info = bookTypeService.findBookType(bookTypeInfo);
        model.addAttribute("bookTypeInfo",Info);
        return "/bookType/bookType_update";
    }

    @RequestMapping("/updateBookType")
    public String updateBookType(BookTypeInfo bookTypeInfo,Model model){
        if(bookTypeService.updateBookType(bookTypeInfo)){
            return "redirect:/bookType/findAllBookType";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }

    @RequestMapping("/deleteBookType")
    public String deleteBookType(BookTypeInfo bookTypeInfo,Model model){
        if(bookTypeService.deleteBookType(bookTypeInfo)){
            return "redirect:/bookType/findAllBookType";
        }else{
            model.addAttribute("error","删除失败");
            return "/error";
        }
    }
}
