package fr.spacefox.perftests.quarkus.data.entity906;

import fr.spacefox.perftests.quarkus.core.service906.model.Model906;

final class Mapper {
    private Mapper() {}

    public static Model906 of(Entity906 entity) {
        return new Model906(entity.getId(), entity.getField());
    }
}
