package fr.spacefox.perftests.quarkus.data.entity869;

import fr.spacefox.perftests.quarkus.core.service869.model.Model869;

final class Mapper {
    private Mapper() {}

    public static Model869 of(Entity869 entity) {
        return new Model869(entity.getId(), entity.getField());
    }
}
