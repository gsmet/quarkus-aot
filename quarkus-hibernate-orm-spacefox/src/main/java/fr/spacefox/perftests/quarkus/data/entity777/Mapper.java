package fr.spacefox.perftests.quarkus.data.entity777;

import fr.spacefox.perftests.quarkus.core.service777.model.Model777;

final class Mapper {
    private Mapper() {}

    public static Model777 of(Entity777 entity) {
        return new Model777(entity.getId(), entity.getField());
    }
}
