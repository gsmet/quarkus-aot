package fr.spacefox.perftests.quarkus.data.entity369;

import fr.spacefox.perftests.quarkus.core.service369.model.Model369;

final class Mapper {
    private Mapper() {}

    public static Model369 of(Entity369 entity) {
        return new Model369(entity.getId(), entity.getField());
    }
}
