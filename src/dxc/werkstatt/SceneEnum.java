package dxc.werkstatt;

public enum SceneEnum {
    START_SCENE("startScene.fxml", 0),
    REGELN_SCENE("regelnScene.fxml", 1),
    SPIEL_SCENE("spielScreen.fxml", 2),
    GAMEOVER_SCENE("gameoverScene.fxml", 3),
    ABOUT_SCENE("aboutScene.fxml", 4);

    private static final String FXML_PATH = "fxml/";
    private String path;
    private int id;

    SceneEnum(String path, int id) {
        this.path = path;
    }

    public String getFullPath() {
        return FXML_PATH + path;
    }

}
