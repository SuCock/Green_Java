package com.mh.restapi03.users;

import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.LogicException;
import com.mh.restapi03.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User regist(User user){
        // 중복처리
        // 해당 되는 email이 있으면 중복 나서 에러
        User emailUser = userRepository.findByEmail(user.getEmail());
        if(emailUser != null){
            throw new LogicException(ErrorCode.DUPLICATE);
        }

        // insert 구문 실행...
        User dbUser = userRepository.save(user);
        return dbUser;
    }

    public List<User> getAllUsers() {
        List<User> list = userRepository.findAll();
        return list;
    }

    public User getUserById(Long id){
        // findById Optional이라서 적어줬다
        // Optional은 하나의 통에 User가 들어가있다고 상객하면 된다
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty()){
            throw new UserException(ErrorCode.NOTFOUND);
        }else{
            return optionalUser.get();
        }
    }

    public User updateUser(User user){

        User emailUser = userRepository.findByEmail(user.getEmail());
        if(emailUser == null){
            throw new UserException(ErrorCode.NOTFOUND);
        }
        
        // 시간, 이름, 패스워드, 성별 변경 가능
        emailUser.setWdate(user.getWdate());
        emailUser.setUsername(user.getUsername());
        emailUser.setPassword(user.getPassword());
        emailUser.setGender(user.getGender());

        User dbUser = userRepository.save(user);
        return dbUser;

    }

    public void delete(Long id){

    }
}
