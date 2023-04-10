package lt.vln.aj.aihackathon.b_service.creds;

import lt.vln.aj.aihackathon.c_data.creds.CredsEntity;
import lt.vln.aj.aihackathon.c_data.creds.CredsRepo;
import lt.vln.aj.aihackathon.c_data.user.UserEntity;
import lt.vln.aj.aihackathon.b_service.signup.SignupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-07
 */
@Service
public class CredsService {

    @Autowired
    private CredsRepo credsRepo;

    public void processSignupForm(SignupDto signupDto, UserEntity userEntity) {
        credsRepo.save(CredsEntity.builder()
                .userEntity(userEntity)
                .username(signupDto.username())
                .password(signupDto.password()).build());
    }

    public CredsEntity save(CredsEntity credsEntity) {
        CredsEntity savedCredsEntity = credsRepo.save(credsEntity);
        return savedCredsEntity;
    }

}
