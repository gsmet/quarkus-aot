package fr.spacefox.perftests.quarkus.data.entity154;

import fr.spacefox.perftests.quarkus.core.service154.model.Model154;

final class Mapper {
    private Mapper() {}

    public static Model154 of(Entity154 entity) {
        return new Model154(entity.getId(), entity.getField());
    }
}
