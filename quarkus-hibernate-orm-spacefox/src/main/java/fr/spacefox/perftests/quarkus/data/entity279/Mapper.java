package fr.spacefox.perftests.quarkus.data.entity279;

import fr.spacefox.perftests.quarkus.core.service279.model.Model279;

final class Mapper {
    private Mapper() {}

    public static Model279 of(Entity279 entity) {
        return new Model279(entity.getId(), entity.getField());
    }
}
