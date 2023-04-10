package lt.vln.aj.aihackathon.b_service.signup;

import jakarta.transaction.Transactional;
import lt.vln.aj.aihackathon.b_service.creds.CredsService;
import lt.vln.aj.aihackathon.b_service.user.UserService;
import lt.vln.aj.aihackathon.c_data.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-08
 */
@Service
public class SignupService {

    @Autowired
    private UserService userService;
    @Autowired
    private CredsService credsService;
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public void dealWithSignupForm(SignupDto signupDto) {
        //TODO implement the checks on page also
        if (signupDto.username().isEmpty()) {
            throw new RuntimeException("Username is empty");
        }
        if (signupDto.fullName().isEmpty()) {
            throw new RuntimeException("Full name is empty");
        }
        if (signupDto.email().isEmpty()) {
            throw new RuntimeException("Email is empty");
        }
        if (signupDto.phone().isEmpty()) {
            throw new RuntimeException("Phone is empty");
        }
        if (signupDto.city().isEmpty()) {
            throw new RuntimeException("City is empty");
        }
        if (signupDto.address().isEmpty()) {
            throw new RuntimeException("Address is empty");
        }
        if (signupDto.password().isEmpty()) {
            throw new RuntimeException("Password is empty");
        }
        if (signupDto.repeatPassword().isEmpty()) {
            throw new RuntimeException("Repeat password is empty");
        }

        //TODO implement the check on page also
        if (!signupDto.password().equals(signupDto.repeatPassword())) {
            throw new RuntimeException("Passwords do not match");
        }

        UserEntity userEntity = userService.processSignupForm(signupDto);
        credsService.processSignupForm(signupDto, userEntity);
    }
}
