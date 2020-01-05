package com.itcast.ssm.controller;

import com.itcast.ssm.bean.Item;
import com.itcast.ssm.bean.QueryVo;
import com.itcast.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * 1.ModelAndView    带着数据  返回视图路径           不建议使用
 * 2.String      返回视图路径  model带数据            官方推荐此种方式   解耦   数据  视图  分离  MVC  建议使用
 * 3.void       ajax  请求   合适   json格式数据 （response   异步请求使用
 **/
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/itemList.action")
    public ModelAndView itemList() {
        List<Item> itemList = itemService.getItemList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList", itemList);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }

    @RequestMapping(value = "/itemEdit.action")
    public ModelAndView itemEdit(Integer id, HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
        Item item = itemService.getItemById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("item", item);
        modelAndView.setViewName("editItem");
        return modelAndView;
    }


    @RequestMapping(value = "/updateItem.action", method = RequestMethod.POST)
    //public ModelAndView updateItem(QueryVo queryVo)
    //public ModelAndView updateItem(Item item, Integer id, String name, HttpServletRequest request) {
    public String updateItem(Item item, Integer id, String name, HttpServletRequest request) {
        itemService.updateItem(item);
        //ModelAndView modelAndView = new ModelAndView();
        //modelAndView.setViewName("success");
        //return modelAndView;

        return "forward:/item/itemList.action";
    }

    @RequestMapping(value = "/deletes.action", method = {RequestMethod.GET, RequestMethod.POST})
    //public ModelAndView deletes(Integer[] ids) {
    public ModelAndView deletes(QueryVo queryVo) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/updates.action", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView updates(QueryVo queryVo) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }

}
