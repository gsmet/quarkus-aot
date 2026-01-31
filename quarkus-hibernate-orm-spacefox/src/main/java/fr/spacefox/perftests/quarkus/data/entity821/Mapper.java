package fr.spacefox.perftests.quarkus.data.entity821;

import fr.spacefox.perftests.quarkus.core.service821.model.Model821;

final class Mapper {
    private Mapper() {}

    public static Model821 of(Entity821 entity) {
        return new Model821(entity.getId(), entity.getField());
    }
}
