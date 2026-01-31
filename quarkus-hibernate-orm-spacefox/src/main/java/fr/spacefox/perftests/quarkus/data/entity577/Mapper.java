package fr.spacefox.perftests.quarkus.data.entity577;

import fr.spacefox.perftests.quarkus.core.service577.model.Model577;

final class Mapper {
    private Mapper() {}

    public static Model577 of(Entity577 entity) {
        return new Model577(entity.getId(), entity.getField());
    }
}
