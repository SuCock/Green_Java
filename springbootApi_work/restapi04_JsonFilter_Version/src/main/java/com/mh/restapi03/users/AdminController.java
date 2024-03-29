package com.mh.restapi03.users;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/admin")
@RestController
@RequiredArgsConstructor
public class AdminController {

    private final UserRepository userRepository;

    @GetMapping("users/{id}")
    public MappingJacksonValue getUserById(@PathVariable Long id){
        // id가 없을경우 조회되는 유저가 없다는것을 보연준다(예외처리)
        User user = userRepository.findById(id).orElseThrow(
                () -> new UserException(ErrorCode.NOTFOUND)
        );

        AdminUser adminUser = new AdminUser();
        BeanUtils.copyProperties(user, adminUser);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(adminUser);
        // AdminUser의 클래스에서 username과 emil만 보여주겠다(spilt으로 안자르고 더 편하게 할 수 있다)
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("AdminUser", SimpleBeanPropertyFilter.filterOutAllExcept("username", "email", "password"));
        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;
    }

    @DeleteMapping("users/{id}")
    public User deleteUserById(Long id){
        return new User();
    }
}

