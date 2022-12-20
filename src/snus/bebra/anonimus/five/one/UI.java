package snus.bebra.anonimus.five.one;

import javax.swing.*;
import java.awt.*;
import java.util.StringJoiner;

public class UI extends JPanel {
    private final String[] buttonLabels = {"AC Milan", "Real Madrid"};
    private final int[] score;

    private final JLabel result = new JLabel();
    private final JLabel winner = new JLabel();
    private final JLabel lastScore = new JLabel();

    UI() {
        this.score = new int[buttonLabels.length];

        this.setLayout(new GridLayout(4, 1, 0, 0));

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridBagLayout());

        result.setHorizontalAlignment(JLabel.CENTER);
        winner.setHorizontalAlignment(JLabel.CENTER);
        lastScore.setHorizontalAlignment(JLabel.CENTER);

        this.add(result);
        this.add(winner);
        this.add(lastScore);

        this.updateResult();
        this.updateWinner();
        this.updateLastScorer(-1);

        for (int i = 0; i < this.buttonLabels.length; i++) {
            Button b = new Button(this.buttonLabels[i]);
            buttons.add(b);
            final int _i = i;
            b.addActionListener((e) -> this.updateAll(_i));
        }

        this.add(buttons);
    }

    public void updateResult() {
        String result = "Result: ";
        StringJoiner join = new StringJoiner(" X ");

        for (int score: this.score)
            join.add(Integer.toString(score));

        this.result.setText(result + join);
    }

    public void addResult(int index) {
        this.score[index] += 1;
        this.updateResult();
    }

    public void updateWinner() {
        String template = "Winner: ";
        String winner = new String();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < this.buttonLabels.length; i++) {
            if (this.score[i] == max) {
                winner = "DRAW";
                break;
            }
            else if (this.score[i] > max) {
                max = this.score[i];
                winner = this.buttonLabels[i];
            }
        }

        this.winner.setText(template + winner);

    }

    public void updateLastScorer(int index) {
        String template = "Last scorer: ";

        this.lastScore.setText(template + ((index >= 0) ? this.buttonLabels[index] : "N/A"));
    }

    public void updateAll(int index) {
        this.addResult(index);
        this.updateWinner();
        this.updateLastScorer(index);
    }


}
