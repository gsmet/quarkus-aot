package fr.spacefox.perftests.quarkus.data.entity686;

import fr.spacefox.perftests.quarkus.core.service686.model.Model686;

final class Mapper {
    private Mapper() {}

    public static Model686 of(Entity686 entity) {
        return new Model686(entity.getId(), entity.getField());
    }
}
