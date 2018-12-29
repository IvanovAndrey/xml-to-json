package com.Ivanov.convert;

import com.Ivanov.convert.XmlToJsonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * XML-to-JSON-service Controller.
 * Service waits for HTTP POST requests by path "localhost/convert"
 * and then handles them using XmlToJsonService class.
 *
 * @author Ivanov Andrey
 */

@RestController
public class Controller {

    private final XmlToJsonService service;

    public Controller(XmlToJsonService service) {
        this.service = service;
    }

    /**
     * HTTP POST requests handler
     * @param xml - input xml
     * @return - ready json string
     */
    @PostMapping("/convert")
    public String xmlToJson(@RequestBody String xml) {
        return service.parseXmlToJson(xml);
    }

}