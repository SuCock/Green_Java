package com.mh.restapi03.users;

import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.UserException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "User-Controller", description = "유저 조회 등록 수정 삭제")
public class UserController {

    /*
        get 사용자 조회
        post 사용자 등록
        put 사용자 수정
        delete 사용자 삭제
     */
    private final UserService userService;
    private final UserRepository userRepository;

    @Operation(summary = "사용자 전체 목록보기", description = "사용자 전체 정보를 조회 할 수 있습니다")
    @ApiResponses(
            {
                    @ApiResponse(responseCode = "200", description = "OK"),
                    @ApiResponse(responseCode = "404", description = "사용자들이 없을 때 나오는 코드")
            }
    )
    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> list = userService.getAllUsers();
        if(list.size() == 0){
            throw new UserException(ErrorCode.NOTFOUND);
        }
        return ResponseEntity.ok(list);
    }

    @GetMapping("users/{id}") // 단건조회
    @Operation (summary = "사용자 단건 조회", description = "사용자 한명만 조회하기")
    @Parameter(description = "조회하고자 하는 사용자 ID를 입력해주세요",
            name = "사용자 ID",
            required = true)
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        System.out.println(id);

        User user = userService.getUserById(id);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody @Valid UserDto userDto){

        userDto.setWdate(LocalDateTime.now());

        ModelMapper mapper = new ModelMapper();
        User user = mapper.map(userDto,User.class);

//        User user = UserDto.of(userDto);
        User dbuser = userService.regist( user );

        return ResponseEntity.status(HttpStatus.CREATED).body(dbuser);
    }

    @PutMapping("users")
    // Valid를 적으면 username을 빈값으로 보내면 오류가 떠진다(유효성 검사, 똑같은 이메일이 없으면 수정이안된다)
    public ResponseEntity<User> updateUser(@RequestBody @Valid UserDto userDto){
        ModelMapper mapper = new ModelMapper();
        User user = mapper.map(userDto, User.class);
        user.setWdate(LocalDateTime.now());

        User dbUser = userService.updateUser(user);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbUser);
    }

    @DeleteMapping("users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("삭제됨");
    }

    @DeleteMapping("users/all")
    public ResponseEntity<String> deleteUser(){
        userService.delete();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("삭제됨");
    }

    // springframwork의 Transactional을 import해야한다
    @Transactional(readOnly = true) // 영구속성에 의해서 setter 메서드 사용시 db Update구문 실행됨
    @GetMapping("users/tran")
    public String usresTran(){

        User dbUser = userRepository.findById(1L).orElseThrow();
        // 1번의 이름 데이터가 김길동으로 자동으로 바뀐다
        // 무분별한 업데이트 구문이 날라갈 수 있어 안쓰는걸 추천
        dbUser.setUsername("김길동");
        dbUser.setEmail("qwer@naver.com");

        return "tran";
    }
}

