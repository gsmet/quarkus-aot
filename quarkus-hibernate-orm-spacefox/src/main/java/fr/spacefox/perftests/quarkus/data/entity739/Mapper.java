package fr.spacefox.perftests.quarkus.data.entity739;

import fr.spacefox.perftests.quarkus.core.service739.model.Model739;

final class Mapper {
    private Mapper() {}

    public static Model739 of(Entity739 entity) {
        return new Model739(entity.getId(), entity.getField());
    }
}
