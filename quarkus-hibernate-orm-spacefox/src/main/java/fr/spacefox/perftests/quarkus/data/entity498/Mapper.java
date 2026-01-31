package fr.spacefox.perftests.quarkus.data.entity498;

import fr.spacefox.perftests.quarkus.core.service498.model.Model498;

final class Mapper {
    private Mapper() {}

    public static Model498 of(Entity498 entity) {
        return new Model498(entity.getId(), entity.getField());
    }
}
