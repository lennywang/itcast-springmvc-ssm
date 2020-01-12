package com.itcast.ssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 **/
public class CusomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();

        if (e instanceof MessageException) {
            MessageException exception = (MessageException) e;
            modelAndView.addObject("error", exception.getMsg());
        } else {
            modelAndView.addObject("error", "未知异常");
        }
        modelAndView.setViewName("error");

        return modelAndView;
    }
}
