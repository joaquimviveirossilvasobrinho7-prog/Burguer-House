/* ==========================================================
   BURGER HOUSE — Animação com JavaFX (TranslateTransition)
   4ª biblioteca: demonstração de animação em Java
   (arquivo separado — NÃO afeta o site, que é HTML/CSS/JS)

   Para executar:
   1) Instale o Java JDK 17+ (com JavaFX SDK ou via Maven/Gradle)
   2) javac --module-path /caminho/javafx-sdk/lib \
            --add-modules javafx.controls \
            AnimacaoTranslate.java
   3) java  --module-path /caminho/javafx-sdk/lib \
            --add-modules javafx.controls \
            AnimacaoTranslate
   ========================================================== */

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimacaoTranslate extends Application {

    @Override
    public void start(Stage palco) {
        Button botao = new Button("Deslizar ->");

        // Animação: o botão desliza 200px para a direita em 2 segundos
        TranslateTransition animacao = new TranslateTransition();
        animacao.setDuration(Duration.seconds(2));
        animacao.setByX(200);
        animacao.setNode(botao);
        animacao.play();

        StackPane raiz = new StackPane(botao);
        Scene cena = new Scene(raiz, 600, 400);

        palco.setTitle("Burger House - Animação JavaFX");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
