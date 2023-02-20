<?php
     function processGetData2(){
                   
                 

         if (isset($_POST["name"], $_POST["email"], $_POST["password"], $_POST["sex"], $_POST["textfeld"]) && $_POST["name"] != null && $_POST["email"] != null && $_POST["password"] != null && $_POST["sex"] != null && $_POST["textfeld"] != null) {
             
             if (strlen($_POST["password"])<3){
                 echo "passwort zu kurz.";
                 
             }
                    echo '<p>Diese Daten wurden übermittelt: </p><br>';
                    echo $_POST['name'];
                    echo "<br>";
                    echo $_POST['email'];
                    echo "<br>";
                    echo $_POST['password'];
                    echo "<br>";
                    echo $_POST['sex'];
                    echo "<br>";
                    echo $_POST['textfeld'];                
    }
         else{
             echo '<p>Bitte alle Werte eintragen!</p>';
         }
         
}
    
            
?>
