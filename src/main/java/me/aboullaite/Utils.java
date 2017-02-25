package me.aboullaite;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by aboullaite on 2017-02-23.
 */
@Component
public class Utils {

    private Random random;

public Utils(){
    random = new Random();
}

    public String generateRandomChars(String pattern, int length) {
        StringBuilder sb = new StringBuilder();


       return random.ints(0, pattern.length())
                .mapToObj(i -> pattern.charAt(i))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public Integer generateRandonInteger(Integer integer){
    return random.ints(integer, 80)
            .findAny()
            .getAsInt();
    }
}
