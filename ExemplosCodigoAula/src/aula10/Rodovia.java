package aula10;

public interface Rodovia {
	final float LIMITE = 120;   // atributo constante
    // todo metodo e abstrato na interface (assinatura)
    public boolean controlarVelocidade(float velocidade);
}
