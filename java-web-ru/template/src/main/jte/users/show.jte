@import exercise.dto.users.UserPage
@param UserPage userPage

<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>Page of current user</title>
</head>
<body>
<h1>${userPage.getDescription()}</h1>
<table>
    <caption>User info</caption>
    <thead>
    <tr>User id</tr>
    <tr>First name</tr>
    <tr>Last name</tr>
    <tr>E-mail</tr>
    </thead>
    <tbody>
    <tr>
        <div>
            <td>${userPage.getUser().getId()}</td>
            <td>${userPage.getUser().getFirstName()}</td>
            <td>${userPage.getUser().getLastName()}</td>
            <td>${userPage.getUser().getEmail()}</td>
        </div>
    </tr>
    </tbody>
</table>
</body>
</html>