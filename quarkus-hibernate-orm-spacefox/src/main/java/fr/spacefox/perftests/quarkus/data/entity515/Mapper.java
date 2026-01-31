package fr.spacefox.perftests.quarkus.data.entity515;

import fr.spacefox.perftests.quarkus.core.service515.model.Model515;

final class Mapper {
    private Mapper() {}

    public static Model515 of(Entity515 entity) {
        return new Model515(entity.getId(), entity.getField());
    }
}
