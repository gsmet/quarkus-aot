package fr.spacefox.perftests.quarkus.data.entity87;

import fr.spacefox.perftests.quarkus.core.service87.model.Model87;

final class Mapper {
    private Mapper() {}

    public static Model87 of(Entity87 entity) {
        return new Model87(entity.getId(), entity.getField());
    }
}
