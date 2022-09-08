package com.babakov;

import lombok.SneakyThrows;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/test1.jpg");
        File file2 = new File("src/main/resources/test2.jpg");

        BufferedImage image1 = ImageIO.read(file1);
        BufferedImage image2 = ImageIO.read(file2);
        ImageIO.write(new Process().getDifferenceImage(image1, image2), "jpg", new File("src/main/resources/result.jpg"));
    }
}
