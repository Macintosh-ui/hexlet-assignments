@import exercise.dto.users.UserPage
@param UserPage page

<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>Page of current user</title>
</head>
<body>
<h1>${page.getDescription()}</h1>
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
            <td>${page.getUser().getId()}</td>
            <td>${page.getUser().getFirstName()}</td>
            <td>${page.getUser().getLastName()}</td>
            <td>${page.getUser().getEmail()}</td>
        </div>
    </tr>
    </tbody>
</table>
</body>
</html>