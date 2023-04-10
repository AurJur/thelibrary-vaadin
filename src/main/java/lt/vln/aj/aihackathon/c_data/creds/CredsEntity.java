package lt.vln.aj.aihackathon.c_data.creds;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lt.vln.aj.aihackathon.c_data.user.UserEntity;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-06
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_creds")
public class CredsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "creds_id")
    private Long credsId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
