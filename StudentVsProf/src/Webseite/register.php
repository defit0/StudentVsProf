<?php
    $string = "abc";
    require("dbconnect.php");
    require("SQL_Abfragen.php");
    if (isset($_POST["submit"])){ 
        
        if (strlen($_POST["password"]) >= 3 && strlen($_POST["name"]) >= 5 && !str_contains($_POST["name"], ' ') && !str_contains($_POST["password"], ' ')){
        $name = $_POST["name"];
        $password = PASSWORD_HASH($_POST["password"], PASSWORD_DEFAULT);
        //Bedingenungen um User zu erstellen: name und pw mind. 3 Zeichen max. 50. 
        $stmt = $db->prepare($getUser);//getuser
        $stmt->bindParam(":name", $name);
        $stmt->execute();
        
        $userAlreadyExists = $stmt->fetchColumn();
        
        if (!$userAlreadyExists){
            //User wird angelegt
            registerUser($name,$password);
            echo "<script>alert('Benutzer ".$_POST["name"]." erfolgreich angelegt!');</script>";
        }else{
            //User existiert schon
            echo "<script>alert('Der Benutzername ".$_POST["name"]." ist schon vergeben. Wähle einen anderen Benutzernamen!');</script>";
        }
    }
        else{
            echo "<script>alert('Der Benutzername muss mindestens 5 Zeichen lang sein und das Passwort muss mindestens 3 Zeichen lang sein. Leerzeichen sind nicht erlaubt.');</script>";
            }
    }

    //echo strlen($_POST["name"]);
    //echo strlen($_POST["password"]);


    function registerUser($name,$password){
        global $db;
        global $insertUser;
        $stmt = $db->prepare($insertUser);
        $stmt->bindParam(":name", $name);
        $stmt->bindParam(":password", $password);
        $stmt->execute();
        header("index.php");
        
    }
    


?>


<html>

<head>
    <title>Registrierung</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css.css">
</head>

<body>

    <div class="navbar">
        <img src="paint.svg" alt="logo">
        <nav>
            <ul>
                <li><a href="index.php">Home</a></li>
                <li><a href="register.php">Account erstellen</a></li>
                <li><a href="alleUser.php">Übersicht Nutzer</a></li>
                <li><a href="impressum.php">Impressum</a></li>
            </ul>
        </nav>
    </div>
    <br>
    <h1>Account Erstellen</h1>
    <section>

        <form id="formular" action="register.php" method="POST">
            <div class="inputFelder">
                <input type="text" placeholder="Beutzername" name="name" autocomplete="off">
                <br>
                <input type="password" placeholder="Passwort" name="password" autocomplete="off">
            </div>
            <button name="submit" role="button">Erstellen</button>
        </form>

    </section>

</body>

</html>
