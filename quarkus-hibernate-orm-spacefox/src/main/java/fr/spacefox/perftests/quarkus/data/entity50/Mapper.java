package fr.spacefox.perftests.quarkus.data.entity50;

import fr.spacefox.perftests.quarkus.core.service50.model.Model50;

final class Mapper {
    private Mapper() {}

    public static Model50 of(Entity50 entity) {
        return new Model50(entity.getId(), entity.getField());
    }
}
