
<?php
   /* $db = mysqli_connect("localhost", "reader", "reader", "hvsdatabase");
    if(!$db) {
        exit("Verbindungsfehler: ".mysqli_connect_error());
    }
    */
    $db = new PDO('mysql:host=localhost;dbname=hvsdatabase', 'reader', 'reader');
    if(!$db) {
        exit("Verbindungsfehler: ".mysqli_connect_error());
    }

?>