package fr.spacefox.perftests.quarkus.data.entity613;

import fr.spacefox.perftests.quarkus.core.service613.model.Model613;

final class Mapper {
    private Mapper() {}

    public static Model613 of(Entity613 entity) {
        return new Model613(entity.getId(), entity.getField());
    }
}
