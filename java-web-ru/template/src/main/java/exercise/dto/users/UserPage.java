package exercise.dto.users;

import exercise.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

// BEGIN
@AllArgsConstructor
@Getter
@ToString
public class UserPage {
    private User user;
    private String description;
}
// END
