package fr.spacefox.perftests.quarkus.data.entity940;

import fr.spacefox.perftests.quarkus.core.service940.model.Model940;

final class Mapper {
    private Mapper() {}

    public static Model940 of(Entity940 entity) {
        return new Model940(entity.getId(), entity.getField());
    }
}
