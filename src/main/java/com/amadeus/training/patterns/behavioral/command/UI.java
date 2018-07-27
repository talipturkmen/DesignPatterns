package com.amadeus.training.patterns.behavioral.command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UI {
    public static void main(String[] args) {
        JButton jButton = new RunButton(new Editor(""));

        jButton.addActionListener(e -> {
            new ExecuteCommand(((RunButton) jButton).editor).execute();
        });
    }
}


class RunButton extends JButton {
    Editor editor;

    public RunButton(Editor editor) {
        this.editor = editor;
    }


}


class ExecuteCommand extends AbstractEditorCommand {

    public ExecuteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        try {
            Runtime.getRuntime().exec(editor.text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void undo() {

    }

    @Override
    public boolean isUndoable() {
        return false;
    }
}