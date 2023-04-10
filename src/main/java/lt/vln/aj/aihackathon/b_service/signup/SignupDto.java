package lt.vln.aj.aihackathon.b_service.signup;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-06
 */
public record SignupDto(String username,
                        String fullName,
                        String email,
                        String phone,
                        String city,
                        String address,
                        String password,
                        String repeatPassword) {
}
