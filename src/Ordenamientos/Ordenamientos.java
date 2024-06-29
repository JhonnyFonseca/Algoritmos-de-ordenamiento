
package Ordenamientos;

public class Ordenamientos {
    public static void main(String[] args){
        int arreglo[];
        int nElementos =100;
        arreglo = new int [nElementos];
        
        generar(arreglo);
        mostrar(arreglo);
        System.out.println("Elementos ordenados");
        quick(0,(arreglo.length-1),arreglo);
        mostrar(arreglo);
    }

    private static void generar(int[] arreglo) {
        int inicio=0, nElementos =100, rango=100;
        arreglo[inicio] = (int)(Math.random()*rango);
        for(inicio = 1;inicio<nElementos;inicio++){
            arreglo[inicio] = (int)(Math.random()*rango);
            for(int j = 0;j<inicio;j++){
                if(arreglo[inicio]==arreglo[j]){
                    inicio--;
                }
            }
        }
    }

    private static void mostrar(int[] arreglo) {
        System.out.println("");
        for(int i =0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+"\t");
        }
        System.out.println("");
    }
    
    public static void quick(int primero, int ultimo, int[] arreglo1){
        
        int pivote, aux, p,u;
        
        p = primero;
        u = ultimo;
        pivote = arreglo1[(primero+ultimo)/2];
        do{
            while(arreglo1[p]<pivote){
                p++;
            }
            while(arreglo1[u]>pivote){
                u--;
            }
            if(p<=u){
                aux= arreglo1[p];
                arreglo1[p]= arreglo1[u];
                arreglo1[u]= aux;
                p++;
                u--;
            }
            
        }while(p<=u);
        if(primero<u){
            quick(primero,u,arreglo1);
        }
        if(p<ultimo){
            quick (p, ultimo, arreglo1);
        }
        
    }    
}       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        //Ordenamiento por burbuja
//        for (int i=0; i<(nElementos-1); i++){
//            for(int j=0; j<(nElementos-1); j++){
//                if(arreglo[j]> arreglo[j+1]){
//                    aux = arreglo[j];
//                    arreglo[j] = arreglo[j+1];
//                    arreglo[j+1] = aux;
//                }
//            }
//        }
//        System.out.println("");
//        System.out.println("Orden Asecendente: ");
//        for(int i=0;i<nElementos;i++){
//            System.out.print(arreglo[i] + " ");
//        }
        
        //Ordenamiento por inserción
//        for(int i =0; i<nElementos;i++){
//            pos = i;
//            aux = arreglo[i];
//            
//            while((pos>0)&&(arreglo[pos-1] > aux)){
//                arreglo [pos] =arreglo[pos-1];
//                pos--;
//            }
//            arreglo[pos]= aux;
//        }
//        System.out.println("");
//        System.out.println("Orden Asecendente: ");
//        for(int i=0;i<nElementos;i++){
//            System.out.print(arreglo[i] + " ");
//        }
//        System.out.println("");

        


