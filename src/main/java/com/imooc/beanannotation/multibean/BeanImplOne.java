package com.imooc.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//order这个顺序只对list有效，对map无效，因为map通常对顺序没要求，一般是拿键来取对应的值 
@Order(2)
@Component
public class BeanImplOne implements BeanInterface {

}
