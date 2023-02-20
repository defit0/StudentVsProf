<html>


<head>
    <title>StudiVsDozent</title>
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
    
    <header>
        <h1>Top 10</h1>
    </header>
    <main>
        <table>
            <tr>
                <th>Platz</th>
                <th>Name</th>
                <th>erspielt am:</th>
                <th>Score</th>
            </tr>
            <?php
    
    include("dbconnect.php");
    include("SQL_Abfragen.php");
    $i = 1;
    foreach ($db->query($auflistungspieler) AS $row){
        echo "<tr> <td>";
        echo $i++." ";
        echo "</td> <td>";
        echo $row['name']." ";
        echo "</td> <td>";
        echo $row['datum']." ";
        echo "</td> <td>";
        echo $row['score']." ";
        echo "</td> </tr>";
    }    

    
    $ergebnis = null;
    $db = null;
?>
        </table>

    </main>


</body>

</html>
