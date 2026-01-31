package fr.spacefox.perftests.quarkus.data.entity188;

import fr.spacefox.perftests.quarkus.core.service188.model.Model188;

final class Mapper {
    private Mapper() {}

    public static Model188 of(Entity188 entity) {
        return new Model188(entity.getId(), entity.getField());
    }
}
