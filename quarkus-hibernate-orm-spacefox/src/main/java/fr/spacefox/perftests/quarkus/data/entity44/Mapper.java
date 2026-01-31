package fr.spacefox.perftests.quarkus.data.entity44;

import fr.spacefox.perftests.quarkus.core.service44.model.Model44;

final class Mapper {
    private Mapper() {}

    public static Model44 of(Entity44 entity) {
        return new Model44(entity.getId(), entity.getField());
    }
}
