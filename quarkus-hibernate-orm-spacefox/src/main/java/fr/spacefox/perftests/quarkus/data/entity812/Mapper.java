package fr.spacefox.perftests.quarkus.data.entity812;

import fr.spacefox.perftests.quarkus.core.service812.model.Model812;

final class Mapper {
    private Mapper() {}

    public static Model812 of(Entity812 entity) {
        return new Model812(entity.getId(), entity.getField());
    }
}
