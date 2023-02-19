<?php

    function processGetData(){
        
    if (isset($_GET['xwert']) && isset($_GET['ywert']) && $_GET['xwert'] != null && $_GET['ywert'] != null) {
        
        if($_GET['operatoren']=='plus'){            //plus
            $result = $_GET['xwert'] + $_GET['ywert'];
            echo $_GET['xwert']." + ".$_GET['ywert']." = ".$result;
        }
        if($_GET['operatoren']=='minus'){            //minus
            $result = $_GET['xwert'] - $_GET['ywert'];
            echo $_GET['xwert']." - ".$_GET['ywert']." = ".$result;
        }
        if($_GET['operatoren']=='mal'){    
            $result = $_GET['xwert'] * $_GET['ywert'];
            echo $_GET['xwert']." x ".$_GET['ywert']." = ".$result;
        }
        if($_GET['operatoren']=='geteilt'){
            $result = $_GET['xwert'] / $_GET['ywert'];
            echo $_GET['xwert']." : ".$_GET['ywert']." = ".$result;
        }
        if($_GET['operatoren']=='potenzieren'){
            $result = pow($_GET['xwert'], $_GET['ywert']);
            echo $_GET['xwert']." ^ ".$_GET['ywert']." = ".$result;
        }
    }
    if (isset($_GET['wurzel']) && $_GET['wurzel'] != null){
        $result = sqrt($_GET['wurzel']);
        echo "<br>Die Wurzel aus ".$_GET['wurzel']." ist ".$result."!";
    }
    if (isset($_GET['addliste']) && $_GET['addliste'] != null){
        $liste = explode(",", $_GET['addliste']);
        //print_r($result);
        for ($i=0; $i<count($liste); $i++){
             $result += $liste[$i];
            //echo "<br>Die Wurzel aus ".$_GET['wurzel']." ist ".$result."!";
        }
        echo '<br> Alles zusammen addiert ergibt '.$result;
    }                                 
        
    //GET: Überträgt die Variablen in Adresszeile (URL), limitierte Anzahl / Länge an Variablen.
    //POST: Überträgt die Variablen für den Client unsichtbar im Hintergrund, unlimitierte Anzahl / Länge an Variablen.
        
    //andere Webseite:
        
    //Bei GET sieht der User, welche Daten übergeben werden (kann man als Vorteil oder als Nachteil sehen)
    //Bei GET ist die Länge begrenzt, bei POST nicht
    //Die Ergebnisseite eines GET-Formulars kann man bookmarken, da alle nötigen Informationen in der URL enthalten sind
    //Die Ergebnisseite eines POST-Formulars kann man weder bookmarken noch im Browser aktualisieren, da die Daten nicht mehr zur Verfügung stehen
    //File-Upload ist nur mit POST möglich
    
        //header('http://172.20.2.112/THM/PHP_Basics/get.php');
}

    function processGetData2(){
    
        
    
    
    
    
}























?>
