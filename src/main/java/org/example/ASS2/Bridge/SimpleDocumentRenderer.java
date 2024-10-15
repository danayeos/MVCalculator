package Assignment2.Bridge;

import Assignment2.Document;

// ЗАДАНИЕ: Реализовать рендеринг документа через выбранный движок
public class SimpleDocumentRenderer extends DocumentRenderer {
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    //Задача: Реализуйте вызов метода рендеринга документа через переданный движок
    @Override
    public void render(String content) {
        //вызвать рендеринг через движок
        engine.render(content);
    }

}