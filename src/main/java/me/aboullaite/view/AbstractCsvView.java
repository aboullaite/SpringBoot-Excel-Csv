 package me.aboullaite.view;

 import org.springframework.web.servlet.view.AbstractView;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import java.util.Map;

public abstract class AbstractCsvView extends AbstractView {

    private static final String CONTENT_TYPE = "text/csv";

    public AbstractCsvView() {
        setContentType(CONTENT_TYPE);
    }

    @Override
    protected boolean generatesDownloadContent() {
        return true;
    }


    @Override
    protected final void renderMergedOutputModel(
            Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType(getContentType());
        buildCsvDocument(model, request, response);
    }

    protected abstract void buildCsvDocument(
            Map<String, Object> model, HttpServletRequest request, HttpServletResponse response)
            throws Exception;


}