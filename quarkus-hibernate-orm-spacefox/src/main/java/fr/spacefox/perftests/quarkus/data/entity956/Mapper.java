package fr.spacefox.perftests.quarkus.data.entity956;

import fr.spacefox.perftests.quarkus.core.service956.model.Model956;

final class Mapper {
    private Mapper() {}

    public static Model956 of(Entity956 entity) {
        return new Model956(entity.getId(), entity.getField());
    }
}
