package fr.spacefox.perftests.quarkus.data.entity367;

import fr.spacefox.perftests.quarkus.core.service367.model.Model367;

final class Mapper {
    private Mapper() {}

    public static Model367 of(Entity367 entity) {
        return new Model367(entity.getId(), entity.getField());
    }
}
