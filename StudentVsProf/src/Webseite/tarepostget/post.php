<!DOCTYPE html>
<html lang="de">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>POST Aufgabe PHP</title>
    <style>
        li {
            padding-top: 5px;
            list-style: none;
        }

        fieldset {
            margin-right: auto;
            margin-left: auto;
            width: 25%;
        }

        /*
         label{
            text-align: left;
        }
        input{
            float: right;
        }*/

    </style>

</head>

<body>
    <?php
    include("zweitfunktion.php");
    
    ?>
    <!-- Sichtbarer Dokumentinhalt im body -->
    <form action="post.php" method="POST">
        <fieldset>
            <legend>Abfrage sensibler Daten</legend>
            <!-- <label for="suche">Suchbegriff:</label>-->
            <ul>
                <li>
                    <label>Name:<input type="text" name="name" placeholder="Max Mustermensch"></label>
                </li>

                <li>
                    <label>E-Mail Adresse:<input type="email" name="email" placeholder="max@menschen.eu"></label>
                </li>
                <li>
                    <label>Passwort:<input type="password" name="password"></label>
                </li>
                <li>
                    <label>Geschlecht:</label>
                    <input type="radio" name="sex" value="mann"><label>männlich</label>
                    <input type="radio" name="sex" value="weiblich"><label>weiblich</label>
                    <input type="radio" name="sex" value="divers"><label>divers</label>
                </li>
                <li>
                    <label>(Geheime) Nachricht <textarea name="textfeld" rows="5" cols="20"></textarea></label>
                </li>
                <li>
                    <button type="submit" name="send" >Daten absenden</button>
                </li>
                <li>
                    <button type="reset" name="delete">Daten löschen</button>
                </li>
            </ul>
            <?php
                  processGetData2();
            ?>

        </fieldset>
    </form>


</body>

</html>
