package fr.spacefox.perftests.quarkus.data.entity718;

import fr.spacefox.perftests.quarkus.core.service718.model.Model718;

final class Mapper {
    private Mapper() {}

    public static Model718 of(Entity718 entity) {
        return new Model718(entity.getId(), entity.getField());
    }
}
