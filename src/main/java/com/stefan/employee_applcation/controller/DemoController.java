package com.stefan.employee_applcation.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
@RequiredArgsConstructor
public class DemoController {
    @GetMapping("/test")
    @PreAuthorize("hasRole('ADMIN')")
//    @PreAuthorize("hasAuthority('admin:read')")
    public String get() {
        return "GET:: admin controller";
    }

    @GetMapping()
    @PreAuthorize("hasRole('USER')")
    public String getSecond() {
        return "GET:: admin controller";
    }



}

