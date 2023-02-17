<html>


<head>
    <title>Benutzer</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css.css">
</head>

<body>
    <header>
        <h1>Alle User</h1>
    </header>
    <main>
        <table>
            <tr>
                <th>Nummer</th>
                <th>Name</th>
            </tr>
            <?php
    
    include("dbconnect.php");
    include("SQL_Abfragen.php");
    $i = 1;
    foreach ($db->query($alluser) AS $row){
        echo "<tr> <td>";
        echo $i++." ";
        echo "</td> <td>";
        echo $row['name']." ";
        echo "</td> </tr>";
    }    

    
    $ergebnis = null;
    $db = null;
?>
        </table>

    </main>
    <footer>
    <a href="Highscoreliste.php">zurück</a>
    
    </footer>

</body>

</html>
