package fr.spacefox.perftests.quarkus.data.entity688;

import fr.spacefox.perftests.quarkus.core.service688.model.Model688;

final class Mapper {
    private Mapper() {}

    public static Model688 of(Entity688 entity) {
        return new Model688(entity.getId(), entity.getField());
    }
}
