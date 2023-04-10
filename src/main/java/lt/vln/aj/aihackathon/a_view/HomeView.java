package lt.vln.aj.aihackathon.a_view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-08
 */
@Route("")
@PageTitle("The Library")
@AnonymousAllowed
public class HomeView extends VerticalLayout {

    public HomeView() {

        ViewUtils.applyAlignment(this);

        var theLibraryH1 = new H1("The Library");
        var signUpButton = new Button("Sign Up");
        var loginButton = new Button("Login");
        Component[] components = new Component[]{
                theLibraryH1,
                signUpButton,
                loginButton};

        signUpButton.addClickListener(click -> UI.getCurrent().navigate(SignupView.class));
        loginButton.addClickListener(click -> UI.getCurrent().navigate(LoginView.class));
        ViewUtils.applyTheme(components);
        ViewUtils.setRequired(components);

        add(
                theLibraryH1,
                new HorizontalLayout(signUpButton, loginButton));

    }
}
//        List<TodoEntity> allTodoEntities = todoService.findAll();
//        allTodoEntities.forEach(todoEntity -> todosVerticalLayout.add(createCheckbox(todoEntity)));
//        VerticalLayout todosVerticalLayout = new VerticalLayout();
//        todosVerticalLayout.setPadding(false);

//        Button addButton = new Button("Add");
//        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//        addButton.addClickShortcut(Key.ENTER);
//        addButton.addClickListener(click -> {
//            if (!taskTextField.getValue().isBlank()) {
//                var todo = todoService.save(taskTextField.getValue());
//                todosVerticalLayout.add(createCheckbox(todo));
//                taskTextField.clear();
//            }
//        });

//    private Component createCheckbox(TodoEntity todoEntity) {
//        return new Checkbox(
//                todoEntity.getTask(),
//                todoEntity.isDone(),
//                e -> {
//                    todoEntity.setDone(e.getValue());
//                    todoService.save(todoEntity);
//                });
//    }