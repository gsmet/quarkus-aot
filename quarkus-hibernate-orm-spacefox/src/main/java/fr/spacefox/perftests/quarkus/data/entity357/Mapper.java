package fr.spacefox.perftests.quarkus.data.entity357;

import fr.spacefox.perftests.quarkus.core.service357.model.Model357;

final class Mapper {
    private Mapper() {}

    public static Model357 of(Entity357 entity) {
        return new Model357(entity.getId(), entity.getField());
    }
}
