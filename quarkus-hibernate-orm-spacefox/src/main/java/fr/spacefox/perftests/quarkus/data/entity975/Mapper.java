package fr.spacefox.perftests.quarkus.data.entity975;

import fr.spacefox.perftests.quarkus.core.service975.model.Model975;

final class Mapper {
    private Mapper() {}

    public static Model975 of(Entity975 entity) {
        return new Model975(entity.getId(), entity.getField());
    }
}
