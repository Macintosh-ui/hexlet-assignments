@import exercise.dto.users.UsersPage
@param UsersPage page

<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>List of all users</title>
</head>
<body>
<h1>${page.getHeader()}</h1>
@if (page.getUsers().isEmpty())
    <p>There are no added users</p>
@else
    <table>
        <caption>List of users</caption>
        <thead>
            <tr>User id</tr>
            <tr>First name</tr>
            <tr>Last name</tr>
            <tr>E-mail</tr>
        </thead>
        @for(var user : page.getUsers())
            <tbody>
            <tr>
                <div>
                    <td>${user.getId()}</td>
                    <td>${user.getFirstName()}</td>
                    <td>${user.getLastName()}</td>
                    <td>${user.getEmail()}</td>
                </div>
                @endfor
            </tr>
            </tbody>
    </table>
@endif
</body>
</html>
