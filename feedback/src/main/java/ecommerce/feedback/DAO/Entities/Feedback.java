package ecommerce.feedback.DAO.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "feedback")
public class Feedback {

    @Id
    private Long id;
    private String name;
    private String description;


}
