package com.example.buysometing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Service
public class TestService  implements TestService {

    public BigDecimal buySomeThingByCustomeD( Integer appleCount,
                                   Integer strawberryCount,
                                   Interger mangoCount,
                                              String Customer){
        //appleCount 苹果斤数 strawberryCount 草莓斤数  mangoCount 芒果斤数
        //苹果斤数为空赋0
        appleCount=appleCount!=null?appleCount:0;
        //草莓斤数为空赋0
        strawberryCount=appleCount!=null?strawberryCount:0;
        //芒果斤数为空赋0
        mangoCount=appleCount!=null?mangoCount:0;
        //草莓价格
        BigDecimal strawberryAmount=BigDecimal.valueOf(strawberryCount).multiply(BigDecimal.valueOf(13));
        //苹果价格
        BigDecimal appleAmount=BigDecimal.valueOf(appleCount).multiply(BigDecimal.valueOf(8));
        //芒果价格
        BigDecimal mangoCount=BigDecimal.valueOf(appleCount).multiply(BigDecimal.valueOf(20))
         //判断是哪位顾客
        if(Customer!=null && "A".equals(Customer)){
            return appleCount.add(strawberryCount);
        }else if("B".equals(Customer)){
            return appleCount.add(strawberryCount).add(mangoCount);
        }else if("C".equals(Customer)){
            return appleCount.add(strawberryAmount.multiply(BigDecimal.valueOf(0.8)))
                    .add(mangoCount);
        }else if("D".equals(Customer)){
            BigDecimal allAmount=  appleCount.add(strawberryAmount.multiply(BigDecimal.valueOf(0.8)))
                    .add(mangoCount);
            return allAmount.compareTo(BigDecimal.valueOf(100)))>=0?allAmount.subtract(BigDecimal.valueOf(10))):
            allAmount;
        }else{
            return BigDecimal.valueOf(0);
        }
        return BigDecimal.valueOf(0);
    }

}
