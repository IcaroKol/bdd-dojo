package edu;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class Spark {

    public static void main(String[] args) {

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("welcome", "Mortal Kombat");
            model.put("startMessage", "Press Start");
            return new ModelAndView(model, "index.wm");
        }, new VelocityTemplateEngine());


        get("/fight",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "fight.wm");
        }, new VelocityTemplateEngine());


    }

}
