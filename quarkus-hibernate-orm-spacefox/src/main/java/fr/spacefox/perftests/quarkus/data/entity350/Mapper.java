package fr.spacefox.perftests.quarkus.data.entity350;

import fr.spacefox.perftests.quarkus.core.service350.model.Model350;

final class Mapper {
    private Mapper() {}

    public static Model350 of(Entity350 entity) {
        return new Model350(entity.getId(), entity.getField());
    }
}
