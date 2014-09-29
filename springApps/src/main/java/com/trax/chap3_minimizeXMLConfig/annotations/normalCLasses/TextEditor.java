package com.trax.chap3_minimizeXMLConfig.annotations.normalCLasses;


import com.trax.chap3_minimizeXMLConfig.annotations.annotation.frenchCheckerAnnotation;
import com.trax.chap3_minimizeXMLConfig.annotations.interfaces.CheckSpelling;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by SG0220142 on 8/8/2014.
 */
public class TextEditor {

    @Autowired
    @frenchCheckerAnnotation //Will use the class with custom annotation
    @Setter @Getter
    private CheckSpelling spellChecker;

    public void checkSpelling(){
        spellChecker.checkSpelling();
    }



// @Qualifier("hinchecker") //will pick up bean by name from the application context
//@autowired(required=false) // to put a null, this does not hold for IOC

}
