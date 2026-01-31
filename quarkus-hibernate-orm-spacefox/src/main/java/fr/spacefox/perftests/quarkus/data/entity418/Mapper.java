package fr.spacefox.perftests.quarkus.data.entity418;

import fr.spacefox.perftests.quarkus.core.service418.model.Model418;

final class Mapper {
    private Mapper() {}

    public static Model418 of(Entity418 entity) {
        return new Model418(entity.getId(), entity.getField());
    }
}
