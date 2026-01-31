package fr.spacefox.perftests.quarkus.data.entity567;

import fr.spacefox.perftests.quarkus.core.service567.model.Model567;

final class Mapper {
    private Mapper() {}

    public static Model567 of(Entity567 entity) {
        return new Model567(entity.getId(), entity.getField());
    }
}
