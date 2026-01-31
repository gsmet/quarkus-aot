package fr.spacefox.perftests.quarkus.data.entity897;

import fr.spacefox.perftests.quarkus.core.service897.model.Model897;

final class Mapper {
    private Mapper() {}

    public static Model897 of(Entity897 entity) {
        return new Model897(entity.getId(), entity.getField());
    }
}
