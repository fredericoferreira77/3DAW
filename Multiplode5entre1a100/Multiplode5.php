<!DOCTYPE html>
<html>

<head>
    <title>Escrevendo multiplos de 5 entre 1 a 100</title>
</head>
<body>

    <h1>Escrevendo multiplos de 5 entre 1 a 100 utilizando PHP</h1>

    <?php
        $i = 5;
        
        while ($i <= 100) {
            
            echo $i . " ";
            $i += 5;
        }
        
        echo "<br>";

        echo "Atividade concluida com sucesso!";
        echo "<br>";

        echo "Frederico Rogério Ferreira";
        echo "<br>";
    ?>

</body>

</html>