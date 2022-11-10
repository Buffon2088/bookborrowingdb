package bookborrowingdb.controller;

import bookborrowingdb.pojo.BookInfo;
import bookborrowingdb.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping("/findAllBook")
    public String findAllBook(Model model){
        List<BookInfo> bookInfoList = bookService.findAllBook();
        model.addAttribute("bookInfo",bookInfoList);
        return "/book/book_list";
    }

    @RequestMapping("/showAdd")
    public String showAdd(){
        return "/book/book_add";
    }

    @RequestMapping("/addBook")
    public String addBook(BookInfo bookInfo,Model model){
        if (bookService.addBook(bookInfo)){
            return "redirect:/book/findAllBook";
        }else{
            model.addAttribute("error","添加失败");
            return "/error";
        }
    }

    @RequestMapping("/findById")
    public String findById(BookInfo bookInfo,Model model){
        BookInfo Info = bookService.findBook(bookInfo);
        model.addAttribute("bookInfo",Info);
        return "/book/book_update";
    }

    @RequestMapping("/updateBook")
    public String updateBook(BookInfo bookInfo,Model model){
        if (bookService.updateBook(bookInfo)){
            return "redirect:/book/findAllBook";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(BookInfo bookInfo,Model model){
        if (bookService.deleteBook(bookInfo)){
            return "redirect:/book/findAllBook";
        }else{
            model.addAttribute("error","删除失败");
            return "/error";
        }
    }
}
