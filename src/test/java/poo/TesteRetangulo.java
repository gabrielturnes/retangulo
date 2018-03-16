package poo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class TesteRetangulo {
    /**
     * Testa o desenho ASCII
     */
    @Test
    public void ascii() {
        Retangulo ret = new Retangulo();
        String resposta = ret.desenharASCII().toString();
        String teste = "+--+\n|  |\n|  |\n+--+";
        assertEquals("falha ascii", teste, resposta);

        ret.setLargura(-1);
        ret.setAltura(-1);
        resposta = ret.desenharASCII().toString();
        teste = "++\n++";
        assertEquals("falha ascii", teste, resposta);

        ret.setLargura(3);
        ret.setAltura(2);
        resposta = ret.desenharASCII().toString();
        teste = "+-+\n+-+";
        assertEquals("falha ascii", teste, resposta);
    }

    /**
     * Testa o desenho utf8
     */
    @Test
    public void utf8() {
        Retangulo ret = new Retangulo();
        String resposta = ret.desenharUTF8().toString();
        String teste = "\u250c\u2500\u2500\u2510\n\u2502  \u2502\n\u2502  \u2502\n\u2514\u2500\u2500\u2518";
        assertEquals("falha utf8", teste, resposta);

        ret.setAltura(-1);
        ret.setLargura(-1);
        resposta = ret.desenharUTF8().toString();
        teste = "\u250c\u2510\n\u2514\u2518";
        assertEquals("falha utf8", teste, resposta);

    }

    /**
     * Testa os getters e setters da classe Retangulo.
     */
    @Test
    public void geral() {
        Retangulo ret = new Retangulo();
        assertEquals("falha largura", 4, ret.getAltura());
        assertEquals("falha altura", 4, ret.getLargura());

        ret.setLargura(-1);
        ret.setAltura(-1);
        assertEquals("falha largura", 2, ret.getAltura());
        assertEquals("falha altura", 2, ret.getLargura());

        Retangulo ret2 = new Retangulo(5, 10);
        assertEquals("falha largura", 5, ret2.getAltura());
        assertEquals("falha altura", 10, ret2.getLargura());

    }
}
