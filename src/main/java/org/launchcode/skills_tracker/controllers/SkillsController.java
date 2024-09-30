package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String landingPage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>A few skills I would like to learn are:</h2>" +
                "<ol>" +
                "<li>Python</li>" +
                "<li>Ruby</li>" +
                "<li>Go</li>" +
                "</ol>" +
                "</body>" +
                "</html";
    }

    @RequestMapping(value = "completed", method = {RequestMethod.GET, RequestMethod.POST})
    public String completedForm(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html";
    }

    @GetMapping("form")
    public String formPage() {

        return "<html>" +
                "<body>" +
                "<form action='completed' method='post'>" +
                "<label>Name:</label>" +
                "<br>" +
                "<input type='text' name='name'>" +
                "<br>" +
                "<select name='language1'>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Go'>Go</option>" +
                "</select>" +
                "<br>" +
                "<select name='language2'>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Go'>Go</option>" +
                "</select>" +
                "<br>" +
                "<select name='language3'>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Go'>Go</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
