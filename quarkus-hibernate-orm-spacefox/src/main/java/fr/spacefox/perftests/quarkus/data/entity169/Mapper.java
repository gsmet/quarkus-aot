package fr.spacefox.perftests.quarkus.data.entity169;

import fr.spacefox.perftests.quarkus.core.service169.model.Model169;

final class Mapper {
    private Mapper() {}

    public static Model169 of(Entity169 entity) {
        return new Model169(entity.getId(), entity.getField());
    }
}
