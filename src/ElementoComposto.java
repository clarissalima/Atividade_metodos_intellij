import java.util.ArrayList;
import java.util.List;

public abstract class ElementoComposto extends ElementoGrafoIF {
    protected List<ElementoGrafoIF> elementos = new ArrayList<>();

    public void adicionar(ElementoGrafoIF elemento) {
        elementos.add(elemento);
    }

    public void remover(ElementoGrafoIF elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void exibirInformacoes() {
        for (ElementoGrafoIF elemento : elementos) {
            elemento.exibirInformacoes();
        }
    }
}
