package lt.vln.aj.aihackathon.a_view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import lombok.experimental.UtilityClass;

import java.util.Arrays;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-08
 */
@UtilityClass
public class ViewUtils {

    public void applyTheme(Component... component) {

        Arrays.stream(component).forEach(c -> {
            if (c instanceof Button) {
                ((Button) c).addThemeVariants(ButtonVariant.LUMO_PRIMARY);
            } else if (c instanceof TextField) {
                ((TextField) c).addThemeVariants(TextFieldVariant.LUMO_HELPER_ABOVE_FIELD);
                ((TextField) c).setWidth("15em");
            } else if (c instanceof EmailField) {
                ((EmailField) c).addThemeVariants(TextFieldVariant.LUMO_HELPER_ABOVE_FIELD);
                ((EmailField) c).setWidth("15em");
            } else if (c instanceof PasswordField) {
                ((PasswordField) c).addThemeVariants(TextFieldVariant.LUMO_HELPER_ABOVE_FIELD);
                ((PasswordField) c).setWidth("15em");
            }
        });
    }

    public void setRequired(Component... components) {
        Arrays.stream(components).forEach(c -> {
            if (c instanceof TextField) {
                ((TextField) c).setRequired(true);
                ((TextField) c).setErrorMessage("This field is required");
            } else if (c instanceof EmailField) {
                ((EmailField) c).setRequired(true);
                ((EmailField) c).setErrorMessage("This field is required");
            } else if (c instanceof PasswordField) {
                ((PasswordField) c).setRequired(true);
                ((PasswordField) c).setErrorMessage("This field is required");
            }
        });
    }

    public void applyAlignment(VerticalLayout verticalLayout) {
        verticalLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        verticalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
    }

}
