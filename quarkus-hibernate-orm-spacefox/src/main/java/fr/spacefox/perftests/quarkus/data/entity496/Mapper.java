package fr.spacefox.perftests.quarkus.data.entity496;

import fr.spacefox.perftests.quarkus.core.service496.model.Model496;

final class Mapper {
    private Mapper() {}

    public static Model496 of(Entity496 entity) {
        return new Model496(entity.getId(), entity.getField());
    }
}
