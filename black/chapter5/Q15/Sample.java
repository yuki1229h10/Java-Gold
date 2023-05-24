package black.chapter5.Q15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
  public static void main(String[] args) throws Exception {
    Path sample = Paths.get("dir", "data.txt");
    if (Files.exists(sample) == false) {
      Files.createFile(sample);
    }

    Path outFile = Paths.get("dir", "sample_bk.txt");
    Files.copy(sample, outFile);

    Path dir = Paths.get("dir", "subdir");
    Path dest = dir.resolve(Paths.get("data.txt"));
    Files.move(sample, dest);
  }
}
