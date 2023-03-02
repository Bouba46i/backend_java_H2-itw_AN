package test.bastianb.alphanetworkstest.models;

import java.util.stream.Stream;

import lombok.Getter;

public enum AnimalType {
    DOG("chien"), CAT("chat"), FISH("poisson");

    @Getter
    private String type;

    private AnimalType(String type) {
        this.type = type;
    }

    public static AnimalType of(String type) {
        return Stream.of(AnimalType.values())
          .filter(t -> t.getType().equals(type))
          .findFirst()
          .orElseThrow(IllegalArgumentException::new);
    }

}
