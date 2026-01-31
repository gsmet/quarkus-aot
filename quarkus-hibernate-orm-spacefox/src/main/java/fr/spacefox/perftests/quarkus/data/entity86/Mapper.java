package fr.spacefox.perftests.quarkus.data.entity86;

import fr.spacefox.perftests.quarkus.core.service86.model.Model86;

final class Mapper {
    private Mapper() {}

    public static Model86 of(Entity86 entity) {
        return new Model86(entity.getId(), entity.getField());
    }
}
