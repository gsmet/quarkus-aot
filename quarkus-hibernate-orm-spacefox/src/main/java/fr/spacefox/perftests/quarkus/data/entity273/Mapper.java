package fr.spacefox.perftests.quarkus.data.entity273;

import fr.spacefox.perftests.quarkus.core.service273.model.Model273;

final class Mapper {
    private Mapper() {}

    public static Model273 of(Entity273 entity) {
        return new Model273(entity.getId(), entity.getField());
    }
}
