package fr.spacefox.perftests.quarkus.data.entity934;

import fr.spacefox.perftests.quarkus.core.service934.model.Model934;

final class Mapper {
    private Mapper() {}

    public static Model934 of(Entity934 entity) {
        return new Model934(entity.getId(), entity.getField());
    }
}
