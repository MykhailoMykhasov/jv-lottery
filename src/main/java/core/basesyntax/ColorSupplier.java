package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int i = random.nextInt(Color.values().length);
        return Color.values()[i];
    }
}
