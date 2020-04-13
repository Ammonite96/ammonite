package ru.JavaRush.JavaCore.LvL16.lec13.FactoryMethodPattern;

import ru.JavaRush.JavaCore.LvL16.lec13.FactoryMethodPattern.common.*;


public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {
        if (types == null) {
            throw (new IllegalArgumentException("Неизвестный тип картинки"));
        }
        if (types.equals(ImageTypes.BMP)) {
            return new BmpReader();
        } else if (types.equals(ImageTypes.JPG)) {
            return new JpgReader();
        } else if (types.equals(ImageTypes.PNG)) {
            return new PngReader();
        } else throw (new IllegalArgumentException("Неизвестный тип картинки"));
    }
}


