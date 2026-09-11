public class NotaAmericana
{
    private int percentual = 0;

    public void setPercentul(int nota)
    {
        if (nota < 0 || nota > 100)
        {
            percentual = 0;
        }
        else
        {
            percentual = nota;
        }
	   }

    public char getGrau()
    {
        char grau;
        
        if (percentual >= 90)
        {
            grau = 'A';
        }
        else if (percentual >= 80)
        {
            grau = 'B';
        }
        else if (percentual >= 70)
        {
            grau = 'C';
        }
        else if (percentual >= 60)
        {
            grau = 'D';
        }
        else
        {
            grau = 'F';
        }
            
        return grau;
    }
        
    public double getNotaBrasileira()
    {
        double notaBrasileira = percentual / 10.0;
            
        return notaBrasileira;
    }
}