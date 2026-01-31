package fr.spacefox.perftests.quarkus.data.entity590;

import fr.spacefox.perftests.quarkus.core.service590.model.Model590;

final class Mapper {
    private Mapper() {}

    public static Model590 of(Entity590 entity) {
        return new Model590(entity.getId(), entity.getField());
    }
}
