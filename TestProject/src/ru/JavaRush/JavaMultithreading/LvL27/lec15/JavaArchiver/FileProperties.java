package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

public class FileProperties {
    private String name;            // Имя файла
    private long size;              // Размер в байтах
    private long compressedSize;    // Размер в байтах после сжатия
    private int compressionMethod;  // Метод сжатия

    public FileProperties(String name, long size, long compressedSize, int compressionMethod) {
        this.name = name;
        this.size = size;
        this.compressedSize = compressedSize;
        this.compressionMethod = compressionMethod;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public long getCompressedSize() {
        return compressedSize;
    }

    public int getCompressionMethod() {
        return compressionMethod;
    }

    public long getCompressionRatio() {
        return 100 - ((compressedSize * 100) / size);
    }

    @Override
    public String toString() {
        if (size > 0) {
            return String.format("%s %d Kb (%d Kb) сжатие: %d%%",
                    name,
                    size / 1024,
                    compressedSize / 1024,
                    getCompressionRatio());
        } else
            return name;
    }
}
