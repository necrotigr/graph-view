package nl.trampam.prototype.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * Created by sergey on 11.07.2017.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("view")
    public void viewData(HttpServletResponse response) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("AAA");
        sb.append("BBB");
        try (OutputStream os = response.getOutputStream()) {
            IOUtils.write(sb.toString(), os, Charset.forName("utf-8"));
            os.flush();
        }
    }
}
