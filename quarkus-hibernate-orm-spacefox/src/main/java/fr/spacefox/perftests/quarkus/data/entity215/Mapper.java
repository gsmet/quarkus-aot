package fr.spacefox.perftests.quarkus.data.entity215;

import fr.spacefox.perftests.quarkus.core.service215.model.Model215;

final class Mapper {
    private Mapper() {}

    public static Model215 of(Entity215 entity) {
        return new Model215(entity.getId(), entity.getField());
    }
}
