package fr.spacefox.perftests.quarkus.data.entity276;

import fr.spacefox.perftests.quarkus.core.service276.model.Model276;

final class Mapper {
    private Mapper() {}

    public static Model276 of(Entity276 entity) {
        return new Model276(entity.getId(), entity.getField());
    }
}
