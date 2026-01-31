package fr.spacefox.perftests.quarkus.data.entity905;

import fr.spacefox.perftests.quarkus.core.service905.model.Model905;

final class Mapper {
    private Mapper() {}

    public static Model905 of(Entity905 entity) {
        return new Model905(entity.getId(), entity.getField());
    }
}
