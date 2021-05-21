package exercicio06;

public class Data {

    private static final Integer DIAS_DO_MES_ANO_REGULAR[] = {31,28,31,30,31,30,31,31,30,31,30,31};

    private static final Integer DIAS_DO_MES_ANO_BISSEXTO[] = {31,29,31,30,31,30,31,31,30,31,30,31};

    private int dia = 1;

    private int mes = 1;

    private int ano = 1970;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean adicionarUmDia() {
        Integer[] diasDoMes = getArrayDeMeses();
        Integer maiorDiaDoMes = diasDoMes[mes - 1];
        dia++;
        if(dia > maiorDiaDoMes) {
            dia = 1;
            mes++;
            if(mes == 13) {
                mes = 1;
                ano++;
            }
        }
        return ehDataValida();
    }

    public boolean ehDataValida() {
        if(mes < 1 || mes > 12) return false;

        Integer[] diasDoMes = getArrayDeMeses();
        Integer maiorDiaDoMes = diasDoMes[mes - 1];

        return dia > 0 && dia <= maiorDiaDoMes;
    }

    private Integer[] getArrayDeMeses() {
        if(ehAnoBissexto()) return DIAS_DO_MES_ANO_BISSEXTO;
        return DIAS_DO_MES_ANO_REGULAR;
    }

    private boolean ehAnoBissexto() {
        boolean ehBissexto = ano % 4 == 0;
        if(ano % 100 == 0 & !(ano % 400 == 0))
            ehBissexto = false;
        return false;
    }
}
