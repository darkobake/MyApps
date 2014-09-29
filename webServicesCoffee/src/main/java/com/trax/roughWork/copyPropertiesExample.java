package com.trax.roughWork;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.BeanUtils;

/**
 * Created by SG0220142 on 7/19/2014.
 */
public class copyPropertiesExample {

    public static void main(String[] args) {
        copyproperties1 cop1 = new copyproperties1();
        cop1.setWebSiteName("ebay");
        cop1.setWebsiteSection("Market Place");
        copyproperties2 cop2 = new copyproperties2();
        cop2.setWebSiteName("Paypal");
        cop2.setWebsiteSection("Finanace Place");
        System.out.println("COP1==>" + ToStringBuilder.reflectionToString(cop1));
        System.out.println("COP2==>" + ToStringBuilder.reflectionToString(cop2));
        //copying beans:
        System.out.println("Copying COP1 to COP2");
        BeanUtils.copyProperties(cop1,cop2);
        System.out.println("COP1==>" + ToStringBuilder.reflectionToString(cop1));
        System.out.println("COP2==>" + ToStringBuilder.reflectionToString(cop2));
    }

}
