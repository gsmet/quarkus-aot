package fr.spacefox.perftests.quarkus.data.entity465;

import fr.spacefox.perftests.quarkus.core.service465.model.Model465;

final class Mapper {
    private Mapper() {}

    public static Model465 of(Entity465 entity) {
        return new Model465(entity.getId(), entity.getField());
    }
}
