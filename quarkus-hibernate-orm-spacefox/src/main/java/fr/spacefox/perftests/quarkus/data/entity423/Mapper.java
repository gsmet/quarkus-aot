package fr.spacefox.perftests.quarkus.data.entity423;

import fr.spacefox.perftests.quarkus.core.service423.model.Model423;

final class Mapper {
    private Mapper() {}

    public static Model423 of(Entity423 entity) {
        return new Model423(entity.getId(), entity.getField());
    }
}
