package com.imooc.luckymoeny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: DengChen
 * Date: 2019/4/1
 * Time: 15:11
 * code change the world
 */
@RestController
public class LuckymoneyController {

    private final LuckymoneyRepository luckymoneyRepository;

    private final LuckymoneyService luckymoneyService;

    @Autowired
    public LuckymoneyController(LuckymoneyRepository luckymoneyRepository, LuckymoneyService luckymoneyService) {
        this.luckymoneyRepository = luckymoneyRepository;
        this.luckymoneyService = luckymoneyService;
    }


    //获取红包列表
    @GetMapping("/luckymoneys")
    public List<Luckymoney> list() {
        return luckymoneyRepository.findAll();
    }

    //创建红包(发红包)
    @PostMapping("/create")
    public Luckymoney create(@RequestParam("producer") String producer,
                             @RequestParam("money")BigDecimal money) {

        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setProducer(producer);
        luckymoney.setMoney(money);
        return luckymoneyRepository.save(luckymoney);

    }

    //通过ID查询红包
    @GetMapping("/luckymoneys/{id}")
    public Luckymoney findById(@PathVariable("id") Integer id) {
        return luckymoneyRepository.findById(id).orElse(null);
    }

    //更新红包(领红包)
    @PutMapping("/luckymoneys/{id}")
    public Luckymoney update(@PathVariable("id") Integer id,
                             @RequestParam("consumer") String consumer) {
        Optional<Luckymoney> luckymoneyOptional = luckymoneyRepository.findById(id);
        if (luckymoneyOptional.isPresent()) {
            Luckymoney luckymoney = luckymoneyOptional.get();
            luckymoney.setConsumer(consumer);
            return luckymoneyRepository.save(luckymoney);
        }
        return null;
    }

    @PostMapping("/luckymoneys/two")
    public void createTwo() {
        luckymoneyService.createTwo();
    }

}
