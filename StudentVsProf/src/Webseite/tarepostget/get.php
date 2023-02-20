<!DOCTYPE html>
<html lang="de">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GET Aufgabe PHP</title>
    <style>
        li{
            padding-top: 5px;
            list-style: none;
        }
    
    </style>
    
</head>

<body>
    <?php
    include("hauptfunktion.php");
    ?>
    <!-- Sichtbarer Dokumentinhalt im body -->
    
    
    
    <form method="GET" action="?">
        <fieldset>
            <legend>Taschenrechner</legend>
            <!-- <label for="suche">Suchbegriff:</label>-->
            <ul>
                <li>
                    <input type="number" name="xwert" placeholder="x-Wert">
                    <select name="operatoren" size="1">
                        <option value='plus'>plus</option>
                        <option value='minus'>minus</option>
                        <option value='geteilt'>geteilt</option>
                        <option value='mal'>mal</option>
                        <option value='potenzieren'>potenzieren</option>
                    </select>
                    <input type="number" name="ywert" placeholder="y-Wert">
                </li>
                <li>
                    <input type="number" name="wurzel" placeholder="Wurzel aus">
                </li>
                <li>
                    <input type="text" name="addliste" placeholder="Additionsliste (Kommagetrennt)">
                </li>
                <li>
                    <button type="submit" name="berechnen" value="1">Berechnen</button>
                </li>
                <li>
                    <button type="reset" name="delete" value="1">Werte löschen</button>
                </li>

            </ul>
            <?php
                processGetData();
            ?>
        </fieldset>
    </form>
    

</body>

</html>
