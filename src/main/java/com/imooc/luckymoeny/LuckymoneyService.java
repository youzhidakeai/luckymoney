package com.imooc.luckymoeny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: DengChen
 * Date: 2019/4/1
 * Time: 15:58
 * code change the world
 */
@Service
public class LuckymoneyService {

    private final LuckymoneyRepository luckymoneyRepository;

    @Autowired
    public LuckymoneyService(LuckymoneyRepository luckymoneyRepository) {
        this.luckymoneyRepository = luckymoneyRepository;
    }

    @Transactional
    public void createTwo() {
        Luckymoney luckymoney520 = new Luckymoney();
        luckymoney520.setProducer("kkc");
        luckymoney520.setMoney(new BigDecimal(520));
        luckymoneyRepository.save(luckymoney520);

        Luckymoney luckymoney1314 = new Luckymoney();
        luckymoney1314.setProducer("kkc");
        luckymoney1314.setMoney(new BigDecimal(1314));
        luckymoneyRepository.save(luckymoney1314);
    }
}
