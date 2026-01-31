package fr.spacefox.perftests.quarkus.data.entity767;

import fr.spacefox.perftests.quarkus.core.service767.model.Model767;

final class Mapper {
    private Mapper() {}

    public static Model767 of(Entity767 entity) {
        return new Model767(entity.getId(), entity.getField());
    }
}
