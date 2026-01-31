package fr.spacefox.perftests.quarkus.data.entity790;

import fr.spacefox.perftests.quarkus.core.service790.model.Model790;

final class Mapper {
    private Mapper() {}

    public static Model790 of(Entity790 entity) {
        return new Model790(entity.getId(), entity.getField());
    }
}
