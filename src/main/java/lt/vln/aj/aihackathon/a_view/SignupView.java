package lt.vln.aj.aihackathon.a_view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import lt.vln.aj.aihackathon.b_service.signup.SignupDto;
import lt.vln.aj.aihackathon.b_service.signup.SignupService;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-08
 */
@Route("signup")
@PageTitle("Sign Up | The Library")
@AnonymousAllowed
public class SignupView extends VerticalLayout {

    private SignupService signupService;

    public SignupView(SignupService signupService) {
        this.signupService = signupService;

        ViewUtils.applyAlignment(this);

        //Components
        var theLibraryH1 = new H1("The Library");
        var signupH2 = new H2("Sign Up");
        var usernameTextField = new TextField();
        var fullNameTextField = new TextField();
        var emailEmailField = new EmailField();
        var phoneTextField = new TextField();
        var cityTextField = new TextField();
        var addressTextField = new TextField();
        var passwordPasswordField = new PasswordField();
        var repeatPasswordPasswordField = new PasswordField();
        var submitButton = new Button("Submit");
        Component[] components = new Component[]{
                theLibraryH1,
                signupH2,
                usernameTextField,
                fullNameTextField,
                emailEmailField,
                phoneTextField,
                cityTextField,
                addressTextField,
                passwordPasswordField,
                repeatPasswordPasswordField,
                submitButton};

        //Component properties
        usernameTextField.setLabel("Username");
        fullNameTextField.setLabel("Full name");
        fullNameTextField.setHelperText("Enter your full name");
        emailEmailField.setLabel("Email address");
        phoneTextField.setLabel("Phone number");
        phoneTextField.setHelperText("Include country and area prefixes");
        cityTextField.setLabel("City");
        addressTextField.setLabel("Street address");
        passwordPasswordField.setLabel("Password");
        passwordPasswordField.setRevealButtonVisible(true);
        repeatPasswordPasswordField.setLabel("Repeat password");
        repeatPasswordPasswordField.setRevealButtonVisible(true);
        submitButton.addClickShortcut(Key.ENTER);
        submitButton.addClickListener(click -> {
            String username = usernameTextField.getValue();
            String fullName = fullNameTextField.getValue();
            String email = emailEmailField.getValue();
            String phone = phoneTextField.getValue();
            String city = cityTextField.getValue();
            String address = addressTextField.getValue();
            String password = passwordPasswordField.getValue();
            String repeatPassword = repeatPasswordPasswordField.getValue();
            SignupDto signupDto = new SignupDto(username, fullName, email, phone, city, address, password, repeatPassword);
            signupService.dealWithSignupForm(signupDto);
            //TODO add success notification
            UI.getCurrent().navigate(LoginView.class);
        });
        ViewUtils.applyTheme(components);
        ViewUtils.setRequired(components);

        add(components);

//        Icon checkIcon = VaadinIcon.CHECK.create();
//        checkIcon.setVisible(false);
//        passwordField.setSuffixComponent(checkIcon);

//        Div passwordStrength = new Div();
//        Span passwordStrengthText = new Span();
//        passwordStrength.add(new Text("Password strength: "),
//                passwordStrengthText);
//        passwordField.setHelperComponent(passwordStrength);

    }
}
