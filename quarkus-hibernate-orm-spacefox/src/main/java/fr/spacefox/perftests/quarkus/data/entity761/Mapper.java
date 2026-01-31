package fr.spacefox.perftests.quarkus.data.entity761;

import fr.spacefox.perftests.quarkus.core.service761.model.Model761;

final class Mapper {
    private Mapper() {}

    public static Model761 of(Entity761 entity) {
        return new Model761(entity.getId(), entity.getField());
    }
}
