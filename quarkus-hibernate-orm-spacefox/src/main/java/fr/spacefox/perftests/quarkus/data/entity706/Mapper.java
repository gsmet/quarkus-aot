package fr.spacefox.perftests.quarkus.data.entity706;

import fr.spacefox.perftests.quarkus.core.service706.model.Model706;

final class Mapper {
    private Mapper() {}

    public static Model706 of(Entity706 entity) {
        return new Model706(entity.getId(), entity.getField());
    }
}
