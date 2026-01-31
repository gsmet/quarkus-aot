package fr.spacefox.perftests.quarkus.data.entity17;

import fr.spacefox.perftests.quarkus.core.service17.model.Model17;

final class Mapper {
    private Mapper() {}

    public static Model17 of(Entity17 entity) {
        return new Model17(entity.getId(), entity.getField());
    }
}
