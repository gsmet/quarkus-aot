package fr.spacefox.perftests.quarkus.data.entity359;

import fr.spacefox.perftests.quarkus.core.service359.model.Model359;

final class Mapper {
    private Mapper() {}

    public static Model359 of(Entity359 entity) {
        return new Model359(entity.getId(), entity.getField());
    }
}
