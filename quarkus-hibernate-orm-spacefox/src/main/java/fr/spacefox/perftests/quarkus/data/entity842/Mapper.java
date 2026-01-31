package fr.spacefox.perftests.quarkus.data.entity842;

import fr.spacefox.perftests.quarkus.core.service842.model.Model842;

final class Mapper {
    private Mapper() {}

    public static Model842 of(Entity842 entity) {
        return new Model842(entity.getId(), entity.getField());
    }
}
