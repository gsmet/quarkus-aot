package fr.spacefox.perftests.quarkus.data.entity861;

import fr.spacefox.perftests.quarkus.core.service861.model.Model861;

final class Mapper {
    private Mapper() {}

    public static Model861 of(Entity861 entity) {
        return new Model861(entity.getId(), entity.getField());
    }
}
