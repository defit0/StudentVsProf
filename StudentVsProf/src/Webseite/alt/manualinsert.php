<?php
    
    
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // collect value of input field
    $name = $_POST['name'];
    $datum = $_POST['datum'];
    $score = $_POST['score'];
    
    
    
    if (empty($name)||empty($datum)||empty($score)) {
        echo "Something is empty";
    } else {
        include("loschmich.php");
        $manualinsert = "INSERT INTO highscoreliste (name,datum,score) VALUES ('$name', '$datum', $score);";      
        $erg = mysqli_query($db, $manualinsert);
        header('Location: Highscoreliste.php');
    }
}


    //
?>
