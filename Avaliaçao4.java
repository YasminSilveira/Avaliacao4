
package avaliaçao4;

/**
 *
 * @author yasmi
 */
public class Avaliaçao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    float valorI, valorF;
    int x;
   printf("\n Digite o valor do produto: ");
   (scanf "%f", &valorI);
    
   printf("\t\tmenu:\n\t1 > Avista com dinheiro.\n\t\t2 > Avista no cartao. \n\t\t3 > Em duas vezes. \n\t\t4> Em tres vezes.");
   printf("\n\n Selecione um menu:");
   scanf("%d", 8x);
   
     if( x == 1 ){
      valorF = valorI * 0.85;
      printf("\n Ganhou desconto! \n\nTOTAL A PAGAR: R$ %.2f", valorF);
    }else if (x == 2){
      valorF = (valorI*0.85);
      printf("\n Ganhou desconto!\n\nTOTAL A PAGAR: R$ %.2f", valorF);
    }else if ( x == 3){
      printf ("\n Sem juros!!!\n\nTOTAL A PAGAR: R$ %.2f", valorI);
    }else if ( x == 4 ) {
      valorF = (float) (valorI* 1.10);
      printf("\n Pagando com juros!!!\n\TOTAL A PAGAR: R$ %.f", valorF);
    }else{
      printf(\"n\ttERRO NO PROGRAMA!!");
      getch();
      return(0);
      
}
    
getch();

}

    private void printf(String _Pagando_com_jurosTOTAL_A_PAGAR_R$_f, float valorF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

