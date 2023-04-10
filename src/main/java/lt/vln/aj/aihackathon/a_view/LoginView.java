package lt.vln.aj.aihackathon.a_view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-08
 */
@Route("login")
@PageTitle("Login | The Library")
@AnonymousAllowed
public class LoginView extends VerticalLayout implements BeforeEnterObserver {

    private final LoginForm loginForm = new LoginForm();

//    private LoginService loginService;

    public LoginView(/*LoginService loginService*/) {

//        this.loginService = loginService;

        //Components
        var theLibraryH1 = new H1("The Library");
        var loginH2 = new H2("Login");
        Component[] components = new Component[]{
                theLibraryH1,
                loginH2,
                loginForm};

        addClassName("login-view");
        setSizeFull();
        ViewUtils.applyAlignment(this);

        loginForm.setAction("login");

        add(components);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
        // inform the user about an authentication error
        if(beforeEnterEvent.getLocation()
                .getQueryParameters()
                .getParameters()
                .containsKey("error")) {
            loginForm.setError(true);
        }
    }

    //Components
     /*   var loginH1 = new H1("The Library | Login");
        var usernameTextField = new TextField();
        var passwordPasswordField = new PasswordField();
        var submitButton = new Button("Log In");
        Component[] components = new Component[]{
                loginH1,
                usernameTextField,
                passwordPasswordField,
                submitButton};
*/
    //Component properties
     /*   usernameTextField.setLabel("Username");
        passwordPasswordField.setLabel("Password");
        passwordPasswordField.setRevealButtonVisible(true);
        submitButton.addClickShortcut(Key.ENTER);
        submitButton.addClickListener(click -> {
            String username = usernameTextField.getValue();
            String password = passwordPasswordField.getValue();
            LoginDto loginDto = new LoginDto(username, password);
            loginService.dealWithLoginForm(loginDto);
            //TODO add success notification
            UI.getCurrent().navigate(UserHomeView.class);
        });
        ViewUtils.applyTheme(components);
        ViewUtils.setRequired(components);

        add(components);*/

//    }
}
