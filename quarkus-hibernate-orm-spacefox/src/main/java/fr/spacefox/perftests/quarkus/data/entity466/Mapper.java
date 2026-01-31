package fr.spacefox.perftests.quarkus.data.entity466;

import fr.spacefox.perftests.quarkus.core.service466.model.Model466;

final class Mapper {
    private Mapper() {}

    public static Model466 of(Entity466 entity) {
        return new Model466(entity.getId(), entity.getField());
    }
}
