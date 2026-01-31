package fr.spacefox.perftests.quarkus.data.entity41;

import fr.spacefox.perftests.quarkus.core.service41.model.Model41;

final class Mapper {
    private Mapper() {}

    public static Model41 of(Entity41 entity) {
        return new Model41(entity.getId(), entity.getField());
    }
}
