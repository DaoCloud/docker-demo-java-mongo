package io.daocloud.controllers;

import io.daocloud.domains.Visitor;
import io.daocloud.repositories.VisitorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Rocky on 15/11/27.
 */
@RestController
public class VisitorController {

    @Resource
    VisitorRepository visitorRepository;

    @RequestMapping("")
    public String index(HttpServletRequest request){

        Visitor visitor = new Visitor();
        visitor.setId(UUID.randomUUID().toString());
        visitor.setIp(request.getRemoteAddr());
        visitor.setVisitDate(new Date());

        visitorRepository.save(visitor);

        Long count =  visitorRepository.count();


        return String.format("你是来自%s的第%d位访问者。",request.getRemoteAddr(),count);
    }
}
