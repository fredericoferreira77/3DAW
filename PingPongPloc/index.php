<!DOCTYPE html>
<html>

<head>
    <title>Identificando multiplos de 3 e 5</title>
    <link rel = "stylesheet" href = "style.css">
</head>

<body>

    <h1>Identificando multiplos de 3 e 5</h1>

    <?php
        
        $i = 1;

        while ($i <= 100) {
            
            if ($i % 3 == 0 && $i % 5 == 0) {
                echo $i . ' <span class = "ploc">ploc</span>';
            } elseif ($i % 3 == 0) {
                echo $i . ' <span class = "ping">ping</span>';
            } elseif ($i % 5 == 0) {    
                echo $i . ' <span class = "pong">pong</span>';
            } else {
                echo $i . ' <span class = "ok">ok</span>';   
            }
            echo "<br />";

            $i++;
        }

        echo "Atividade concluida com sucesso!";
        echo "<br>";

        echo "Frederico Rogério Ferreira";
        echo "<br>";
    ?>

</body>

</html>
