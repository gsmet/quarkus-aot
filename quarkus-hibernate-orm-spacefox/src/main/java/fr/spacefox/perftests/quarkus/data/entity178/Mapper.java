package fr.spacefox.perftests.quarkus.data.entity178;

import fr.spacefox.perftests.quarkus.core.service178.model.Model178;

final class Mapper {
    private Mapper() {}

    public static Model178 of(Entity178 entity) {
        return new Model178(entity.getId(), entity.getField());
    }
}
