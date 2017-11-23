package com.jk.controller;

import com.jk.dao.MarketRepository;
import com.jk.model.Market;
import com.jk.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/11/16.
 */
@Controller
public class MarketController {
    @Autowired
    private MarketRepository marketRepository;
    @Resource
    MarketService marketService;


    @RequestMapping("/")
    public String index(){
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public String list(Model model){
        List<Market> market= marketService.getMarketList();
        model.addAttribute("market",market);
        return "market/list";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "market/marketAdd";
    }
    @RequestMapping("/add")
   public String add(Market market){
        marketService.save(market);
        return "redirect:/list";
    }
    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id){
        Market market= marketService.findMarketById(id);
        model.addAttribute("market",market);
        return "market/marketEdit";
    }
    @RequestMapping("/edit")
    public  String edit(Market market){
        marketService.edit(market);
        return "redirect:/list";
    }
    @RequestMapping("delete")
    public String delete(Long id){
        marketService.delete(id);
        return "redirect:/list";
    }
}
