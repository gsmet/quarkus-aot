package fr.spacefox.perftests.quarkus.data.entity72;

import fr.spacefox.perftests.quarkus.core.service72.model.Model72;

final class Mapper {
    private Mapper() {}

    public static Model72 of(Entity72 entity) {
        return new Model72(entity.getId(), entity.getField());
    }
}
