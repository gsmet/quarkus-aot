package fr.spacefox.perftests.quarkus.data.entity9;

import fr.spacefox.perftests.quarkus.core.service9.model.Model9;

final class Mapper {
    private Mapper() {}

    public static Model9 of(Entity9 entity) {
        return new Model9(entity.getId(), entity.getField());
    }
}
