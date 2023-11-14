/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democomand;

/**
 *
 * @author USUARIO
 */
import democomand.Editor;

class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        String selectedText = editor.textField.getSelectedText();
        if (selectedText == null || selectedText.isEmpty()) {
            return false;
        }

        backup();
        String source = editor.textField.getText();
        editor.clipboard = selectedText;
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        int start = editor.textField.getSelectionStart();
        int end = editor.textField.getSelectionEnd();
        return source.substring(0, start) + source.substring(end);
    }
}

