package fr.spacefox.perftests.quarkus.data.entity992;

import fr.spacefox.perftests.quarkus.core.service992.model.Model992;

final class Mapper {
    private Mapper() {}

    public static Model992 of(Entity992 entity) {
        return new Model992(entity.getId(), entity.getField());
    }
}
