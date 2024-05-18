package com.example;

// To handle this error, you can create a custom error controller that implements the ErrorController interface
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Handle the error
        // ...
        return "error-page"; // Replace with your actual error page
    }

    // No need to override getErrorPath() anymore
}
