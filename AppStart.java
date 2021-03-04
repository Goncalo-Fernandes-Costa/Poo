
/**
 * Escreva a descrição da classe main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AppStart{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * COnstrutor para objetos da classe main
     */
    public AppStart()
    {
        // inicializa variáveis de instância
        x = 0;
    }
    
    public static void main(String[] args){
     Size size = Size.MEDIUM;
     
     System.out.println("Name        :"+size.name());
     System.out.println("toString()  : \""+size.toString().trim()+"\''");
     System.out.println("Ordem       :"+size.ordinal());
     System.out.println("Valor minimo:"+size.getMinValue());
     System.out.println("Valor maximo:"+size.getMaxValue());
     System.out.println("Código      : \""+size.getCode()+"\''");
     
     
    }


    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public int sampleMethod(int y)
    {
        // ponha seu código aqui
        return x + y;
    }
}
