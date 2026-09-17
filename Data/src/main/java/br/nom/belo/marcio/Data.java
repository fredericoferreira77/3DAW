package br.nom.belo.marcio;

public class Data 
{
    private int dia;
    private int mes;
    private int ano;


    // Construtor
    public Data(int ano, int mes, int dia) 
    {
        if (dataValida(ano, mes, dia))
        {
            this.ano = ano;
            this.mes = mes;
            this.dia = dia;
        }
        else
        {
            this.ano = 1900;
            this.mes = 1;
            this.dia = 1;
        }
    }

    private boolean dataValida(int ano, int mes, int dia)
    {
        if (mes < 1 || mes > 12)
            return false;

        if (dia < 1)
            return false;

        return dia <= diasDoMes(mes, ano);
    }

    private int diasDoMes(int mes, int ano)
    {
        // Fevereiro
        if (mes == 2)
            return 28;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            return 30;

        // Demais meses
        return 31;
    }


    // Retorna o dia
    public int getDia() 
    {
        return dia;
    }


    // Retorna o mês
    public int getMes() 
    {
        return mes;
    }


    // Retorna o ano
    public int getAno() 
    {
        return ano;
    }

    public Data adicionarDias(int dias) 
    {
        int novoDia = this.dia;
        int novoMes = this.mes;
        int novoAno = this.ano;

        for (int i = 0; i < dias; i++)
        {
            novoDia++;

            if (novoDia > diasDoMes(novoMes, novoAno))
            {
                novoDia = 1;
                novoMes++;

                if (novoMes > 12)
                {
                    novoMes = 1;
                    novoAno++;
                }
            }
        }

        return new Data(novoAno, novoMes, novoDia);
    }
}
