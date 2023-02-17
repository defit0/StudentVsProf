<html>


<head>
    <title>StudiVsProf</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css.css">
</head>

<body>
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
