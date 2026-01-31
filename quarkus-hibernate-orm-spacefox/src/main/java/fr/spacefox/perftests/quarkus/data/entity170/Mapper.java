package fr.spacefox.perftests.quarkus.data.entity170;

import fr.spacefox.perftests.quarkus.core.service170.model.Model170;

final class Mapper {
    private Mapper() {}

    public static Model170 of(Entity170 entity) {
        return new Model170(entity.getId(), entity.getField());
    }
}
