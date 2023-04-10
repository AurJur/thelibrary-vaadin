package lt.vln.aj.aihackathon.a_view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-08
 */
@Route("userhome")
@PageTitle("User Home | The Library")
@RolesAllowed({"USER", "ADMIN"})
public class UserHomeView extends VerticalLayout {
}
