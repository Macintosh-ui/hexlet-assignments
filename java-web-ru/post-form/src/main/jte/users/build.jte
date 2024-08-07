@import exercise.dto.users.UsersPage

@param UsersPage usersPage

@template.layout.page(

content = @'
<form action="/users" method="post">
<div>
    <label>
    First name
    <input type="firstName" name="First name" />
    </label>
</div>
<div>
    <label>
Last name
<input type="lastName" name="Last name" />
</label>
</div>
<div>
<label>
Email
<input type="email" required name="email" />
</label>
</div>
<div>
<label>
Пароль
<input type="password" required name="password" />
</label>
</div>
<input type="submit" value="Зарегистрировать" />
</form>
'
)

