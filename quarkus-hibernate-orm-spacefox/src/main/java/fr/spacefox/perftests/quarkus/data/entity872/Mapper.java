package fr.spacefox.perftests.quarkus.data.entity872;

import fr.spacefox.perftests.quarkus.core.service872.model.Model872;

final class Mapper {
    private Mapper() {}

    public static Model872 of(Entity872 entity) {
        return new Model872(entity.getId(), entity.getField());
    }
}
