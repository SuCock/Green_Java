package com.mh.restapi03.login;

import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.UserException;
import com.mh.restapi03.users.User;
import com.mh.restapi03.users.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
@RequiredArgsConstructor
public class LoginInterceptor implements HandlerInterceptor {

    private final UserRepository userRepository;

    // 유저인지 확인
    // HandlerInterceptor를 preHandle 다른요청오기 이전에 동작하는애
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("일로오나");
        String password = request.getHeader("password");
        String email = request.getHeader("email");

        System.out.println(password);
        System.out.println(email);

        User dbUser = userRepository.findByEmailAndPassword(email, password);
        if(dbUser == null){
            throw new UserException(ErrorCode.LOGINFAIL);
        }else{
            return true;
        }
    }
}
