package fr.spacefox.perftests.quarkus.data.entity582;

import fr.spacefox.perftests.quarkus.core.service582.model.Model582;

final class Mapper {
    private Mapper() {}

    public static Model582 of(Entity582 entity) {
        return new Model582(entity.getId(), entity.getField());
    }
}
