package fr.spacefox.perftests.quarkus.data.entity83;

import fr.spacefox.perftests.quarkus.core.service83.model.Model83;

final class Mapper {
    private Mapper() {}

    public static Model83 of(Entity83 entity) {
        return new Model83(entity.getId(), entity.getField());
    }
}
