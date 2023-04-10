package lt.vln.aj.aihackathon.b_service.user;

import lt.vln.aj.aihackathon.b_service.signup.SignupDto;
import lt.vln.aj.aihackathon.c_data.user.UserEntity;
import lt.vln.aj.aihackathon.c_data.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-08
 */
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity processSignupForm(SignupDto signupDto) {
        //TODO implement the check on page also
        UserEntity foundByEmail = findByEmail(signupDto.email());
        UserEntity savedUserEntity;
        if (foundByEmail != null) {
            throw new RuntimeException("Email already exists");
        } else {
            savedUserEntity = userRepo.save(UserEntity.builder()
                    .fullName(signupDto.fullName())
                    .email(signupDto.email())
                    .phone(signupDto.phone())
                    .city(signupDto.city())
                    .address(signupDto.address()).build());
        }
        return savedUserEntity;
    }

    public UserEntity findByEmail(String email) {
        UserEntity byEmail = userRepo.findByEmail(email);
        return byEmail;
    }

}
