package me.aboullaite.viewResolver;

import me.aboullaite.view.CsvView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * Created by aboullaite on 2017-02-24.
 */
public class CsvViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        CsvView view = new CsvView();
        return view;
    }
}
