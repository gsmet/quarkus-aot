package fr.spacefox.perftests.quarkus.data.entity949;

import fr.spacefox.perftests.quarkus.core.service949.model.Model949;

final class Mapper {
    private Mapper() {}

    public static Model949 of(Entity949 entity) {
        return new Model949(entity.getId(), entity.getField());
    }
}
