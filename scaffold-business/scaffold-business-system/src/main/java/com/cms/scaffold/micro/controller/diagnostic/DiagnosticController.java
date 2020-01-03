package com.cms.scaffold.micro.controller.diagnostic;

import com.cms.scaffold.common.Common;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/diagnostic")
public class DiagnosticController {

    @GetMapping("/")
    public Map<String, List<String>> index() {
        Common build = Common.builder().build();
        Map<String, List<String>> content = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("/diagnostic/status/heartbeat");
        list.add("/diagnostic/status/diagnosis");
        content.put("endpoints", list);
        return content;
    }

    @GetMapping("/status/heartbeat")
    public String heartbeat() {
        return "OK";
    }

    @GetMapping("/status/diagnosis")
    public String diagnosis() {
        return "OK";
    }
}
