package com.cjm.boot.demo.handler;


import com.cjm.boot.demo.common.status.StatusInfo;
import com.cjm.boot.demo.common.ResponseEntity;
import com.cjm.boot.demo.exception.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    private Map<String,Object> exceptionHandler(HttpServletRequest req,Exception e){
//        Map<String,Object> modelMap=new HashMap<>();
//        modelMap.put("success",false);
//        modelMap.put("errMsg",e.getMessage());
//        return  modelMap;
//    }

    private static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 全局异常捕捉处理
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<?> errorHandler(Exception e) {
        ResponseEntity<Boolean> res = new ResponseEntity<>(StatusInfo.BUSINESS_FAILURE.getCode(),
                StatusInfo.BUSINESS_FAILURE.getMessage());
        log.error("runtime exception" + " >_> " + e.getMessage(), e);
        return res;
    }

    /**
     * 异常信息获取
     *
     * @param t
     * @return
     */
    public static String printStackTraceToString(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw, true));
        return sw.getBuffer().toString();
    }

    /**
     * 自定义异常捕捉处理
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public ResponseEntity<?> myErrorHandler(MyException e) {
        ResponseEntity<Boolean> res = new ResponseEntity<>();

        res.setCode(e.getErrorCode());
        res.setMessage(e.getMessage());

        log.error("customize exception" + " >_> " + e.getMessage(), e);

        return res;
    }



    /**
     * 注解数据校验
     */

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<?> myErrorHandler(MethodArgumentNotValidException e) {
        ResponseEntity<Boolean> res = new ResponseEntity<>();


        res.setCode(StatusInfo.REQUEST_ERROR.getCode());


        res.setMessage(e.getBindingResult().getFieldError().getDefaultMessage());

        log.error("customize exception" + " >_> " + e.getMessage(), e);

        return res;
    }

}
