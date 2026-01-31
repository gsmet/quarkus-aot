package fr.spacefox.perftests.quarkus.data.entity314;

import fr.spacefox.perftests.quarkus.core.service314.model.Model314;

final class Mapper {
    private Mapper() {}

    public static Model314 of(Entity314 entity) {
        return new Model314(entity.getId(), entity.getField());
    }
}
