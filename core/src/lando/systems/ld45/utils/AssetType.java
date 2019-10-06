package lando.systems.ld45.utils;

public enum AssetType {
      ball("ball")
    , peg("peg")
    , bumper("bumper")
    , spinner("spinner")
    , particle_star("particle-star")
    ;
    public String fileName;
    AssetType(String fileName) {
        this.fileName = fileName;
    }
}