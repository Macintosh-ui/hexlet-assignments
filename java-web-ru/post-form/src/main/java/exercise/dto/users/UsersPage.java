package exercise.dto.users;

import exercise.model.User;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN

@AllArgsConstructor
public class UsersPage {
    @Getter
    List<User> users;
}
// END
