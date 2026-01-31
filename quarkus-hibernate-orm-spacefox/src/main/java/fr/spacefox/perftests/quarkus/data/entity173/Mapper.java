package fr.spacefox.perftests.quarkus.data.entity173;

import fr.spacefox.perftests.quarkus.core.service173.model.Model173;

final class Mapper {
    private Mapper() {}

    public static Model173 of(Entity173 entity) {
        return new Model173(entity.getId(), entity.getField());
    }
}
