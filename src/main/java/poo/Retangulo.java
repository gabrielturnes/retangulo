package poo;

public class Retangulo {

    //atributos
    private int altura;
    private int largura;

    //metodos

    /**
     * Construtor padrão (altura e largura = 4)
     */
    public Retangulo(){
        altura = 4;
        largura = 4;
    }

    /**
     * Construtor que define altura e largura.
     * @param a altura
     * @param l largura
     */
    public Retangulo(int a, int l){
        this.setAltura(a);
        this.setLargura(l);
    }

    /**
     * Retorna altura
     * @return altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Define altura
     * @param altura altura
     */
    public void setAltura(int altura) {
        if(altura >= 2) {
            this.altura = altura;
        }else{
            this.altura = 2;
        }
    }

    /**
     * Retorna largura
     * @return largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * Define largura
     * @param largura largura
     */
    public void setLargura(int largura) {
        if(largura >= 2) {
            this.largura = largura;
        }else{
            this.largura = 2;
        }
    }

    /**
     * Desenha de maneira genérica
     * @param t tipo de retorno
     * @return retangulo
     */
    private StringBuilder desenhar(char t){
        int x, y;
        String p1, p2, p3, p4, alt, larg;
        p2 = p3 = p4 = alt = larg = p1 = "";

        if(t == 'a'){
            p1 = p2 = p3 = p4 = "+";
            alt = "|";
            larg = "-";
        }else if(t == 'u'){
            p1 = "\u250c";
            p2 = "\u2510";
            p3 = "\u2514";
            p4 = "\u2518";
            larg = "\u2500";
            alt = "\u2502";
        }

        String ret = "";
        StringBuilder retangulo = new StringBuilder(ret);

        for (y = 0; y<(altura); y++){
            for(x=0; x<(largura); x++) {
                if((x == 0) || (x == largura-1)) {
                    if(y == 0 && x == 0){
                        retangulo.append(p1);
                    }else if(y == 0 && x == largura - 1){
                        retangulo.append(p2);
                    }else if(y == altura - 1 && x == 0){
                        retangulo.append(p3);
                    }else if(y == altura - 1 && x == largura - 1) {
                        retangulo.append(p4);
                    }else {
                        retangulo.append(alt);
                    }
                }else{
                    if(y == 0 || y == altura - 1){
                        retangulo.append(larg);
                    }else {
                        retangulo.append(" ");
                    }
                }
            }
            if(y != altura -1) {
                retangulo.append("\n");
            }
        }

        return retangulo;
    }

    /**
     * Retorna em ASCII
     * @return retangulo
     */
    public StringBuilder desenharASCII(){
        return desenhar('a');
    }

    /**
     * Retona em UTF8
     * @return retangulo
     */
    public StringBuilder desenharUTF8(){
        return desenhar('u');
    }
}
