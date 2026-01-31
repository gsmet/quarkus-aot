package fr.spacefox.perftests.quarkus.data.entity557;

import fr.spacefox.perftests.quarkus.core.service557.model.Model557;

final class Mapper {
    private Mapper() {}

    public static Model557 of(Entity557 entity) {
        return new Model557(entity.getId(), entity.getField());
    }
}
