package fr.spacefox.perftests.quarkus.data.entity19;

import fr.spacefox.perftests.quarkus.core.service19.model.Model19;

final class Mapper {
    private Mapper() {}

    public static Model19 of(Entity19 entity) {
        return new Model19(entity.getId(), entity.getField());
    }
}
