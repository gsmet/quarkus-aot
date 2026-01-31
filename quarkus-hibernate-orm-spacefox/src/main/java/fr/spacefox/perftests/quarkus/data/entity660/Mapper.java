package fr.spacefox.perftests.quarkus.data.entity660;

import fr.spacefox.perftests.quarkus.core.service660.model.Model660;

final class Mapper {
    private Mapper() {}

    public static Model660 of(Entity660 entity) {
        return new Model660(entity.getId(), entity.getField());
    }
}
