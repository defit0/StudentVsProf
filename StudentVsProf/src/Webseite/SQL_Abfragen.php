
<?php
    
    
    $auflistungspieler = "SELECT name, datum, score FROM highscoreliste ORDER BY score DESC LIMIT 10;";

    //geht in sql aber nicht in php
    //$auflistungspieler = "SELECT name, DATE_FORMAT(datum, '%d/%m/%Y') AS nicedate, score FROM highscoreliste ORDER BY score DESC LIMIT 10;"
        
    $alluser = "SELECT name FROM benutzer ORDER BY name";
    


?>